package org.testleaf.week3.day1;

import java.io.CharArrayReader;

public class ReverseString {
    public static void main(String[] args) {
        String str="TestLeaf";
        char[] charArray=str.toCharArray();
        for (int i = charArray.length-1; i >=0; i --) {
            System.out.println(charArray[i]);
        }
    }

}
