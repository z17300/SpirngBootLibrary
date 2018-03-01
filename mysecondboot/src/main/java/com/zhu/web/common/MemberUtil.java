package com.zhu.web.common;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import java.util.regex.Pattern;


public class MemberUtil {
    public static String PHONE_NUMBER_REGEX = "^[1][3-8]\\d{9}$";


    public static boolean phoneformat(String phoneNumber) {
        if(!StringUtils.isBlank(phoneNumber)){
            if(!Pattern.matches(PHONE_NUMBER_REGEX,phoneNumber)){
                return false;
            };
        }
        return true;
    }//判断当前类是否符合格式
}
