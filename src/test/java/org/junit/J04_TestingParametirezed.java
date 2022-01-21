package org.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class J04_TestingParametirezed {
    @Test
    //CISSS asla tavsiye edilmez.. cünkü failed olan testten sonrakilerin durumu bilinemez..
    void uzunlukSifirdanBuyuk(){
        assertTrue("yildiz".length()>0);
        assertTrue("suleyman".length()>2);
        assertTrue("omer".length()>3);
        assertTrue("kursat".length()>4);
    }
    //TEKIL SART
    /*
    length() methodu ile asagidaki sartlar icin 0'dan büyük deger return ettigini test ediniz..
    Sartlar : "yildiz","suleyman","omer","kursat" -->Bu datalar testi nasil gecer
     */
    @ParameterizedTest
    @ValueSource(strings = {"yildiz","suleyman","omer","kursat" })//passed
//    @ValueSource(strings = {"yildiz","suleyman","omer","x" //failed,"kursat" })//failed

    void uzunlukSifirdanBuyukParametreli(String str){//parametre elemanlari methoda parametre olarak girer
        assertTrue(str.length()>2);

    }
    //COKLU SART --> Her parametre elemani KEY VALUE ikilisi ile test methodunda run olur
    @ParameterizedTest
    @CsvSource(value={"yildiz,YILDIZ","suleyman, SULEYMAN","omer,OMER","kursat,KURSAT" })
//comma-separated values-->virgülle ayrilmis degerler
    void testBykHrfCvr(String beklenen, String isim){
        assertEquals(beklenen.toUpperCase(),isim);
    }
}
