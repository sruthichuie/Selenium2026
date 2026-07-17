package org.testleaf.week3.day2;

public class ReportStep1 extends ReportStep {
    
    public void reportStep1(String msg, String status, Boolean snap) {
     
   
        System.out.println("Message:" + msg);
        System.out.println("Status:" + status);
       
    if (snap) {
        System.out.println("Snapshot: Taken");
    } else {
        System.out.println("Snapshot: Not Taken");
    }
}
public static void main(String[] args) {
    ReportStep1 a= new ReportStep1();
    a.reportStep("Login Successfull", "Pass");
    a.reportStep1("Login successful", "PASS", true);
    a.reportStep1("Invalid password", "FAIL", false);

}
}