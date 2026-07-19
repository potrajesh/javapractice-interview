package allinterviews.prcatice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Sorting {

    public static void main(String[] args) {
        //integers sort
       /* List<Integer> list = Arrays.asList(12, 3, 1, 6);
        Collections.sort(list);
        System.out.println(list);
        names sort
        List<String> list = Arrays.asList("ravi","rajesh","hello","ant");
        Collections.sort(list);
        System.out.println(list);
       */
        //output : [ant, hello, rajesh, ravi]
        Student rajes = new Student(1, "rajes");
        Student oldmahesh = new Student(1, "mahesh");
        Student newmahesh = new Student(12, "mahesh");
        Student ant = new Student(12, "ant");


        List<Student> list = Arrays.asList(rajes, oldmahesh, newmahesh, ant);


        TreeSet t = new TreeSet<>(new NameComparator());t.addAll(list);
        System.out.println(t);
      //output:
      //[Student{id=12, name='ant'}, Student{id=1, name='mahesh'}, Student{id=1, name='rajes'}]

    }
}
