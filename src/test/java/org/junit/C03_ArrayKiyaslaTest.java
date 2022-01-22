package org.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class C03_ArrayKiyaslaTest {

    @ParameterizedTest
    @MethodSource("arraySaglayici")
    void arrayEsitMi(boolean sonuc, Object[]x,Object[]y) {

        assertEquals(sonuc,C03_ArrayKiyasla.arrayEsitMi(x,y));
    }
   static Stream<Arguments> arraySaglayici(){
Integer[]a1={1,2,3,4};
Integer[]a2={3,1,4,2};

String[]s1={"h","a","y"};
String[]s2={"y","h","a"};

Double[]d1={1.2,2.3,5.6};
Double[]d2={2.3,5.6,1.2};

Float[]f1={1f,2f,67f,35f};
Float[]f2={11f,21f,7f,5f};

        return Stream.of(Arguments.of(true,a1,a2),
                Arguments.of(true,s1,s2),
                Arguments.of(true,d1,d2),
                Arguments.of(false,f1,f2));
    }
}