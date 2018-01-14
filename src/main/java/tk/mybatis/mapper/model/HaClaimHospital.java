package tk.mybatis.mapper.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ha_claim_hospital")
public class HaClaimHospital {
    /**
     * ����
     */
    @Id
    private Long id;

    /**
     * �����ҽԺ����
     */
    @Column(name = "CIRC_code")
    private String circCode;

    /**
     * ҽԺ����
     */
    private String name;

    /**
     * ҽԺ���01-�侯/���ҽԺ��02-�ۺ���ҽԺ��03-ר����ҽԺ��04-����ҽԺ�������05-����ҽԺ���衢06-����ҽԺ��07-ְ��ҽԺ��08-У/��ҽԺ��09-����ҩ�ꡢ10-����������11-ר��������12-����ҽ����
     */
    private String type;

    /**
     * ҽԺ����һ��������������
     */
    @Column(name = "hospital_class")
    private String hospitalClass;

    /**
     * ҽԺ�ȼ����ס��ҡ������ص�
     */
    private String level;

    /**
     * ҽԺ���ʣ�01-���ʡ�02-��Ӫ��03-���ʡ�04-����
     */
    private String capital;

    /**
     * �Ƿ���˾�Ͽ�ҽԺ��1-�ǣ�����������+Э����չ����2-��
     */
    @Column(name = "company_special")
    private String companySpecial;

    /**
     * �Ƿ��籣����ҽԺ��1-�ǡ�2-��
     */
    @Column(name = "insurance_special")
    private String insuranceSpecial;

    /**
     * ҽԺ����ʡ
     */
    private String province;

    /**
     * ҽԺ������
     */
    private String city;

    /**
     * �أ�����������
     */
    private String district;

    /**
     * �Ƿ�ɾ����Y-�ǣ�N-��
     */
    @Column(name = "is_deleted")
    private String isDeleted;

    /**
     * ����ʱ��
     */
    @Column(name = "gmt_created")
    private Date gmtCreated;

    /**
     * ������
     */
    private String creator;

    /**
     * �޸�ʱ��
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * �޸���
     */
    private String modifier;

    /**
     * ����
     */
    private String alias;

    /**
     * ������
     */
    @Column(name = "former_name")
    private String formerName;

    /**
     * �������1-ҽԺ,2-ҩ��,3-���ﲿ,4-�������,5-�۾���
     */
    @Column(name = "organization_type")
    private String organizationType;

    /**
     * ר�����ͣ�1-ȫ��,2-����,3-������,4-�ۿ�,5-��ҽ,6-��ǻ,7-����,8-���,9-Ƥ����,10-������,11-����
     */
    @Column(name = "specialized_type")
    private String specializedType;

    /**
     * ״̬��1-��ά��,2-����,3-����
     */
    private String status;

    /**
     * ����
     */
    private String country;

    /**
     * ��ַ
     */
    private String address;

    /**
     * �ʱ�
     */
    @Column(name = "zip_code")
    private String zipCode;

    /**
     * ҽԺ����ʡ����
     */
    @Column(name = "province_code")
    private String provinceCode;

    /**
     * ҽԺ�����б���
     */
    @Column(name = "city_code")
    private String cityCode;

    /**
     * �أ���������������
     */
    @Column(name = "district_code")
    private String districtCode;

    /**
     * ��ȡ����
     *
     * @return id - ����
     */
    public Long getId() {
        return id;
    }

    /**
     * ��������
     *
     * @param id ����
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡ�����ҽԺ����
     *
     * @return CIRC_code - �����ҽԺ����
     */
    public String getCircCode() {
        return circCode;
    }

    /**
     * ���ñ����ҽԺ����
     *
     * @param circCode �����ҽԺ����
     */
    public void setCircCode(String circCode) {
        this.circCode = circCode;
    }

    /**
     * ��ȡҽԺ����
     *
     * @return name - ҽԺ����
     */
    public String getName() {
        return name;
    }

    /**
     * ����ҽԺ����
     *
     * @param name ҽԺ����
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡҽԺ���01-�侯/���ҽԺ��02-�ۺ���ҽԺ��03-ר����ҽԺ��04-����ҽԺ�������05-����ҽԺ���衢06-����ҽԺ��07-ְ��ҽԺ��08-У/��ҽԺ��09-����ҩ�ꡢ10-����������11-ר��������12-����ҽ����
     *
     * @return type - ҽԺ���01-�侯/���ҽԺ��02-�ۺ���ҽԺ��03-ר����ҽԺ��04-����ҽԺ�������05-����ҽԺ���衢06-����ҽԺ��07-ְ��ҽԺ��08-У/��ҽԺ��09-����ҩ�ꡢ10-����������11-ר��������12-����ҽ����
     */
    public String getType() {
        return type;
    }

    /**
     * ����ҽԺ���01-�侯/���ҽԺ��02-�ۺ���ҽԺ��03-ר����ҽԺ��04-����ҽԺ�������05-����ҽԺ���衢06-����ҽԺ��07-ְ��ҽԺ��08-У/��ҽԺ��09-����ҩ�ꡢ10-����������11-ר��������12-����ҽ����
     *
     * @param type ҽԺ���01-�侯/���ҽԺ��02-�ۺ���ҽԺ��03-ר����ҽԺ��04-����ҽԺ�������05-����ҽԺ���衢06-����ҽԺ��07-ְ��ҽԺ��08-У/��ҽԺ��09-����ҩ�ꡢ10-����������11-ר��������12-����ҽ����
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * ��ȡҽԺ����һ��������������
     *
     * @return hospital_class - ҽԺ����һ��������������
     */
    public String getHospitalClass() {
        return hospitalClass;
    }

    /**
     * ����ҽԺ����һ��������������
     *
     * @param hospitalClass ҽԺ����һ��������������
     */
    public void setHospitalClass(String hospitalClass) {
        this.hospitalClass = hospitalClass;
    }

    /**
     * ��ȡҽԺ�ȼ����ס��ҡ������ص�
     *
     * @return level - ҽԺ�ȼ����ס��ҡ������ص�
     */
    public String getLevel() {
        return level;
    }

    /**
     * ����ҽԺ�ȼ����ס��ҡ������ص�
     *
     * @param level ҽԺ�ȼ����ס��ҡ������ص�
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * ��ȡҽԺ���ʣ�01-���ʡ�02-��Ӫ��03-���ʡ�04-����
     *
     * @return capital - ҽԺ���ʣ�01-���ʡ�02-��Ӫ��03-���ʡ�04-����
     */
    public String getCapital() {
        return capital;
    }

    /**
     * ����ҽԺ���ʣ�01-���ʡ�02-��Ӫ��03-���ʡ�04-����
     *
     * @param capital ҽԺ���ʣ�01-���ʡ�02-��Ӫ��03-���ʡ�04-����
     */
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * ��ȡ�Ƿ���˾�Ͽ�ҽԺ��1-�ǣ�����������+Э����չ����2-��
     *
     * @return company_special - �Ƿ���˾�Ͽ�ҽԺ��1-�ǣ�����������+Э����չ����2-��
     */
    public String getCompanySpecial() {
        return companySpecial;
    }

    /**
     * �����Ƿ���˾�Ͽ�ҽԺ��1-�ǣ�����������+Э����չ����2-��
     *
     * @param companySpecial �Ƿ���˾�Ͽ�ҽԺ��1-�ǣ�����������+Э����չ����2-��
     */
    public void setCompanySpecial(String companySpecial) {
        this.companySpecial = companySpecial;
    }

    /**
     * ��ȡ�Ƿ��籣����ҽԺ��1-�ǡ�2-��
     *
     * @return insurance_special - �Ƿ��籣����ҽԺ��1-�ǡ�2-��
     */
    public String getInsuranceSpecial() {
        return insuranceSpecial;
    }

    /**
     * �����Ƿ��籣����ҽԺ��1-�ǡ�2-��
     *
     * @param insuranceSpecial �Ƿ��籣����ҽԺ��1-�ǡ�2-��
     */
    public void setInsuranceSpecial(String insuranceSpecial) {
        this.insuranceSpecial = insuranceSpecial;
    }

    /**
     * ��ȡҽԺ����ʡ
     *
     * @return province - ҽԺ����ʡ
     */
    public String getProvince() {
        return province;
    }

    /**
     * ����ҽԺ����ʡ
     *
     * @param province ҽԺ����ʡ
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * ��ȡҽԺ������
     *
     * @return city - ҽԺ������
     */
    public String getCity() {
        return city;
    }

    /**
     * ����ҽԺ������
     *
     * @param city ҽԺ������
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * ��ȡ�أ�����������
     *
     * @return district - �أ�����������
     */
    public String getDistrict() {
        return district;
    }

    /**
     * �����أ�����������
     *
     * @param district �أ�����������
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * ��ȡ�Ƿ�ɾ����Y-�ǣ�N-��
     *
     * @return is_deleted - �Ƿ�ɾ����Y-�ǣ�N-��
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * �����Ƿ�ɾ����Y-�ǣ�N-��
     *
     * @param isDeleted �Ƿ�ɾ����Y-�ǣ�N-��
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return gmt_created - ����ʱ��
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * ���ô���ʱ��
     *
     * @param gmtCreated ����ʱ��
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * ��ȡ������
     *
     * @return creator - ������
     */
    public String getCreator() {
        return creator;
    }

    /**
     * ���ô�����
     *
     * @param creator ������
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * ��ȡ�޸�ʱ��
     *
     * @return gmt_modified - �޸�ʱ��
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * �����޸�ʱ��
     *
     * @param gmtModified �޸�ʱ��
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * ��ȡ�޸���
     *
     * @return modifier - �޸���
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * �����޸���
     *
     * @param modifier �޸���
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * ��ȡ����
     *
     * @return alias - ����
     */
    public String getAlias() {
        return alias;
    }

    /**
     * ���ñ���
     *
     * @param alias ����
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * ��ȡ������
     *
     * @return former_name - ������
     */
    public String getFormerName() {
        return formerName;
    }

    /**
     * ����������
     *
     * @param formerName ������
     */
    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    /**
     * ��ȡ�������1-ҽԺ,2-ҩ��,3-���ﲿ,4-�������,5-�۾���
     *
     * @return organization_type - �������1-ҽԺ,2-ҩ��,3-���ﲿ,4-�������,5-�۾���
     */
    public String getOrganizationType() {
        return organizationType;
    }

    /**
     * ���û������1-ҽԺ,2-ҩ��,3-���ﲿ,4-�������,5-�۾���
     *
     * @param organizationType �������1-ҽԺ,2-ҩ��,3-���ﲿ,4-�������,5-�۾���
     */
    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    /**
     * ��ȡר�����ͣ�1-ȫ��,2-����,3-������,4-�ۿ�,5-��ҽ,6-��ǻ,7-����,8-���,9-Ƥ����,10-������,11-����
     *
     * @return specialized_type - ר�����ͣ�1-ȫ��,2-����,3-������,4-�ۿ�,5-��ҽ,6-��ǻ,7-����,8-���,9-Ƥ����,10-������,11-����
     */
    public String getSpecializedType() {
        return specializedType;
    }

    /**
     * ����ר�����ͣ�1-ȫ��,2-����,3-������,4-�ۿ�,5-��ҽ,6-��ǻ,7-����,8-���,9-Ƥ����,10-������,11-����
     *
     * @param specializedType ר�����ͣ�1-ȫ��,2-����,3-������,4-�ۿ�,5-��ҽ,6-��ǻ,7-����,8-���,9-Ƥ����,10-������,11-����
     */
    public void setSpecializedType(String specializedType) {
        this.specializedType = specializedType;
    }

    /**
     * ��ȡ״̬��1-��ά��,2-����,3-����
     *
     * @return status - ״̬��1-��ά��,2-����,3-����
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����״̬��1-��ά��,2-����,3-����
     *
     * @param status ״̬��1-��ά��,2-����,3-����
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * ��ȡ����
     *
     * @return country - ����
     */
    public String getCountry() {
        return country;
    }

    /**
     * ���ù���
     *
     * @param country ����
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * ��ȡ��ַ
     *
     * @return address - ��ַ
     */
    public String getAddress() {
        return address;
    }

    /**
     * ���õ�ַ
     *
     * @param address ��ַ
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * ��ȡ�ʱ�
     *
     * @return zip_code - �ʱ�
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * �����ʱ�
     *
     * @param zipCode �ʱ�
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * ��ȡҽԺ����ʡ����
     *
     * @return province_code - ҽԺ����ʡ����
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * ����ҽԺ����ʡ����
     *
     * @param provinceCode ҽԺ����ʡ����
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    /**
     * ��ȡҽԺ�����б���
     *
     * @return city_code - ҽԺ�����б���
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * ����ҽԺ�����б���
     *
     * @param cityCode ҽԺ�����б���
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * ��ȡ�أ���������������
     *
     * @return district_code - �أ���������������
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * �����أ���������������
     *
     * @param districtCode �أ���������������
     */
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }
}