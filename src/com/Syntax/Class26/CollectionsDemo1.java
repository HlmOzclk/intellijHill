package com.Syntax.Class26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        String name="Yazgul";
        String name2="Farah";
        // Not scalable if we have to store large amount of data
        // Arrays can be a good option to tackle this problem

        String [] names={"Yazgul","Andrew"};

        String [] names2=new String[1000];
        names2[0]="Elena";
        names2[2]="Andrew";
        System.out.println(Arrays.toString(names2));
        ArrayList<String> syntaxStudents=new ArrayList<>();
        // ArrayList=> Name of the class
        // <> diamond operator
        //String data type
        syntaxStudents.add("Dimitry");
        syntaxStudents.add("mike");
        System.out.println(syntaxStudents);

    }
}
