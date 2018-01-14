package common;

import com.alibaba.fastjson.JSON;
import tk.mybatis.mapper.model.HaClaimHospital;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
//    static{
//        System.out.println("hello shanghai");
//    }

    @org.junit.Test
    public void test1(){
        int a[] = new int[]{1,2,3,4,5,6,7,8,9};
        Set<Integer> s = new HashSet<>();
        for(int i =0;i<a.length;i++){
            s.add(a[i]);
        }
        Iterator<Integer> it = s.iterator();
        while (it.hasNext()){
            Integer c = it.next();
            if(c%2==0){
              it.remove();
            }
        }
        for (Integer integer : s) {
            System.out.println(integer);
        }

    }

    @org.junit.Test
    public void test2(){
       List<String> l = new ArrayList<>();
       l.add("beijing");
       l.add("shanghai");
       l.add("hangzhou");
       if(l.contains("hangzhou")){
           System.out.println("test success");
       }
    }


    @org.junit.Test
    public void test3(){
        String s1 = "PCL2017120900000001-01";
        String s2 = "PCL2017120900000001-02";
        String s3 = "PCL2017120900000001-03";
        String s = "PCL2017120900000001";
        Set<String> set1 = new HashSet<>();
        List<String> list = new ArrayList<>();
        set1.add(s1);
        set1.add(s2);
        set1.add(s3);
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.contains(s)){
                list.add(next);
            }
        }

        System.out.println(JSON.toJSON(list));
    }

    @org.junit.Test
    public void test4(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        String[] s = new String[list.size()];
        list.toArray(s);
        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);
    }

    @org.junit.Test
    public void test5(){
        StringBuilder sb = new StringBuilder();
        sb.append("hello").append("-");
//        sb.append("shanghai").append("-");
        String s = sb.toString();
//        String[] a = s.split("-");
        String a = s.substring(0, s.length() - 1);
        System.out.println(a);

    }


    @org.junit.Test
    public void test6(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.remove(2);
        System.out.println(JSON.toJSONString(list));
    }


    @org.junit.Test
    public void test7(){
        String s = "h_no1513533854040-1_!@#$_";
        String s1 = s.substring(0, s.length() - 6);
        System.out.println(s1);
    }

    @org.junit.Test
    public void test8(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
//        String[] a = new String[list.size()];
//        test9(a);
//        System.out.println(JSON.toJSONString(a));
    }

    @org.junit.Test
    public void test9(){
        String[] a = {"1","2","3"};
        List<String> list = Arrays.asList(a);
        List<String> l = new ArrayList<>();
        l.addAll(list);
        l.remove(2);
        System.out.println(JSON.toJSONString(l));
//        String[] b = new String[l.size()];
//        a = b;
    }

    @org.junit.Test
    public void test10(){
        String s = "2017-10-12";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = null;
        try {
            date = sdf.parse(s);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("ceshi chenggong"+date);
    }

    @org.junit.Test
    public void test11(){
        String s = "1256";
        boolean a = isNumeric(s);
//        BigDecimal b = new BigDecimal(s);
        System.out.println("hello    "+a);
    }

    public boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
    }


    @org.junit.Test
    public void test12(){
        String s = "123";
        String b = null;
        if(s.equals(b)){
            System.out.println("test success");
        }
    }

    @org.junit.Test
    public void test13(){
        String s = "2";
        List<String> l = new ArrayList<>();
        l.add("1");
        l.add("2");
        l.add("3");
        removePreclaimNo(s,l);
        System.out.println(JSON.toJSONString(l));
    }

    public void removePreclaimNo(String preclaimNo,List<String> list){
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String x = it.next();
            if(x.equals(preclaimNo)){
                it.remove();
            }
        }
    }


}
