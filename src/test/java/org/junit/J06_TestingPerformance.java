package org.junit;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class J06_TestingPerformance {
    @Test
    void prformance(){
        assertTimeout(Duration.ofMillis(10),()-> LongStream.rangeClosed(0,100000)
                .forEach(System.out::println));
    }
}
