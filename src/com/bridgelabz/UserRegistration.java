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
/*
 UC3: User need to enter Valid Lastname
      Eg:-abc.xyz@bl.co.in (Given in UC2) should match the Pattern
*/
        boolean result3 = Pattern.matches("[a-z]{3,}[.][a-z0-9]*@[a-z]{2,}[.][a-z]{2,}[.]*[a-z]+","drisya.athul23@gmail.com");
        if (result3)
            System.out.println("Valid Email Address");
        else
            System.out.println("Invalid Email Address");
/*
 UC4: Pre-Defined Mobile Format
*/
        boolean result4 = Pattern.matches("^[+][0-9]{2}\\s[6-9][0-9]{9}","+91 9919819801");
        if (result4)
            System.out.println("Valid Mobile Format");
        else
            System.out.println("Invalid Mobile Format");
/*
 UC5: Pre-Defined Password Rule1-> Minimum 8 characters
*/
        boolean result5 = Pattern.matches("^[a-z]{8,}$","password");
        if (result5)
            System.out.println("Valid Password-1");
        else
            System.out.println("Invalid Password-1");
    }
}
