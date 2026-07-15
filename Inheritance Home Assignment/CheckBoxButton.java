package org.testleaf.week3.day2;

public class CheckBoxButton extends Button{
    public void clickCheckButton() {
        System.out.println("Check Box Button is Clicked");
    } 

public static void main(String[] args) {
    CheckBoxButton a=new CheckBoxButton();
        a.clickCheckButton();
        a.submit();
    }
}

