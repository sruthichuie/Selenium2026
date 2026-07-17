package org.testleaf.week3.day2;

public abstract class CanaraBank implements Payments {

    public void recordPaymentDetails() {
        System.out.println("Payment details recorded successfully");

    }

    public static void main(String[] args) {
        CanaraBank cb=new Amazon();
        cb.recordPaymentDetails();
        cb.cashOnDelivery();
        cb.upiPayments();
        cb.cardPayments();
        cb.internetBanking();
    }
}
    
