package common;

import org.junit.Test;

public class UtilTest {
    @Test
    public void test1(){
        String a = "IEG互动娱乐事业群/互动娱乐研发部/引擎技术中心/研发三组";
        int n = a.indexOf("/");
        System.out.println("================="+n);
        String b = a.substring(0, n);
        char[] chars = b.toCharArray();
        int d = 0;
        for(int i=0;i<chars.length;i++){
            char c = chars[i];
            int m = (int) c;
            if(m>256){
                d=i;
                break;
            }

        }
        String s = b.substring(0, d);
        System.out.println(s);
//        System.out.println(b);


    }

    @Test
    public void test2(){
        String d = "IEG互动娱乐事业群/互动娱乐研发部/引擎技术中心/研发三组";
        String departmentCode = getDepartmentCode(d);
        System.out.println(departmentCode);
    }



    public static String getDepartmentCode(String department){
//        String a = "IEG互动娱乐事业群/互动娱乐研发部/引擎技术中心/研发三组";
        int n = department.indexOf("/");
        String partStr1 = department.substring(0, n);
        char[] charAray = partStr1.toCharArray();
        int a = 0;
        for(int i=0;i<charAray.length;i++){
            char c = charAray[i];
            int b = (int) c;
            if(b>256){
                a=i;
                break;
            }

        }
        String s = partStr1.substring(0, a);
        return s;
    }


}
