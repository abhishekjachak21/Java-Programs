package com.learn.arraylist;
import java.util.ArrayList;

public class PlayWithAL {
    public static void main(String[] args){

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(45);
        arr1.add(23);
        arr1.add(2,67);

        System.out.println(arr1);
        System.out.println(arr1.set(2,22222));

        System.out.println(arr1.get(2));

        System.out.println(arr1.get(2));
    }
}
//add, addAll, remove, removeAll, clear, contains, size, get, set, indexOf, iterator