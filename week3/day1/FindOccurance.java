package org.testleaf.week3.day1;

import javax.xml.stream.events.Characters;

public class FindOccurance {
    public static void main(String[] args) {
        String name= "TestLeaf";
        

        char[] characters=name.toCharArray();
        int count = 0;
         for (char i : characters) {
            if (i =='e') {
            count++;
        }

         }
          
         System.out.println("Number Of Occurrences of 'e': " + count);
       
    }


        }
        

