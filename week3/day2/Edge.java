package org.testleaf.week3.day2;

public class Edge extends Browser {

    public void takeSnap(){
        System.out.println("Taking a snapshot");

    }
    public void clearCookies(){
        System.out.println("Clearing Cookies");
    
    }
    public static void main(String[] args) {
        Edge b=new Edge();
        b.openURL();
        b.takeSnap();
        b.clearCookies();
        b.navigateBack();
        b.closeBrowser();
    }


}
