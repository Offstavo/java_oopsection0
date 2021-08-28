package com.example.oopsection0;

public class Main {
    public static void main(String[] args) {

        //Instanciating a class
        Phone iphone = new Phone();
        iphone.name = "iphone 11";
        System.out.println(iphone.name);

        iphone.memoryRam = 8;

        iphone.playMusic("Our wings are burning");
        iphone.playMusic("Lamenting Kiss");
    }
}
