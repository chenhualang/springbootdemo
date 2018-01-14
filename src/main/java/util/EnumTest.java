package util;

import com.alibaba.fastjson.JSON;
import enums.ClaimStatusTypeEnum;
import enums.CodeEnum;

public class EnumTest {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class<?> enumclz = Class.forName("enums.ClaimStatusTypeEnum");
        ClaimStatusTypeEnum claimStatusTypeEnum = ClaimStatusTypeEnum.getClaimType("caseClosed");
        Class<? extends CodeEnum> aClass = claimStatusTypeEnum.getClass();
        CodeEnum[] enumConstants = aClass.getEnumConstants();
        System.out.println(JSON.toJSON(enumConstants));
    }
}



