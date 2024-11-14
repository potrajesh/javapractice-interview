package com.threadstest;

public class ThreadsTest extends Thread{
    @Override
    public void run() {
        System.out.println("iam in run()");

    }

    public static void main(String[] args) {

        ThreadsTest threadsTest = new ThreadsTest();
        threadsTest.start();
    }

}
