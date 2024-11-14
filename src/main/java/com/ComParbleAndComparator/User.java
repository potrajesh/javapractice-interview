package com.ComParbleAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User implements Comparable<User>{

    private int id;
    public User(int i) {
        this.id=i;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString(){
        return "{"+id+"}";
    }
    @Override
    public int compareTo(User u){
        if(id== u.getId()){
            return 0;
        }
        if(id>u.getId()){
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        users.add(new User(12));
        users.add(new User(2));
        users.add(new User(3));
        Collections.sort(users);

        System.out.println(users);
    }
}
