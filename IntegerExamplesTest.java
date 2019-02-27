package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IntegerExamplesTest {
    @Test
    public void toHexString(){
        Integer eleven = new Integer(11);
        String b = new String();
        String hex = Integer.toHexString(11);
        assertEquals("Integer.ValueOf 11)", b, b);
        Integer ten = new Integer(10);
        String a = new String();
        hex = Integer.toHexString(10);
        assertEquals("Integer.ValueOf 10", a,a);
        Integer three = new Integer(3);
        assertEquals("intValue returns int 3", 3, three.intValue());
        Integer twentyfive = new Integer(25);
        assertEquals("Integer.parseInt 15", 15,twentyfive.intValue());

    }


}
