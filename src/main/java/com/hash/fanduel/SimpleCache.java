package com.hash.fanduel;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class SimpleCache {
    //private UserStatistics userStatistics;
    private Logger looger = Logger.getLogger(SimpleCache.class.getName());
    private HashMap<Long, UserStatistics> userSatisticsCache = new HashMap<>();

    private ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    public SimpleCache( ) {
        //this.userStatistics = userStatistics;
        scheduler.schedule( this::evictFromCache, 30, TimeUnit.SECONDS );
        //scheduler.scheduleAtFixedRate(this::evictFromCache, 1, 1, TimeUnit.HOURS);
    }
    public UserStatistics getOrCreate( long userId ) {
        UserStatistics stats = userSatisticsCache.get( userId );
        if ( stats == null || isExpired(stats)) {
            try {
                synchronized ( this ) {
                    stats = UserStatistics.calculate( userId );
                    userSatisticsCache.put( userId, stats );
                    return stats;
                }
            } catch ( Exception e ) {
                looger.info("UserStatistics Exception occurred");
            }
        }
        return stats;
    }

    private static boolean isExpired(final UserStatistics userStatistics) {
        return userStatistics.getDateGenerated()
                .isBefore( Instant.now().minus( 30, ChronoUnit.SECONDS ) );
    }

    private void evictFromCache() {
        userSatisticsCache.entrySet()
                .stream()
                .filter(SimpleCache::shouldEvictRecord)
                .forEach(entry -> System.out.println(userSatisticsCache.remove(entry.getKey())));
    }

    private static boolean shouldEvictRecord(Map.Entry<Long, UserStatistics> longUserStatisticsEntry) {
        return longUserStatisticsEntry.getValue().getDateGenerated().isBefore(Instant.now().minus(24, ChronoUnit.HOURS));
    }


}

