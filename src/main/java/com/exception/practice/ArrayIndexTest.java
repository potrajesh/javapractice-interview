package com.exception.practice;

import java.util.Scanner;

public class ArrayIndexTest {
    public static void main(String[] args) throws UserDefinedException {
        //how to handle arrayindex out of bound
        //try with resources example
        try(Scanner scanner = new Scanner(System.in)) {
            Integer arr[]= {1,2,3};
            System.out.println(arr[4]);
        }
        catch(Exception e){
            throw new UserDefinedException("please get within 5 elements");
        }

    }
}
