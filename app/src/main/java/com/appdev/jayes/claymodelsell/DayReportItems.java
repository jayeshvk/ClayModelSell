package com.appdev.jayes.claymodelsell;

public class DayReportItems {
    private String receiptNo;
    private String name;
    private String balance;
    private String price;

    public DayReportItems(String receiptNo, String name, String balance, String price) {
        this.receiptNo = receiptNo;
        this.name = name;
        this.balance = balance;
        this.price = price;
    }

    public DayReportItems() {

    }

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
