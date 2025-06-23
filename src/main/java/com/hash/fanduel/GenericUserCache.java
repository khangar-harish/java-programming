package com.hash.fanduel;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class GenericUserCache <K, V>{

    private final Map<K, V> genericCache = new HashMap<>();
    private final Function<K, V> calculation;

    public GenericUserCache(Function<K, V> calculation) {
        this.calculation = calculation;
    }

    public V getGenericDataById(final K userId ){

        V stats = genericCache.get(userId);
        //If multiple thread try to access this block it leads to race condition
        //We need to make it thread safe
        if(stats == null){
            stats = this.calculation.apply(userId);
            genericCache.put(userId, stats);
        }

        return stats;
    }

    public V getGenericDataById1(final K userId ){
        return genericCache.computeIfAbsent(userId, calculation);
    }


    public V getOrCreate( final K userId ) {
        V stats = genericCache.get( userId );
        if ( stats == null) {
            try {
                synchronized ( this ) {
                    stats = this.calculation.apply(userId);
                    genericCache.put( userId, stats );
                    return stats;
                }
            } catch ( Exception e ) {
                e.getMessage();
            }
        }
        return stats;
    }
}
