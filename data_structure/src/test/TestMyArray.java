package test;

import data_structure.MyArray;

import java.util.Arrays;

public class TestMyArray {

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
     myArray.add(4);
        int result = myArray.remove(2);
        System.out.println(result);
        myArray.show();
        int size = myArray.size();
        System.out.println(size);
    }
}
