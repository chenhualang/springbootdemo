package enums;

public enum ClaimTypeEnum implements CodeEnum<Integer, ClaimTypeEnum, String> {
    UNKNOWNTYPE(-1, "未知状态"),
    FASTONE(1, "加速件"),
    COMMONTYPE(2, "普通件"),
    GREENCHANNELTYPE(0,"绿色通道件");

    private Integer code;
    private String  typeName;

    ClaimTypeEnum(Integer code, String typeName) {
        this.code = code;
        this.typeName = typeName;
    }

    public static ClaimTypeEnum get(Integer code) {

        for (ClaimTypeEnum statusEnum : ClaimTypeEnum.values()) {
            if (statusEnum.getCode() == code)
                return statusEnum;
        }
        return UNKNOWNTYPE;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String getName() {
        return getTypeName();
    }

    @Override
    public String getValue() {
        return getTypeName();
    }

}
