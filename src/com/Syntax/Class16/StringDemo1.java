package com.Syntax.Class16;

public class StringDemo1 {
    public static void main(String[] args) {
        String str="123456!DFgsDSF$";
                System.out.println(str.replaceAll("[0-9]",""));
                System.out.println(str.replaceAll("[A-Z]",""));
                System.out.println(str.replaceAll("[a-z]",""));
                System.out.println(str.replaceAll("[!-/]",""));
                System.out.println(str.replaceAll("[A-Za-z0-9]",""));
                System.out.println(str.replaceAll("^[A-Za-z0-9]",""));


    }
}
