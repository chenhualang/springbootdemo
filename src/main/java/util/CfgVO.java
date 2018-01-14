package util;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class CfgVO implements Serializable {
    private static final long serialVersionUID = 5999791587974140346L;
    private String name;
    private String code;
    private List<CfgVO> childResources;

    public CfgVO() {
    }

    public CfgVO(CfgDTO cfgResource) {
        this.name = cfgResource.getResName();
        this.code = cfgResource.getResCode();
    }

    public void addChildResouce(CfgVO childResource) {
        if (childResource != null) {
            if (this.childResources == null) {
                this.childResources = new LinkedList();
            }

            this.childResources.add(childResource);
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<CfgVO> getChildResources() {
        return this.childResources;
    }

    public void setChildResources(List<CfgVO> childResources) {
        this.childResources = childResources;
    }

    public String toString() {
        return "CfgVO [name=" + this.name + ", code=" + this.code + ", childResources=" + this.childResources + "]";
    }
}
