package com.company;

public class Main {

    public static void main(String[] args) {
        //2
        long start1;
        long stop1;
        long start2;
        long stop2;

        start1 = System.currentTimeMillis();
        String text1 = "";
        for(int i=0;i<50000;i++) {
            text1+=i;
        }
        stop1 = System.currentTimeMillis();
        System.out.println("Time1: "+(stop1-start1)+"ms - dla +");

        start2 = System.currentTimeMillis();
        StringBuilder text2 = new StringBuilder();
        for(int i=0;i<50000;i++) {
            text2.append(i);
        }
        stop2 = System.currentTimeMillis();
        System.out.println("Time2: "+(stop2-start2)+"ms - dla StringBuildera");

        //3
        SzyfrCezara szyfr = new SzyfrCezara(10);
        String wiadomosc = "Co wolno Adminowi, to nie Uzytkownikowi";
        System.out.println(szyfr.szyfruj(wiadomosc));
    }
}
