package com.liam8.hive;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.io.UnsupportedEncodingException;

/**
 * Get MD5 hash values of a String
 * The hash value equal to mysql md5 function.
 * Created by Liam on 2017/7/12.
 */
@Description(name = "Md5", value = "_FUNC_(string) - Get MD5 hash values of a String.")
public class Md5 extends UDF {

    public String evaluate(String str) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return DigestUtils.md5Hex(str);
    }

}
