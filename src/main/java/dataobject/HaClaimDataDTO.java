package dataobject;

import java.math.BigDecimal;
import java.util.Date;

public class HaClaimDataDTO {
    /**  */
    private Long id;

    /** 投保人姓名 */
    private String appHolderName;

    /** 团体保单号 */
    private String groupPolicyNo;

    /** 分单号 */
    private String individualPolicyNo;

    /** 保险计划 */
    private String planName;

    /** 客户号 */
    private String custNo;

    /** 被保险人姓名 */
    private String insuranceName;

    /** 性别 */
    private String sex;

    /** 出生日期 */
    private Date birthDate;

    /** 证件类型 */
    private String certType;

    /** 证件号码 */
    private String certNo;

    /** 英文名 */
    private String englishName;

    /** 部门 */
    private String department;

    /** 城市 */
    private String city;

    /** 与被保人关系 */
    private String reporterInsuredRelation;

    /** 事故原因 */
    private String accidentReason;

    /** 出险日期 */
    private Date accidentDate;

    /** 报案日期 */
    private Date reportDate;

    /** 立案号 */
    private String registerNo;

    /** 险种名称 */
    private String productName;

    /** 责任名称 */
    private String liabilityName;

    /** 就诊医院 */
    private String hospitalName;

    /** 就诊科室 */
    private String hospitalDepartmentName;

    /** 诊断 */
    private String diagnosis;

    /** 索赔金额 */
    private BigDecimal claimAmount;

    /** 中草药费用 */
    private BigDecimal herbalMedicineFee;

    /** 理疗费用 */
    private BigDecimal therapyFee;

    /** 医保扣除金额 */
    private BigDecimal medicareDeductAmount;

    /** 不合理金额 */
    private BigDecimal nonresponsibleAmount;

    /** 医保支付金额 */
    private BigDecimal medicarePayAmount;

    /** 第三方支付金额 */
    private BigDecimal otherAmount;

    /** 审核金额 */
    private BigDecimal checkAmount;

    /** 赔付金额 */
    private BigDecimal paidAmount;

    /** 赔付比例 */
    private BigDecimal paidProportion;

    /** 扣除说明 */
    private String deductInstruction;

    /** 案件状态 */
    private String caseStatus;

    /** 结案日期 */
    private Date closeDate;

    /** 开户行 */
    private String accountBankName;

    /** 账户名 */
    private String transAccountName;

    /** 账户 */
    private String transAccount;

    /** 转账日期 */
    private Date transDate;

    /** 备注 */
    private String remark;

    /** 来源 */
    private String source;

    /** TPA影响条码 */
    private String barcode;

    /** TPA案件来源 */
    private String benType;

    /**  */
    private String creator;

    /**  */
    private String modifier;

    /**  */
    private Date gmtCreated;

    /**  */
    private Date gmtModified;

    /**  */
    private String isDeleted;
    /**
     *
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 投保人姓名
     * @return app_holder_name 投保人姓名
     */
    public String getAppHolderName() {
        return appHolderName;
    }

    /**
     * 投保人姓名
     * @param appHolderName 投保人姓名
     */
    public void setAppHolderName(String appHolderName) {
        this.appHolderName = appHolderName == null ? null : appHolderName.trim();
    }

    /**
     * 团体保单号
     * @return group_policy_no 团体保单号
     */
    public String getGroupPolicyNo() {
        return groupPolicyNo;
    }

    /**
     * 团体保单号
     * @param groupPolicyNo 团体保单号
     */
    public void setGroupPolicyNo(String groupPolicyNo) {
        this.groupPolicyNo = groupPolicyNo == null ? null : groupPolicyNo.trim();
    }

    /**
     * 分单号
     * @return individual_policy_no 分单号
     */
    public String getIndividualPolicyNo() {
        return individualPolicyNo;
    }

    /**
     * 分单号
     * @param individualPolicyNo 分单号
     */
    public void setIndividualPolicyNo(String individualPolicyNo) {
        this.individualPolicyNo = individualPolicyNo == null ? null : individualPolicyNo.trim();
    }

    /**
     * 保险计划
     * @return plan_name 保险计划
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * 保险计划
     * @param planName 保险计划
     */
    public void setPlanName(String planName) {
        this.planName = planName == null ? null : planName.trim();
    }

    /**
     * 客户号
     * @return cust_no 客户号
     */
    public String getCustNo() {
        return custNo;
    }

    /**
     * 客户号
     * @param custNo 客户号
     */
    public void setCustNo(String custNo) {
        this.custNo = custNo == null ? null : custNo.trim();
    }

    /**
     * 被保险人姓名
     * @return insurance_name 被保险人姓名
     */
    public String getInsuranceName() {
        return insuranceName;
    }

    /**
     * 被保险人姓名
     * @param insuranceName 被保险人姓名
     */
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName == null ? null : insuranceName.trim();
    }

    /**
     * 性别
     * @return sex 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 性别
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 出生日期
     * @return birth_date 出生日期
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * 出生日期
     * @param birthDate 出生日期
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * 证件类型
     * @return cert_type 证件类型
     */
    public String getCertType() {
        return certType;
    }

    /**
     * 证件类型
     * @param certType 证件类型
     */
    public void setCertType(String certType) {
        this.certType = certType == null ? null : certType.trim();
    }

    /**
     * 证件号码
     * @return cert_no 证件号码
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * 证件号码
     * @param certNo 证件号码
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo == null ? null : certNo.trim();
    }

    /**
     * 英文名
     * @return english_name 英文名
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * 英文名
     * @param englishName 英文名
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName == null ? null : englishName.trim();
    }

    /**
     * 部门
     * @return department 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 部门
     * @param department 部门
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * 城市
     * @return city 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 城市
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * 与被保人关系
     * @return reporter_insured_relation 与被保人关系
     */
    public String getReporterInsuredRelation() {
        return reporterInsuredRelation;
    }

    /**
     * 与被保人关系
     * @param reporterInsuredRelation 与被保人关系
     */
    public void setReporterInsuredRelation(String reporterInsuredRelation) {
        this.reporterInsuredRelation = reporterInsuredRelation == null ? null : reporterInsuredRelation.trim();
    }

    /**
     * 事故原因
     * @return accident_reason 事故原因
     */
    public String getAccidentReason() {
        return accidentReason;
    }

    /**
     * 事故原因
     * @param accidentReason 事故原因
     */
    public void setAccidentReason(String accidentReason) {
        this.accidentReason = accidentReason == null ? null : accidentReason.trim();
    }

    /**
     * 出险日期
     * @return accident_date 出险日期
     */
    public Date getAccidentDate() {
        return accidentDate;
    }

    /**
     * 出险日期
     * @param accidentDate 出险日期
     */
    public void setAccidentDate(Date accidentDate) {
        this.accidentDate = accidentDate;
    }

    /**
     * 报案日期
     * @return report_date 报案日期
     */
    public Date getReportDate() {
        return reportDate;
    }

    /**
     * 报案日期
     * @param reportDate 报案日期
     */
    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * 立案号
     * @return register_no 立案号
     */
    public String getRegisterNo() {
        return registerNo;
    }

    /**
     * 立案号
     * @param registerNo 立案号
     */
    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo == null ? null : registerNo.trim();
    }

    /**
     * 险种名称
     * @return product_name 险种名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 险种名称
     * @param productName 险种名称
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 责任名称
     * @return liability_name 责任名称
     */
    public String getLiabilityName() {
        return liabilityName;
    }

    /**
     * 责任名称
     * @param liabilityName 责任名称
     */
    public void setLiabilityName(String liabilityName) {
        this.liabilityName = liabilityName == null ? null : liabilityName.trim();
    }

    /**
     * 就诊医院
     * @return hospital_name 就诊医院
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * 就诊医院
     * @param hospitalName 就诊医院
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    /**
     * 就诊科室
     * @return hospital_department_name 就诊科室
     */
    public String getHospitalDepartmentName() {
        return hospitalDepartmentName;
    }

    /**
     * 就诊科室
     * @param hospitalDepartmentName 就诊科室
     */
    public void setHospitalDepartmentName(String hospitalDepartmentName) {
        this.hospitalDepartmentName = hospitalDepartmentName == null ? null : hospitalDepartmentName.trim();
    }

    /**
     * 诊断
     * @return diagnosis 诊断
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * 诊断
     * @param diagnosis 诊断
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis == null ? null : diagnosis.trim();
    }

    /**
     * 索赔金额
     * @return claim_amount 索赔金额
     */
    public BigDecimal getClaimAmount() {
        return claimAmount;
    }

    /**
     * 索赔金额
     * @param claimAmount 索赔金额
     */
    public void setClaimAmount(BigDecimal claimAmount) {
        this.claimAmount = claimAmount;
    }

    /**
     * 中草药费用
     * @return herbal_medicine_fee 中草药费用
     */
    public BigDecimal getHerbalMedicineFee() {
        return herbalMedicineFee;
    }

    /**
     * 中草药费用
     * @param herbalMedicineFee 中草药费用
     */
    public void setHerbalMedicineFee(BigDecimal herbalMedicineFee) {
        this.herbalMedicineFee = herbalMedicineFee;
    }

    /**
     * 理疗费用
     * @return therapy_fee 理疗费用
     */
    public BigDecimal getTherapyFee() {
        return therapyFee;
    }

    /**
     * 理疗费用
     * @param therapyFee 理疗费用
     */
    public void setTherapyFee(BigDecimal therapyFee) {
        this.therapyFee = therapyFee;
    }

    /**
     * 医保扣除金额
     * @return medicare_deduct_amount 医保扣除金额
     */
    public BigDecimal getMedicareDeductAmount() {
        return medicareDeductAmount;
    }

    /**
     * 医保扣除金额
     * @param medicareDeductAmount 医保扣除金额
     */
    public void setMedicareDeductAmount(BigDecimal medicareDeductAmount) {
        this.medicareDeductAmount = medicareDeductAmount;
    }

    /**
     * 不合理金额
     * @return nonresponsible_amount 不合理金额
     */
    public BigDecimal getNonresponsibleAmount() {
        return nonresponsibleAmount;
    }

    /**
     * 不合理金额
     * @param nonresponsibleAmount 不合理金额
     */
    public void setNonresponsibleAmount(BigDecimal nonresponsibleAmount) {
        this.nonresponsibleAmount = nonresponsibleAmount;
    }

    /**
     * 医保支付金额
     * @return medicare_pay_amount 医保支付金额
     */
    public BigDecimal getMedicarePayAmount() {
        return medicarePayAmount;
    }

    /**
     * 医保支付金额
     * @param medicarePayAmount 医保支付金额
     */
    public void setMedicarePayAmount(BigDecimal medicarePayAmount) {
        this.medicarePayAmount = medicarePayAmount;
    }

    /**
     * 第三方支付金额
     * @return other_amount 第三方支付金额
     */
    public BigDecimal getOtherAmount() {
        return otherAmount;
    }

    /**
     * 第三方支付金额
     * @param otherAmount 第三方支付金额
     */
    public void setOtherAmount(BigDecimal otherAmount) {
        this.otherAmount = otherAmount;
    }

    /**
     * 审核金额
     * @return check_amount 审核金额
     */
    public BigDecimal getCheckAmount() {
        return checkAmount;
    }

    /**
     * 审核金额
     * @param checkAmount 审核金额
     */
    public void setCheckAmount(BigDecimal checkAmount) {
        this.checkAmount = checkAmount;
    }

    /**
     * 赔付金额
     * @return paid_amount 赔付金额
     */
    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    /**
     * 赔付金额
     * @param paidAmount 赔付金额
     */
    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * 赔付比例
     * @return paid_proportion 赔付比例
     */
    public BigDecimal getPaidProportion() {
        return paidProportion;
    }

    /**
     * 赔付比例
     * @param paidProportion 赔付比例
     */
    public void setPaidProportion(BigDecimal paidProportion) {
        this.paidProportion = paidProportion;
    }

    /**
     * 扣除说明
     * @return deduct_instruction 扣除说明
     */
    public String getDeductInstruction() {
        return deductInstruction;
    }

    /**
     * 扣除说明
     * @param deductInstruction 扣除说明
     */
    public void setDeductInstruction(String deductInstruction) {
        this.deductInstruction = deductInstruction == null ? null : deductInstruction.trim();
    }

    /**
     * 案件状态
     * @return case_status 案件状态
     */
    public String getCaseStatus() {
        return caseStatus;
    }

    /**
     * 案件状态
     * @param caseStatus 案件状态
     */
    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus == null ? null : caseStatus.trim();
    }

    /**
     * 结案日期
     * @return close_date 结案日期
     */
    public Date getCloseDate() {
        return closeDate;
    }

    /**
     * 结案日期
     * @param closeDate 结案日期
     */
    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    /**
     * 开户行
     * @return account_bank_name 开户行
     */
    public String getAccountBankName() {
        return accountBankName;
    }

    /**
     * 开户行
     * @param accountBankName 开户行
     */
    public void setAccountBankName(String accountBankName) {
        this.accountBankName = accountBankName == null ? null : accountBankName.trim();
    }

    /**
     * 账户名
     * @return trans_account_name 账户名
     */
    public String getTransAccountName() {
        return transAccountName;
    }

    /**
     * 账户名
     * @param transAccountName 账户名
     */
    public void setTransAccountName(String transAccountName) {
        this.transAccountName = transAccountName == null ? null : transAccountName.trim();
    }

    /**
     * 账户
     * @return trans_account 账户
     */
    public String getTransAccount() {
        return transAccount;
    }

    /**
     * 账户
     * @param transAccount 账户
     */
    public void setTransAccount(String transAccount) {
        this.transAccount = transAccount == null ? null : transAccount.trim();
    }

    /**
     * 转账日期
     * @return trans_date 转账日期
     */
    public Date getTransDate() {
        return transDate;
    }

    /**
     * 转账日期
     * @param transDate 转账日期
     */
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 来源
     * @return source 来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 来源
     * @param source 来源
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * TPA影响条码
     * @return barcode TPA影响条码
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * TPA影响条码
     * @param barcode TPA影响条码
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    /**
     * TPA案件来源
     * @return ben_type TPA案件来源
     */
    public String getBenType() {
        return benType;
    }

    /**
     * TPA案件来源
     * @param benType TPA案件来源
     */
    public void setBenType(String benType) {
        this.benType = benType == null ? null : benType.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
}