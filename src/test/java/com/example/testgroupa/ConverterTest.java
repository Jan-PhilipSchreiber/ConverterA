package com.example.testgroupa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestParam;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    Converter converter = new Converter();
    @Test
    void cmTest1() {
        double a = 1;

        double expectedResult = 2.54;
        //Act
        double result = converter.cm(a);
        //Assert
        //expected resut=result
        assertEquals(expectedResult, result);
    }
    @Test
    void cmTest2() {
        double a = 4;
        double expectedResult = 2.54;
        //wrong result to see if the test works
        double result = converter.cm(a);
        assertEquals(expectedResult, result);
    }
    @Test
    void cmTest3() {
        double a = 0;
        double expectedResult = 0;
        double result = converter.cm(a);
        assertEquals(expectedResult, result);
    }

    @Test
    void mTest1() {
        double a = 1;
        double expectedResult = 0.9140767824497257;
        double result = converter.m(a);
        assertEquals(expectedResult, result);
    }

    @Test
    void mTest2() {
        double a = 4;
        double expectedResult = 3.6563071297989027;
        double result = converter.m(a);
        assertEquals(expectedResult, result);
    }
   @Test
    void mTest3() {
        double a = 0;
        double expectedResult = 0;
        double result = converter.m(a);
        assertEquals(expectedResult, result);
    }



}