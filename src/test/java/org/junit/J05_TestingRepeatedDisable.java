package org.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class J05_TestingRepeatedDisable {
@AfterEach
void afterMethod(){
    System.out.println("after calisti");
    System.out.println("****");
}
    @BeforeEach
    void beforeMethod(){
        System.out.println("Before calisti");
        System.out.println("****");
    }
    @RepeatedTest(5)
    @DisplayName("Contains 5 kez run edilir")
    void testToContains(){
        boolean olusan="mustafa".contains("hi");
        boolean beklenen=false;
        assertEquals(olusan,beklenen,"String degeri barindirmaz");
        System.out.println("Contains test calisti");
    }
    @RepeatedTest(7)
    @DisplayName("Ctopla 7 kez run edilir")
    void topla() {
        assertEquals(3, HesapMakinesi.topla(1, 2));
        System.out.println("topla test calisti");
    }
    @Disabled// bu testi es gecer calistirmaz
    @Test
    void karpuzTest() {
    String karpuz="adana karpuzu, güldürür yüzü";
    assertEquals(28,karpuz.length());
    }
}
