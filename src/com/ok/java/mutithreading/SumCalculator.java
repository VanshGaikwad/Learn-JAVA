package com.ok.java.mutithreading;

public class SumCalculator implements Runnable {
    @Override
    public void run() {
        long sum = 0;
        for (int i = 1; i < 1000000000; i++) {
            sum +=1;
        }
        System.out.println("Sum:"+sum);
    }
}
