package org.testleaf.week3.day2;

public class Safari extends Browser {

    public void readerMode(){
        System.out.println("Reader Mode is On");

    }
    public void fullScreenMode(){
        System.out.println("Full Screen Mode is On");
    
    }
    public static void main(String[] args) {
        Safari c=new Safari();
        c.openURL();
        c.readerMode();
        c.fullScreenMode();
        c.navigateBack();
        c.closeBrowser();
    }

}
