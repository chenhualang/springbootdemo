package enums;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类StatusTypeEnum.java的实现描述：理赔状态类型定义
 */
public enum ClaimStatusTypeEnum implements Serializable, CodeEnum<String, ClaimStatusTypeEnum, String> {

    REPORTEDNOIMG("reportNoImg", "已报案无影像件"),
    REPORTEDCONTAINIMG("reportContainImg", "已报案有影像件"),
    DATAENTRY("dataEntry", "录入中"),
    MANUSETTLEMENT("manuSettlement", "转人工审核"),
    CASEREVIEW("caseReview", "复核中"),
    CASECLOSED("caseClosed", "已结案"),
    CASEHANG("caseHang", "案件挂起"),
    REPORTCLOSED("reportClosed", "报案注销"),
    REPORTBACK("reportBack", "报案回退"),

    UNKNOW("unknow", "未知状态");
    private String code;

    private String typeName;

    private ClaimStatusTypeEnum(String code, String typeName) {
        this.code = code;
        this.typeName = typeName;
    }

    public static ClaimStatusTypeEnum getClaimCode(String type) {
        for (ClaimStatusTypeEnum an : ClaimStatusTypeEnum.values()) {
            if (an.getTypeName().equals(type))
                return an;
        }
        return ClaimStatusTypeEnum.UNKNOW;
    }

    public static ClaimStatusTypeEnum getClaimType(String code) {
        for (ClaimStatusTypeEnum an : ClaimStatusTypeEnum.values()) {
            if (an.getCode().equals(code))
                return an;
        }
        return ClaimStatusTypeEnum.UNKNOW;
    }

    public static String getCode(String type) {
        return getClaimCode(type).getCode();
    }

    public static String getTypeName(String code) {
        return getClaimType(code).getTypeName();
    }

    /**
     * 把枚举转换成list返回 理赔状态类型定义
     * 
     * @return List<Map<String, String>>
     */
    public static List<Map<String, String>> getListForClaimStatusTypeEnum() {
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
        for (ClaimStatusTypeEnum an : ClaimStatusTypeEnum.values()) {
            if (an.getCode().equals(ClaimStatusTypeEnum.UNKNOW.getCode())) {
                continue;
            }
            Map<String, String> map = new HashMap<String, String>();
            map.put("label", an.getTypeName());
            map.put("value", an.getCode());
            mapList.add(map);
        }
        return mapList;
    }

    @Override
    public String getCode() {
        return code;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public String getName() {
        return this.typeName;
    }

    @Override
    public String getValue() {

        return getCode();
    }

}

