package org.testleaf.week3.day2;

import org.openqa.selenium.bidi.module.Browser;

public class chrome extends Browser {

    public void openIncognito(){
        System.out.println("Opening Incognito mode");

    }
    public void ClearCache(){
        System.out.println("Clearing Cache");
    
    }
    public static void main(String[] args) {
        chrome a=new chrome();
        a.openURL();
        a.openIncognito();
        a.ClearCache();
        a.navigateBack();
        a.closeBrowser();
    }
}
