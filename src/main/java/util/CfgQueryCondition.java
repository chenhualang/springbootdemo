package util;

import java.io.Serializable;

public class CfgQueryCondition implements Serializable, Cloneable {
    private static final long serialVersionUID = 8422787414071859621L;
    private String type;
    private String code;
    private String parentCode;
    private String name;
    private boolean fuzzy;
    private boolean loadAll;
    private boolean cache = true;

    public CfgQueryCondition() {
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentCode() {
        return this.parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLoadAll() {
        return this.loadAll;
    }

    public void setLoadAll(boolean loadAll) {
        this.loadAll = loadAll;
    }

    public boolean isCache() {
        return !this.isFuzzy() && this.cache;
    }

    public void setCache(boolean cache) {
        this.cache = cache;
    }

    public boolean isFuzzy() {
        return this.fuzzy;
    }

    public void setFuzzy(boolean fuzzy) {
        this.fuzzy = fuzzy;
    }

    public int hashCode() {
//        int prime = true;
        int result = 1;
        result = 31 * result + (this.code == null ? 0 : this.code.hashCode());
        result = 31 * result + (this.parentCode == null ? 0 : this.parentCode.hashCode());
        result = 31 * result + (this.type == null ? 0 : this.type.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            CfgQueryCondition other = (CfgQueryCondition)obj;
            if (this.code == null) {
                if (other.code != null) {
                    return false;
                }
            } else if (!this.code.equals(other.code)) {
                return false;
            }

            if (this.parentCode == null) {
                if (other.parentCode != null) {
                    return false;
                }
            } else if (!this.parentCode.equals(other.parentCode)) {
                return false;
            }

            if (this.type == null) {
                if (other.type != null) {
                    return false;
                }
            } else if (!this.type.equals(other.type)) {
                return false;
            }

            return true;
        }
    }

    public String toString() {
        return "CfgQueryCondition [type=" + this.type + ", code=" + this.code + ", parentCode=" + this.parentCode + ", name=" + this.name + ", fuzzy=" + this.fuzzy + ", loadAll=" + this.loadAll + ", cache=" + this.cache + "]";
    }

    public CfgQueryCondition clone() {
        try {
            return (CfgQueryCondition)super.clone();
        } catch (CloneNotSupportedException var2) {
            return null;
        }
    }
}
