package com.zhanarbek;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        //Thread of main
        System.out.println("Main: "+Thread.currentThread().getName());

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}

class MyThread extends Thread {
    @Override
    public  void run() {
        System.out.println("MyThread: "+Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("MyRunnable: "+Thread.currentThread().getName());
    }
}
