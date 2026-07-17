package org.testleaf.week3.day2;

public class Button extends WebElement{
    public RadioButton submit() {
        System.out.println("Submitted Successfully");
        return null;
    }

    public static void main(String[] args) {
        Button a=new Button();
        a.click();
        a.setText(null);
        a.submit();
    }

}

