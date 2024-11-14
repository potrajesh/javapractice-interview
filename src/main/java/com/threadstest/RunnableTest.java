package com.threadstest;

public class RunnableTest implements Runnable{

    @Override
    public void run() {
        System.out.println("RunnableTest calling");
    }

    public static void main(String[] args) {
        RunnableTest runnableTest = new RunnableTest();
        Thread thread = new Thread(runnableTest);
        thread.start();

    }
}
