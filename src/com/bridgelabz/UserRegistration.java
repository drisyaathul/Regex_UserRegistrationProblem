package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {

        System.out.println("*** Welcome to User Registration Problem ***");
/*
 UC1: User need to enter Valid firstname
*/
        boolean result1 = Pattern.matches("^[A-Z][a-z]{2,}","Drisya");
        if (result1)
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");
/*
 UC2: User need to enter Valid Lastname
*/
        boolean result2 = Pattern.matches("^[A-Z][a-z]{2,}","Athul");
        if (result2)
            System.out.println("Valid Last Name");
        else
            System.out.println("Invalid Last Name");
    }
}
