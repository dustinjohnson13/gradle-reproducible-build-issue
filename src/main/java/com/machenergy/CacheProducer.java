package com.machenergy;

import java.util.Arrays;

public class CacheProducer {

    public void postConstruct() {
        Arrays.asList("one", "two").forEach(one -> {
            Arrays.asList("three", "four").forEach(two -> {
                System.out.println(one);
                System.out.println(two);
            });
        });
    }
}
