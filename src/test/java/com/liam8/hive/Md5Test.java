package com.liam8.hive;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Md5Test {

    Md5 md5;

    @Before
    public void before() throws Exception {
        md5 = new Md5();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: evaluate(String s)
     */
    @Test
    public void testEvaluate() throws Exception {
        assertEquals("c6a8c84908efe116df536993e4543fe4", md5.evaluate("test str"));
        assertEquals("7215ee9c7d9dc229d2921a40e899ec5f", md5.evaluate(" "));
        assertEquals("d41d8cd98f00b204e9800998ecf8427e", md5.evaluate(""));
        assertEquals("8a8c1485f0d300c16d0d9877ba35abfe", md5.evaluate("https://h5.youzan.com/v2/goods/26xtay8b7atyl?reft=1493628351167_1493628658test"));
    }


} 
