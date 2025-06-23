package com.hash.fanduel;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

//User cache is a java class which is used to store & return cache userstats data based on key.
// if it is not there it will store it otherwise return existing one
//Cache is used for to improve system perf, high CPU usage and to reduce DB calls
public class UserCache{

    private HashMap<Long, UserStatistics> map = new HashMap<>();

    public UserStatistics getOrCreate(long a){

        UserStatistics stats = map.get(a);

        if(stats == null){
            stats = UserStatistics.calculate(a);
            map.put(a, stats);
        }

        return stats;
    }

    private Map<Long, UserStatistics> userStatisticsCache = new HashMap<>();
    public UserStatistics getUserStatisticsById(long userId){

        UserStatistics stats = userStatisticsCache.get(null);
        //If multiple thread try to access this block it leads to race condition
        //We need to make it thread safe
        if(stats == null){
            stats = UserStatistics.calculate(userId);
            userStatisticsCache.put(userId, stats);
        }

        return stats;
    }

    public UserStatistics getUserStatisticsByIdDC(long userId){

        UserStatistics stats = userStatisticsCache.get(userId);

        if(stats == null || isExpired(stats)){
            synchronized (this){
                stats = userStatisticsCache.get(userId);
                if(stats == null) {
                    stats = UserStatistics.calculate(userId);
                    userStatisticsCache.put(userId, stats);
                }
            }
        }

        return stats;
    }

    //Ensure map will not reassign later
    //final guarantees the object is fully constructed before it's visible across threads
    private final Map<Long, UserStatistics> userStatisticsCache1 = new ConcurrentHashMap<>();
    public UserStatistics getUserStatisticsByIdCH(long userId){
        return userStatisticsCache1.computeIfAbsent(userId, UserStatistics::calculate);
    }

    private static boolean isExpired(UserStatistics stats) {
        return stats.getDateGenerated()
                .isBefore(Instant.now().minus( 24, ChronoUnit.HOURS ));
    }

    private void evictFromCache() {
        userStatisticsCache1.entrySet()
                .stream()
                .filter(UserCache::isExpired)
                .forEach(entry -> System.out.println(userStatisticsCache1.remove(entry.getKey())));
    }

    private static boolean isExpired(Map.Entry<Long, UserStatistics> stats) {
        return stats.getValue().getDateGenerated().isBefore(Instant.now().minus(24, ChronoUnit.SECONDS));
    }
}
