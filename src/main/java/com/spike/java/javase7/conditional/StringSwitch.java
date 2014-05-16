package com.spike.java.javase7.conditional;

/**
 * Created by sajith
 * Created on 16/5/14.10:24 PM
 */
public class StringSwitch {
    public static void main(String[] args) {

        String test = "CDE";
        switch (test) {
            case "ABC":
                System.out.println("ABC Entered");
                break;
            case "CDE":
                System.out.println("CDE Entered");
                break;
            default:
                System.out.println("Enter either ABC or CDE");
        }


    }
}
