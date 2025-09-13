package com.ok.java.mutithreading;

public class Mythread  extends Thread{
    private Counter counter;

    public  Mythread (Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i =0;i<1000;i++){
            counter.increment();
        }

    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        Mythread t1 = new Mythread(counter);
        Mythread t2 = new Mythread(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){

        }
        System.out.println(counter.getCount());
    }
}
class Counter{
    private int count = 0;

    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }

}
