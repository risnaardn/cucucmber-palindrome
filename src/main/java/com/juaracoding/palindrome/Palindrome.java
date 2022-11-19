package com.juaracoding.palindrome;

public class Palindrome {

    public static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if(str.equals(rev)){
            System.out.println("Palindrome");
            return true ;
        }else{
            System.out.println("-------------------------");
            System.out.println("Bukan Palindrome");
            return false;
        }
    }


    }
