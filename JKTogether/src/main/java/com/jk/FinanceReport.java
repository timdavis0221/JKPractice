package com.jk;

public class FinanceReport implements Report {
    @Override
    public void load() {
        System.out.println("loading my finance data ...");
    }

    @Override
    public void print() {
        System.out.println("printing my finance data ...");
    }
}
