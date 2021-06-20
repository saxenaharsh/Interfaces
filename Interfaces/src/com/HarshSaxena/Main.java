package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);

        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(987654321);
        timsPhone.powerOn();
        timsPhone.callPhone(987654321);
        timsPhone.answer();

    }
}
