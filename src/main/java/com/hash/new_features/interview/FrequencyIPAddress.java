package com.hash.new_features.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyIPAddress {

    public static void main(String[] args) {
        // Test cases
        String[] logEntries1 = {"192.168.1.1", "10.0.0.1", "192.168.1.1", "10.0.0.2", "192.168.1.1", "10.0.0.1"};
        System.out.println("Most used IP: " + findMostUsedIPAddress(logEntries1));  // Output: 192.168.1.1
        System.out.println("Most used IP: " + findMostUsedIPAddress1(logEntries1));

        String[] logEntries2 = {"192.168.1.2", "10.0.0.1", "10.0.0.2", "10.0.0.1", "10.0.0.2", "10.0.0.2"};
        System.out.println("Most used IP: " + findMostUsedIPAddress(logEntries2));  // Output: 10.0.0.2
        System.out.println("Most used IP: " + findMostUsedIPAddress1(logEntries2));

        String[] logEntries3 = {};
        System.out.println("Most used IP: " + findMostUsedIPAddress(logEntries3));  // Output: null
        System.out.println("Most used IP: " + findMostUsedIPAddress1(logEntries3));

        String[] logEntries4 = {"127.0.0.1"};
        System.out.println("Most used IP: " + findMostUsedIPAddress(logEntries4));  // Output: 127.0.0.1
        System.out.println("Most used IP: " + findMostUsedIPAddress1(logEntries4));

        String[] logEntries5 = {"10.0.0.1", "10.0.0.1", "10.0.0.2"};
        System.out.println("Most used IP: " + findMostUsedIPAddress(logEntries5));  // Output: 10.0.0.1
        System.out.println("Most used IP: " + findMostUsedIPAddress1(logEntries5));
    }

    private static String findMostUsedIPAddress(String[] logEntries) {

        if (logEntries == null || logEntries.length == 0) {
            return null;
        }

        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(logEntries).forEach(ip -> map.compute(ip, (k, v) -> v == null ? 1 : v+1));

        return map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    private static String findMostUsedIPAddress1(String[] logEntries) {

        if (logEntries == null || logEntries.length == 0) {
            return null;
        }

        Map<String, Integer> map = new HashMap<>();

        for(String ip : logEntries){
            if(map.containsKey(ip)){
                map.put(ip, map.get(ip)+1);
            }else {
                map.put(ip, 1);
            }
        }

        return map.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

    }
}
