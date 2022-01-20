package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HesapMakinesiTest {

    @Test
    @DisplayName("ebik gabik sayilari toplar")//kullanici veya yöneticiin bilgilendirilmesi icin etiket olusturur
    void topla() {
        assertEquals(3,HesapMakinesi.topla(1,2));
//        assertEquals(3,HesapMakinesi.topla(1,5));
    }

    @Test
    @DisplayName("ebik gabik sayilari carpar")
    void carpma() {
        assertAll(
                ()-> assertEquals(2.6,HesapMakinesi.carpma(2,1.3)),
                ()-> assertEquals(6,HesapMakinesi.carpma(2,3)),
                ()-> assertEquals(-2,HesapMakinesi.carpma(2,-1)),
                ()-> assertEquals(-6,HesapMakinesi.carpma(2,-3))
        );


//        assertEquals(2.6,HesapMakinesi.carpma(2,1.3));
//        assertEquals(2.6,HesapMakinesi.carpma(2,2.3));
    }
}