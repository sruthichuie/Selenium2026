package org.testleaf.week3.day1;

public class PrintIntersection {
    public static void main(String[] args) {
        int num[]={4,2,1,6,9};
        int num2[]={3,9,2,4,5};
        for (int i = 0; i < num.length; i++) {
        for (int a = 0; a < num2.length; a++) {
        if (num[i]==num2[a]) {
         System.out.println(+num[i]);   
        }
        }

        }

    }

}
