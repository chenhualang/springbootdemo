package common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static  String formatDate(Date date)throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public static Date parse(String strDate) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.parse(strDate);
    }

    public static void main(String[] args) {
//        try {
//            String s = formatDate(new Date());
//            System.out.println("转换后的日期字符串为"+s);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }

//        try {
//            Date d = parse("2017-11-28 11:31:15");
//            System.out.println("转换后的日期为"+d);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        try{
            String s = formatDate(new Date());
            Date parse = parse(s);
            System.out.println(parse);
        }catch (Exception e){
            e.printStackTrace();
        }

    }



}