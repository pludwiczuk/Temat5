package com.company;

public class SzyfrCezara {
    private String alfabet;
    private String zmienionyAlfabet;

    public SzyfrCezara(int klucz) {
        alfabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder za = new StringBuilder();
        char zn;
        int z;
        for(int i=0;i<26;i++) {
            zn = alfabet.charAt(i);
            if(((int)zn+klucz) > 90) {
                z = (int)zn + klucz - 90 + 64;
                za.append((char)z);
            }
            else {
                z=(int) zn + klucz;
                za.append((char)z);
            }
        }
        zmienionyAlfabet = za.toString();
    }
    public String szyfruj(String wiadomosc) {
        StringBuilder zakodowana = new StringBuilder();
        int licznik;
        for(int i=0;i<wiadomosc.length();i++) {
            licznik = 0;
            for(int j=0;j<26;j++) {
                if(wiadomosc.substring(i, i+1).equalsIgnoreCase(alfabet.substring(j, j+1))) {
                    zakodowana.append(zmienionyAlfabet.subSequence(j, j+1));
                    licznik++;
                    break;
                }
            }
            if(licznik == 0) zakodowana.append(wiadomosc.subSequence(i, i+1));
        }
        return zakodowana.toString();
    }
}
