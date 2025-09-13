package com.ok.java.mutithreading;

public class withMultithreading {
    public static void main(String[] args) {
        long startime = System.currentTimeMillis();
        NumberCounter thread1 = new NumberCounter();
        thread1.start();

        SumCalculator sumCalculator = new SumCalculator();
        Thread thread2 = new Thread(sumCalculator);
        thread2.start();
        System.out.println("Time taken:" + (System.currentTimeMillis()-startime) +"ms");
    }
}
