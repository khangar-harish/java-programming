package com.hash.fanduel;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class UserStatistics{

    private final long key;
    private final long value;
    private final Instant dateGenerated;

    public UserStatistics(long key, long value) {
        this.key = key;
        this.value = value;
        this.dateGenerated = Instant.now();
    }
    public static UserStatistics calculate(long key){
        long responseFromThirdPartyAPI = 0;
        try{
            TimeUnit.SECONDS.sleep(10);
            responseFromThirdPartyAPI = 42;
        }catch (InterruptedException ex){}

        return new UserStatistics(key, responseFromThirdPartyAPI);
    }

    public long getKey() {
        return key;
    }
    public long getValue() {
        return value;
    }
    public Instant getDateGenerated() {
        return dateGenerated;
    }
}
