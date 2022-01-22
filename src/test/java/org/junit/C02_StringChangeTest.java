package org.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class C02_StringChangeTest {

C02_StringChange strChange;

    @BeforeEach
    void setUp() {
        strChange = new C02_StringChange();
        System.out.println("test verisi girildi");
    }

    @AfterEach
    void tearDown() {
        strChange=null;
        System.out.println("Test verisi silindi");
    }

   @ParameterizedTest
   @CsvSource(value={"BC,ABC","'',A","'',AA","B,B","BCDE,BCDE"})
    void ilkIkACikar(String kirpilmis, String girdi) {
        assertEquals(kirpilmis,strChange.ilkIkACikar(girdi));
        assertTrue(kirpilmis.equals(strChange.ilkIkACikar(girdi)));

    }
}