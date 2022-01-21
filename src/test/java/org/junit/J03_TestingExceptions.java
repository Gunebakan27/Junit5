package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
   assertThrow() metodu --> belirtilen işlemin (executable) belirtilen türde bir Exception oluşturup oluşturmadığını
   test eder.
       Dolayısıyla 2 parametre alır.
       1. parametre --> expected(beklenen) Exception(istisna) türü,
       2. parametre --> actual(oluşacak)  çalıştırılacak olan işlemdir.
   Eğer işlem belirtilen türde bir exception oluşturursa test başarılı olur.TEST PASSED
   Ama exception oluşmaz ise veya türü yanlış olursa test başarısız olur.TEST FAILED
  TRİCKK : Exception.io türünde parent-child ilişkisi var ise yine test başarılı sayılır.
*/
public class J03_TestingExceptions {
    @Test
    @DisplayName("NumberFromatException Test")
    void testException01(){
        String strSayi="14a3";
        assertThrows(Exception.class,()->Integer.parseInt(strSayi) );//failed
    }

    @Test
    @DisplayName("NullPointerException Test")
    void testException02(){
        String str=null;
        assertThrows(NullPointerException.class,()->str.length());//passed
        String str1="gökhan";
        assertThrows(NullPointerException.class,()->str1.length());//failed
    }

    @Test
    @DisplayName("IllegalArgumentException Test")
    void testException03(){
        assertThrows(IllegalArgumentException.class,()->yasYazdir(-2));//passed
        assertThrows(IllegalArgumentException.class,()->yasYazdir(2));//failed

    }
    void yasYazdir(int yas){
        if(yas<0){
            System.out.println("Agam niddin negativ yas mi olurr");
            throw new IllegalArgumentException();

        } System.out.println(yas);
    }
    @Test
    @DisplayName("ArithmeticException Test")
    void testException04(){
        assertThrows(ArithmeticException.class,()->bol(5,0));//passed
        assertThrows(ArithmeticException.class,()->bol(2,1));//failed

    }
    int bol(int a, int b){
        return a/b;
    }

}
