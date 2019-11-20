package com.freestar.hiveplus.common;


import com.freestar.hiveplus.HiveplusApplication;

import java.math.BigDecimal;

/**
 * 描述：
 * 作者：一颗浪星
 * 日期：2019-11-08
 */
public class CommonConstant {

    public static final BigDecimal TAX_RATE = new BigDecimal("0.03");

    public static final String ROOT_PACKAGE_NAME = HiveplusApplication.class.getPackage().getName();

    public static void main(String[] args) {
        System.out.println(ROOT_PACKAGE_NAME);
    }
}
