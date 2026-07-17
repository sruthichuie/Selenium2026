package org.testleaf.week3.day1;

public class PrintDuplicates {
    public static void main(String[] args) {
        int num[]={2,5,7,7,5,9,2,3};
         for (int i = 0; i < num.length; i++) {
          for (int a =i+1; a < num.length; a++) {  
            if (num[i]==num[a]) {
        System.out.println(+num[i]);


}
          }
        }
    }


}
