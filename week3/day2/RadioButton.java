package org.testleaf.week3.day2;

public class RadioButton extends Button{

    public void selectRadioButton() {
        System.out.println("Radio Button is Selected");
    }

    public static void main(String[] args) {
        RadioButton a=new RadioButton();
        a.selectRadioButton();
        a.submit();
        
    }
}
