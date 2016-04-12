package com.liam8.hive;

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * Convert IPv4 to a num which type is Long in java.
 * Created by Liam on 2016/4/11.
 */
@Description(name = "IpToNum", value = "_FUNC_(ip) - Convert IPv4 to a num(long).")
public class IpToNum extends UDF {

    public long evaluate(String ip) {
        String[] nums = ip.split("\\.");
        return Long.parseLong(nums[3]) + Long.parseLong(nums[2]) * 256
                + Long.parseLong(nums[1]) * 65536 + Long.parseLong(nums[0]) * 16777216;
    }

}
