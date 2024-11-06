package com.exception.practice;

public class UserDefinedTest {
    public static void main(String[] args) throws UserDefinedException {
        try{
            int data = 2/0;
        }
        catch (Exception e){
          throw new UserDefinedException("userdefined");
        }
    }
}
