package com.zangyi.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time {
       public static String getNow(){
           Date now = new Date();
           //转换格式是返回timestamp形式的字符串
           SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
          String nows=simpleDateFormat.format(now);
           System.out.println(nows);
           return nows;
       }
       public static String getPre(){
           //创建日期类
           Calendar calendar = Calendar.getInstance();
           //天数+1；
           calendar.add(Calendar.DATE, 1);
           Date pre=calendar.getTime();
            //转换格式是返回timestamp形式的字符串
           SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
           String pres=simpleDateFormat.format(pre);
           System.out.println(pres);
           return pres;
       }
}
