package com.polymorphism;

//order diff
//size diff
//types diff
class Calculation3 {

    void sum(int a, int b) {
        System.out.println("first");
    }

    void sum(long a, long b) {
        System.out.println("second");
    }

    public static void main(String args[]) {
        Calculation3 obj = new Calculation3();
        obj.sum(20, 20);
    }

}