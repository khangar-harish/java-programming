package com.hash.fanduel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class StatsCalculator {

    private final Executor executor;

    public StatsCalculator(int numThreads){
        executor = Executors.newFixedThreadPool(numThreads);
    }

    public List<UserStatistics> statsFor(long... userIds) throws InterruptedException {

        final CountDownLatch latch = new CountDownLatch(userIds.length);
        final List<UserStatistics> userStats = new ArrayList<>(userIds.length);

        for(final long id : userIds){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    userStats.add(UserStatistics.calculate(id));
                    latch.countDown();
                }
            });
        }
        latch.await();
        return userStats;
    }
}

