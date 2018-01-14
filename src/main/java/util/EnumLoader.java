package util;

import enums.CodeEnum;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EnumLoader implements ICfgLoader<CfgQueryCondition> {
    private Class<? extends CodeEnum> enmClz;

    public EnumLoader() {
    }

    public EnumLoader(Class<? extends CodeEnum> enmClz) {
        this.enmClz = enmClz;
    }

    public List<CfgDTO> load(CfgQueryCondition param) {
        List<CfgDTO> cfgs = new ArrayList(2);
        CodeEnum[] arr$ = (CodeEnum[])this.enmClz.getEnumConstants();
        int len$ = arr$.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            CodeEnum ce = arr$[i$];
            if ((param.getCode() == null || param.getCode().equals(ce.getCode())) && (!StringUtils.isNotEmpty(param.getName()) || ce.getName().contains(param.getName().trim()))) {
                cfgs.add(toCfg(ce, param));
            }
        }

        return cfgs;
    }

    public static CfgDTO toCfg(CodeEnum ce, CfgQueryCondition param) {
        CfgDTO cfg = new CfgDTO();
        cfg.setResCode(ce.getCode().toString());
        cfg.setResName(ce.getName());
        if (ce.getValue() != null) {
            cfg.setResValue(ce.getValue().toString());
        }

        cfg.setResType(param.getType());
        return cfg;
    }

    public Class<? extends CodeEnum> getEnmClz() {
        return this.enmClz;
    }

    public void setEnmClz(Class<? extends CodeEnum> enmClz) {
        this.enmClz = enmClz;
    }
}
