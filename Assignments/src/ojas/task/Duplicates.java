package ojas.task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

 

public class Duplicates {

 

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(13);
        lst.add(84);
        lst.add(84);
        lst.add(16);
        lst.add(38);
        lst.add(16);
        System.out.println("List : " + lst);
        Set<Integer> sl = new HashSet<Integer>();
        Set<Integer> tl = new HashSet<Integer>();

 

        for (Integer element : lst) {
            if (sl.add(element)) {
                System.out.println("added to s1: " + element);
            } else {
                System.out.println("duplicated : " + element);
                tl.add(element);
            }
        }

    }
}

    

 
