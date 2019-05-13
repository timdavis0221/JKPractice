package com.jk;

public class HealthReport implements Report {
    @Override
    public void load() {
        System.out.println("loading my health data ...");
    }

    @Override
    public void print() {
        System.out.println("printing my health data ...");
    }
}
