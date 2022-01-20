package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class J01_Assertions {
    @Test
    @DisplayName("ToAssert Testi")
    void testToAssert() {
        int actual = "zekeriya".length();
        int expected = 8;
//        assertEquals(expected,actual);
        assertEquals(actual, expected);
        assertEquals(8, actual);//inline style : tavsiye edilmez
//        assertEquals(actual,7,"beklenen ve actual deger esit degil");
//        assertEquals(4,"islam".length(),"inline style tavsiye edilmez");
        assertNotEquals(9, actual);//esit olmama durumlarini test eder. negativ test

        assertTrue(expected == actual);
        assertFalse(expected != actual);
    }

    @Test
    @DisplayName("ConvertUpper Testi")
    void testConvertUpper() {
        String beklenen="ABDULLAH";
        String olusan="abdullah".toUpperCase();
        assertEquals(beklenen,olusan);//test datalari esitse passed

        beklenen="ABDULLAh";
//        assertTrue(beklenen.equals(olusan) );
        assertFalse(beklenen.equals(olusan));

        olusan=null;
        assertNull(olusan,"null degil");

        olusan="kursat";
        assertNotNull(olusan,"null dir");

    }
    @Test
    @DisplayName("ToContains test")
    void testToContains(){
        boolean olusan="mustafa".contains("hi");
        boolean beklenen=false;
        assertEquals(olusan,beklenen,"String degeri barindirmaz");
    }
    @Test
    @DisplayName("Arrays test")
    void testArray() {
        String str="javacanlara selam olsun..";
        String olusan[]=str.split(" ");
        String beklenen[]={"javacanlara", "selam", "olsun.."};
        assertArrayEquals(olusan,beklenen,"arrayler farkli");

    }
}