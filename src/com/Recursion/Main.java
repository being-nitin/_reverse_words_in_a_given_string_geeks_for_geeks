package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// java program to reverse words in a given String
        String str = "i.would.like.to.have.some.tea";
        String st = reverse(str);
        System.out.println(st);

    }
    public static String reverse(String str){
        String s[] = str.split("\\.");
        String rev = "";
        for(int i=s.length-1;i>0;i--){
            rev = rev+s[i]+".";
        }
        return rev +s[0];
    }
}
// split method will split the String in a parts after getting a regex expression.