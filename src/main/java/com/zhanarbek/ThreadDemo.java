package com.zhanarbek;

public class ThreadDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Summation1 sum1 = new Summation1();
        sum1.run();
        Summation2 sum2 = new Summation2();
        sum2.run();
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time without multithreading = "+ timeElapsed + " milliseconds");

        startTime = System.currentTimeMillis();
        Thread t1 = new Thread(new Summation1());
        Thread t2 = new Thread(new Summation2());
        t1.start();
        t2.start();
        while(t1.isAlive() || t2.isAlive()) {
        }
        endTime = System.currentTimeMillis();
        timeElapsed = endTime - startTime;
        System.out.println("Execution time without multithreading = "+ timeElapsed + " milliseconds");
    }
}

class Summation1 implements Runnable{
    @Override
    public void run() {
        summation();
    }
    public void summation() {
        long a = 0;
        for(int i = 0; i <= 10000; i++){
            for(int j = 0; j <= 10000; j++){
                a++;
            }
        }
        System.out.println("Sum1 = "+ a);
    }
}

class Summation2 implements Runnable{
    @Override
    public void run() {
        summation();
    }
    public void summation(){
        long a=2;
        for (int i=0; i<=10000;i++) {
            for (int j=0; j<=10000;j++) {
                a++;
            }
        }
        System.out.println("Sum2 is : "+ a);
    }
}
