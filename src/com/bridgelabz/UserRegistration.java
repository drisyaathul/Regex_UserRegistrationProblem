package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {

        System.out.println("*** Welcome to User Registration Problem ***");
/*
 UC1: User need to enter Valid firstname
*/
        boolean result1 = Pattern.matches("^[A-Z][a-z]{2,}", "Drisya");
        if (result1)
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");
/*
 UC2: User need to enter Valid Lastname
*/
        boolean result2 = Pattern.matches("^[A-Z][a-z]{2,}", "Athul");
        if (result2)
            System.out.println("Valid Last Name");
        else
            System.out.println("Invalid Last Name");
/*
 UC3: User need to enter Valid Lastname
      Eg:-abc.xyz@bl.co.in (Given in UC2) should match the Pattern
*/
        boolean result3 = Pattern.matches("[a-z]{3,}[.][a-z0-9]*@[a-z]{2,}[.][a-z]{2,}[.]*[a-z]+", "drisya.athul23@gmail.com");
        if (result3)
            System.out.println("Valid Email Address");
        else
            System.out.println("Invalid Email Address");
/*
 UC4: Pre-Defined Mobile Format
*/
        boolean result4 = Pattern.matches("^[+][0-9]{2}\\s[6-9][0-9]{9}", "+91 9919819801");
        if (result4)
            System.out.println("Valid Mobile Format");
        else
            System.out.println("Invalid Mobile Format");
/*
 UC5: Pre-Defined Password Rule1-> Minimum 8 characters
*/
        boolean result5 = Pattern.matches("^[a-z]{8,}$", "password");
        if (result5)
            System.out.println("Valid Password-1");
        else
            System.out.println("Invalid Password-1");
/*
 UC6: Pre-Defined Password Rule2-> Should have at least 1 Uppercase
*/
        boolean result6 = Pattern.matches("^[A-Za-z]{8,}$", "PassWord");
        if (result6)
            System.out.println("Valid Password-2");
        else
            System.out.println("Invalid Password-2");
/*
 UC7: Pre-Defined Password Rule3-> Should have at least 1 Numeric Number
*/
        boolean result7 = Pattern.matches("^[A-Za-z0-9]{8,}$", "PassWord123");
        if (result7)
            System.out.println("Valid Password-3");
        else
            System.out.println("Invalid Password-3");
/*
 UC8: Pre-Defined Password Rule4-> Has exactly one special character
*/
        boolean result8 = Pattern.matches("^[A-Za-z0-9].{8,}$", "Pass_Word@123");
        if (result8)
            System.out.println("Valid Password-4");
        else
            System.out.println("Invalid Password-4");
/*
 UC9: Valid Sample Email Addresses
*/
        String test = "Sample Email Addresses : \n" +
                "//• 1. abc@yahoo.com,\n" +
                "//• 2. abc-100@yahoo.com,\n" +
                "//• 3. abc.100@yahoo.com,\n" +
                "//• 2. abc111@abc.com,\n" +
                "//• 4. abc-100@abc.net,\n" +
                "//• 5. abc.100@abc.com.au,\n" +
                "//• 6. abc@1.com,\n" +
                "//• 7. abc@gmail.com.com,\n" +
                "//• 8. abc+100@gmail.com,\n";

        Pattern pattern = Pattern.compile("[a-z0-9].+@[a-z0-9.]{2,}");
        Matcher matcher = pattern.matcher(test);

        System.out.println("Valid E-mail Addresses are :- ");
        while (matcher.find()) {
            String emailId = matcher.group();
            System.out.println(emailId);
        }
    }
}




