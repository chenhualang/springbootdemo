package tk.mybatis.mapper.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ha_claim_hospital")
public class HaClaimHospital {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 保监会医院代码
     */
    @Column(name = "CIRC_code")
    private String circCode;

    /**
     * 医院名称
     */
    private String name;

    /**
     * 医院类别：01-武警/解放医院、02-综合性医院、03-专科性医院、04-公立医院外宾部、05-公立医院特需、06-康复医院、07-职工医院、08-校/厂医院、09-独立药店、10-联合诊所、11-专科诊所、12-国际医疗网
     */
    private String type;

    /**
     * 医院级别：一级、二级、三级
     */
    @Column(name = "hospital_class")
    private String hospitalClass;

    /**
     * 医院等级：甲、乙、丙、特等
     */
    private String level;

    /**
     * 医院性质：01-合资、02-民营、03-外资、04-公立
     */
    private String capital;

    /**
     * 是否我司认可医院：1-是（二级及以上+协议拓展）、2-否
     */
    @Column(name = "company_special")
    private String companySpecial;

    /**
     * 是否社保定点医院：1-是、2-否
     */
    @Column(name = "insurance_special")
    private String insuranceSpecial;

    /**
     * 医院所在省
     */
    private String province;

    /**
     * 医院所在市
     */
    private String city;

    /**
     * 县／自治区／区
     */
    private String district;

    /**
     * 是否删除（Y-是，N-否）
     */
    @Column(name = "is_deleted")
    private String isDeleted;

    /**
     * 创建时间
     */
    @Column(name = "gmt_created")
    private Date gmtCreated;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 别名
     */
    private String alias;

    /**
     * 曾用名
     */
    @Column(name = "former_name")
    private String formerName;

    /**
     * 机构类别：1-医院,2-药房,3-门诊部,4-体检中心,5-眼镜店
     */
    @Column(name = "organization_type")
    private String organizationType;

    /**
     * 专科类型：1-全科,2-儿科,3-妇产科,4-眼科,5-中医,6-口腔,7-肿瘤,8-体检,9-皮肤科,10-康复科,11-其他
     */
    @Column(name = "specialized_type")
    private String specializedType;

    /**
     * 状态：1-待维护,2-启用,3-禁用
     */
    private String status;

    /**
     * 国家
     */
    private String country;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮编
     */
    @Column(name = "zip_code")
    private String zipCode;

    /**
     * 医院所在省编码
     */
    @Column(name = "province_code")
    private String provinceCode;

    /**
     * 医院所在市编码
     */
    @Column(name = "city_code")
    private String cityCode;

    /**
     * 县／自治区／区编码
     */
    @Column(name = "district_code")
    private String districtCode;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取保监会医院代码
     *
     * @return CIRC_code - 保监会医院代码
     */
    public String getCircCode() {
        return circCode;
    }

    /**
     * 设置保监会医院代码
     *
     * @param circCode 保监会医院代码
     */
    public void setCircCode(String circCode) {
        this.circCode = circCode;
    }

    /**
     * 获取医院名称
     *
     * @return name - 医院名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置医院名称
     *
     * @param name 医院名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取医院类别：01-武警/解放医院、02-综合性医院、03-专科性医院、04-公立医院外宾部、05-公立医院特需、06-康复医院、07-职工医院、08-校/厂医院、09-独立药店、10-联合诊所、11-专科诊所、12-国际医疗网
     *
     * @return type - 医院类别：01-武警/解放医院、02-综合性医院、03-专科性医院、04-公立医院外宾部、05-公立医院特需、06-康复医院、07-职工医院、08-校/厂医院、09-独立药店、10-联合诊所、11-专科诊所、12-国际医疗网
     */
    public String getType() {
        return type;
    }

    /**
     * 设置医院类别：01-武警/解放医院、02-综合性医院、03-专科性医院、04-公立医院外宾部、05-公立医院特需、06-康复医院、07-职工医院、08-校/厂医院、09-独立药店、10-联合诊所、11-专科诊所、12-国际医疗网
     *
     * @param type 医院类别：01-武警/解放医院、02-综合性医院、03-专科性医院、04-公立医院外宾部、05-公立医院特需、06-康复医院、07-职工医院、08-校/厂医院、09-独立药店、10-联合诊所、11-专科诊所、12-国际医疗网
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取医院级别：一级、二级、三级
     *
     * @return hospital_class - 医院级别：一级、二级、三级
     */
    public String getHospitalClass() {
        return hospitalClass;
    }

    /**
     * 设置医院级别：一级、二级、三级
     *
     * @param hospitalClass 医院级别：一级、二级、三级
     */
    public void setHospitalClass(String hospitalClass) {
        this.hospitalClass = hospitalClass;
    }

    /**
     * 获取医院等级：甲、乙、丙、特等
     *
     * @return level - 医院等级：甲、乙、丙、特等
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置医院等级：甲、乙、丙、特等
     *
     * @param level 医院等级：甲、乙、丙、特等
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 获取医院性质：01-合资、02-民营、03-外资、04-公立
     *
     * @return capital - 医院性质：01-合资、02-民营、03-外资、04-公立
     */
    public String getCapital() {
        return capital;
    }

    /**
     * 设置医院性质：01-合资、02-民营、03-外资、04-公立
     *
     * @param capital 医院性质：01-合资、02-民营、03-外资、04-公立
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * 获取是否我司认可医院：1-是（二级及以上+协议拓展）、2-否
     *
     * @return company_special - 是否我司认可医院：1-是（二级及以上+协议拓展）、2-否
     */
    public String getCompanySpecial() {
        return companySpecial;
    }

    /**
     * 设置是否我司认可医院：1-是（二级及以上+协议拓展）、2-否
     *
     * @param companySpecial 是否我司认可医院：1-是（二级及以上+协议拓展）、2-否
     */
    public void setCompanySpecial(String companySpecial) {
        this.companySpecial = companySpecial;
    }

    /**
     * 获取是否社保定点医院：1-是、2-否
     *
     * @return insurance_special - 是否社保定点医院：1-是、2-否
     */
    public String getInsuranceSpecial() {
        return insuranceSpecial;
    }

    /**
     * 设置是否社保定点医院：1-是、2-否
     *
     * @param insuranceSpecial 是否社保定点医院：1-是、2-否
     */
    public void setInsuranceSpecial(String insuranceSpecial) {
        this.insuranceSpecial = insuranceSpecial;
    }

    /**
     * 获取医院所在省
     *
     * @return province - 医院所在省
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置医院所在省
     *
     * @param province 医院所在省
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取医院所在市
     *
     * @return city - 医院所在市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置医院所在市
     *
     * @param city 医院所在市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取县／自治区／区
     *
     * @return district - 县／自治区／区
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置县／自治区／区
     *
     * @param district 县／自治区／区
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * 获取是否删除（Y-是，N-否）
     *
     * @return is_deleted - 是否删除（Y-是，N-否）
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除（Y-是，N-否）
     *
     * @param isDeleted 是否删除（Y-是，N-否）
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取创建时间
     *
     * @return gmt_created - 创建时间
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreated 创建时间
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取修改时间
     *
     * @return gmt_modified - 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取修改人
     *
     * @return modifier - 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设置修改人
     *
     * @param modifier 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * 获取别名
     *
     * @return alias - 别名
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 设置别名
     *
     * @param alias 别名
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 获取曾用名
     *
     * @return former_name - 曾用名
     */
    public String getFormerName() {
        return formerName;
    }

    /**
     * 设置曾用名
     *
     * @param formerName 曾用名
     */
    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    /**
     * 获取机构类别：1-医院,2-药房,3-门诊部,4-体检中心,5-眼镜店
     *
     * @return organization_type - 机构类别：1-医院,2-药房,3-门诊部,4-体检中心,5-眼镜店
     */
    public String getOrganizationType() {
        return organizationType;
    }

    /**
     * 设置机构类别：1-医院,2-药房,3-门诊部,4-体检中心,5-眼镜店
     *
     * @param organizationType 机构类别：1-医院,2-药房,3-门诊部,4-体检中心,5-眼镜店
     */
    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    /**
     * 获取专科类型：1-全科,2-儿科,3-妇产科,4-眼科,5-中医,6-口腔,7-肿瘤,8-体检,9-皮肤科,10-康复科,11-其他
     *
     * @return specialized_type - 专科类型：1-全科,2-儿科,3-妇产科,4-眼科,5-中医,6-口腔,7-肿瘤,8-体检,9-皮肤科,10-康复科,11-其他
     */
    public String getSpecializedType() {
        return specializedType;
    }

    /**
     * 设置专科类型：1-全科,2-儿科,3-妇产科,4-眼科,5-中医,6-口腔,7-肿瘤,8-体检,9-皮肤科,10-康复科,11-其他
     *
     * @param specializedType 专科类型：1-全科,2-儿科,3-妇产科,4-眼科,5-中医,6-口腔,7-肿瘤,8-体检,9-皮肤科,10-康复科,11-其他
     */
    public void setSpecializedType(String specializedType) {
        this.specializedType = specializedType;
    }

    /**
     * 获取状态：1-待维护,2-启用,3-禁用
     *
     * @return status - 状态：1-待维护,2-启用,3-禁用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态：1-待维护,2-启用,3-禁用
     *
     * @param status 状态：1-待维护,2-启用,3-禁用
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取国家
     *
     * @return country - 国家
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国家
     *
     * @param country 国家
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取邮编
     *
     * @return zip_code - 邮编
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 设置邮编
     *
     * @param zipCode 邮编
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * 获取医院所在省编码
     *
     * @return province_code - 医院所在省编码
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * 设置医院所在省编码
     *
     * @param provinceCode 医院所在省编码
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * 获取医院所在市编码
     *
     * @return city_code - 医院所在市编码
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * 设置医院所在市编码
     *
     * @param cityCode 医院所在市编码
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 获取县／自治区／区编码
     *
     * @return district_code - 县／自治区／区编码
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * 设置县／自治区／区编码
     *
     * @param districtCode 县／自治区／区编码
     */
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }
}