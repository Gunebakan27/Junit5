package org.junit;

public class C02_StringChange {
    /*
    Verilen bir stringteki ilk iki harf icinde a var ise bunlari silen method yaziniz
    AACD->CD
    ABC ->BC
    AA  ->""
    A   ->""
    B   ->B
     */
    public static String ilkIkACikar(String str) {
        if(str.length()>1&&str.charAt(1)=='A'){
            return str.substring(2);
        }
        if(str.charAt(0)=='A'){
            return str.substring(1);
        }  return str;
    }


}
