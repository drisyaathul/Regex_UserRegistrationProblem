package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        System.out.println("*** Welcome to User Registration Problem ***");
        /*
         UC1: User need to enter Valid firstname
         */
//        Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}"); //For Reference
//        Matcher matcher = pattern.matcher("Drisya");  //For Reference

        boolean result1 = Pattern.matches("^[A-Z][a-z]{2,}","Drisya");
        if (result1 == true)
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");
    }
}
