package com.liam8.hive;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * IpToNum Tester.
 */
public class IpToNumTest {

    IpToNum ipToNum;

    @Before
    public void before() throws Exception {
        ipToNum = new IpToNum();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: evaluate(String s)
     */
    @Test
    public void testEvaluate() throws Exception {
        assertEquals(1, ipToNum.evaluate("0.0.0.1"));
        assertEquals(0, ipToNum.evaluate("0.0.0.0"));
        assertEquals(3223256194L, ipToNum.evaluate("192.30.252.130"));
        assertEquals(2130706433, ipToNum.evaluate("127.0.0.1"));
        assertEquals(4294967295L, ipToNum.evaluate("255.255.255.255"));
    }


} 
