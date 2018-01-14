package util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CfgDTO implements Serializable, Comparable<CfgDTO> {
    private static final long serialVersionUID = 8447181669013702966L;
    private Long resId;
    private String resType;
    private String resName;
    private String resCode;
    private String resValue;
    private Integer orderNo;
    private String remark;
    private String operator;
    private Boolean isDeleted;
    private CfgDTO superResource;
    private List<CfgDTO> childResources;
    private List<CfgDTO> relateResources;

    public CfgDTO() {
    }

    public void addChildResouce(CfgDTO childResource) {
        if (childResource != null) {
            if (this.childResources == null) {
                this.childResources = new ArrayList();
            }

            this.childResources.add(childResource);
            childResource.setSuperResource(this);
        }
    }

    public void addRelateResouce(CfgDTO relateResource) {
        if (relateResource != null) {
            if (this.relateResources == null) {
                this.relateResources = new ArrayList();
            }

            this.relateResources.add(relateResource);
        }
    }

    public int compareTo(CfgDTO compareRes) {
        if (this.getOrderNo() != null && compareRes.getOrderNo() != null) {
            return this.getOrderNo().compareTo(compareRes.getOrderNo());
        } else {
            int ownerLength = 0;
            if (this.getResName() != null) {
                ownerLength = this.getResName().length();
            }

            int compareLength = 0;
            if (compareRes.getResName() != null) {
                compareLength = compareRes.getResName().length();
            }

            if (ownerLength < compareLength) {
                return -1;
            } else {
                return ownerLength > compareLength ? 1 : 0;
            }
        }
    }

    public Long getResId() {
        return this.resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    public String getResType() {
        return this.resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    public String getResName() {
        return this.resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getResCode() {
        return this.resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResValue() {
        return this.resValue;
    }

    public void setResValue(String resValue) {
        this.resValue = resValue;
    }

    public Integer getOrderNo() {
        return this.orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public CfgDTO getSuperResource() {
        return this.superResource;
    }

    public void setSuperResource(CfgDTO superResource) {
        this.superResource = superResource;
    }

    public List<CfgDTO> getChildResources() {
        return this.childResources;
    }

    public void setChildResources(List<CfgDTO> childResources) {
        this.childResources = childResources;
    }

    public List<CfgDTO> getRelateResources() {
        return this.relateResources;
    }

    public void setRelateResources(List<CfgDTO> relateResources) {
        this.relateResources = relateResources;
    }

    public static long getSerialversionuid() {
        return 8447181669013702966L;
    }
}
