package com.javafortesters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {
   @Test
    public void canAddFourMultyplyThree(){
       int answer = 4*3;
               assertEquals("4*3=12", 12, answer);


    }
}
