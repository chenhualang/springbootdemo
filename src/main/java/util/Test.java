package util;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public void test1(){
        String[] a = new String[3];
        a[0] = "1";
        a[1] = "2";
        a[2] = "3";
        List<String> b = Arrays.asList(a);
        List<String> c = new ArrayList<>(b);
        c.remove(2);
        System.out.println(JSON.toJSONString(c));
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.test4();
    }
    public String[] test2(String[] a){
        List<String> l1 = Arrays.asList(a);
        List<String> l2 =new ArrayList<>();
        l2.addAll(l1);
        l2.remove(1);
        String[] b = new String[l2.size()];
        l2.toArray(b);
        return b;


    }

    public void test3(){
        String[] a = {"1","2","3"};
        String[] b = test2(a);
        System.out.println(JSON.toJSONString(b));
    }

    public void test4(){
        List<String> l = new ArrayList<>();
        l.add("1");
//        l.add("2");
//        l.add("3");
        String s = composePreclaimNosSuffix(l);
        System.out.println(s);
    }

    public String[] convertListToArray(List<String> list) {
        String[] s = new String[list.size()];
        list.toArray(s);
        return s;
    }


    public String composePreclaimNosSuffix(List<String> list) {
        String[] array = convertListToArray(list);
        StringBuilder sbFails = new StringBuilder();
        for (int j = 0; j < array.length; j++) {
            if (sbFails.length() > 0) {
                sbFails.append("-").append(array[j]);
            } else {
                sbFails.append(array[j]);
            }
        }
        return sbFails.toString();
    }
}
