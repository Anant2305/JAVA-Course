package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();
        System.out.println("************************");
        ITelephone anantsPhone;
        anantsPhone = new MobilePhone(853316);
        anantsPhone.powerOn();
        anantsPhone.callPhone(853316);
        anantsPhone.answer();

    }
}
