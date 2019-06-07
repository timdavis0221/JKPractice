package com.jk.thread;

public class Tester {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            System.out.println("main : " + index);
        }

        // an will save
        Thread worker = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("worker: " + i);
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("worker end");
            }
        };
        worker.start();

        // Thread with naming
        new MyThread().start();

        // Runnable in Thread with lambda
        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable : " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("main end");
    }
}

class MyThread extends Thread {
    public MyThread() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread : " + i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("MyThread is end");
    }
}
