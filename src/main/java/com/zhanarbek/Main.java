package com.zhanarbek;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Creating a thread
        MyThread thread = new MyThread();
        // Launching a thread
        thread.start();
//        making main thread wait for its secondary thread for no time or given time
//        Thread.sleep(3000);
        System.out.println("End of mainThread");
    }


}

class MyThread extends Thread{
    int i = 0;
    @Override
    public void run() {
        for(int i = 0; i < 1_000_000; i++){
            try{
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println("This is thread "+ i);

    }
}
