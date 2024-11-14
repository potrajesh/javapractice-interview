package com.ComParbleAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Login implements Comparator<Login> {

    private String userName;

    public Login(String userName) {
        this.userName=userName;
    }

    public void setUserName(){
        this.userName= userName;
    }
    public String getUserName(){
        return userName;
    }
    public String toString(){
        return userName;
    }
    public int compare(Login l1,Login l2){
        return l1.getUserName().compareTo(l2.getUserName());
    }

    public static void main(String[] args) {

        ArrayList<Login> logins = new ArrayList<>();
        logins.add(new Login("india"));
        logins.add(new Login("usa"));
        logins.add(new Login("africa"));

        Collections.sort(logins,new Login("user"));

        System.out.println(logins);

    }
}
