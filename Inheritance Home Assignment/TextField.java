package org.testleaf.week3.day2;

public class TextField extends WebElement {
   
   String str =  "Sruthi";
        public String getText() {
        return str;
    }
     public static void main(String[] args) {
    TextField a=new TextField();
        a.setText("Sruthi");
        

}
   
}
