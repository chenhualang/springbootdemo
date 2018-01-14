package tk.mybatis.mapper.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ha_tpa_report")
public class HaTpaReport {
    /**
     * 序号
     */
    @Column(name = "serial_no")
    private String serialNo;

    /**
     * 投保人编号
     */
    @Column(name = "app_holder_no")
    private String appHolderNo;

    /**
     * 投保人姓名
     */
    @Column(name = "app_holder_name")
    private String appHolderName;

    /**
     * 团体保单号
     */
    @Column(name = "group_policy_no")
    private String groupPolicyNo;

    /**
     * 分单号
     */
    @Column(name = "individual_policy_no")
    private String individualPolicyNo;

    /**
     * 保险计划
     */
    @Column(name = "plan_name")
    private String planName;

    /**
     * 客户号
     */
    @Column(name = "cust_no")
    private String custNo;

    /**
     * 被保险人姓名
     */
    @Column(name = "insurance_name")
    private String insuranceName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生日期
     */
    @Column(name = "birth_date")
    private Date birthDate;

    /**
     * 证件类型
     */
    @Column(name = "cert_type")
    private String certType;

    /**
     * 证件号码
     */
    @Column(name = "cert_no")
    private String certNo;

    /**
     * 英文名
     */
    @Column(name = "english_name")
    private String englishName;

    /**
     * 中英文名
     */
    @Column(name = "chinese_and_english_name")
    private String chineseAndEnglishName;

    /**
     * 城市
     */
    private String city;

    /**
     * 工作所在地
     */
    @Column(name = "job_location")
    private String jobLocation;

    /**
     * 部门
     */
    private String department;

    /**
     * 部门编码
     */
    @Column(name = "department_code")
    private String departmentCode;

    /**
     * 与被保人关系
     */
    @Column(name = "reporter_insured_relation")
    private String reporterInsuredRelation;

    /**
     * 人员类型
     */
    @Column(name = "personnelType")
    private String personneltype;

    /**
     * 事故原因
     */
    @Column(name = "accident_reason")
    private String accidentReason;

    /**
     * 出险日期
     */
    @Column(name = "accident_date")
    private Date accidentDate;

    /**
     * 出险月份
     */
    @Column(name = "accident_month")
    private Date accidentMonth;

    /**
     * 报案日期
     */
    @Column(name = "report_date")
    private Date reportDate;

    /**
     * 立案号
     */
    @Column(name = "register_no")
    private String registerNo;

    /**
     * 险种名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 责任名称
     */
    @Column(name = "liability_name")
    private String liabilityName;

    /**
     * 就诊医院
     */
    @Column(name = "hospital_name")
    private String hospitalName;

    /**
     * 就诊科室
     */
    @Column(name = "hospital_department_name")
    private String hospitalDepartmentName;

    /**
     * 诊断
     */
    private String diagnosis;

    /**
     * ICD10—疾病编码
     */
    @Column(name = "disease_code")
    private String diseaseCode;

    /**
     * 索赔金额
     */
    @Column(name = "claim_amount")
    private BigDecimal claimAmount;

    /**
     * 中草药费用
     */
    @Column(name = "herbal_medicine_fee")
    private BigDecimal herbalMedicineFee;

    /**
     * 理疗费用
     */
    @Column(name = "therapy_fee")
    private BigDecimal therapyFee;

    /**
     * 医保扣除金额
     */
    @Column(name = "medicare_deduct_amount")
    private BigDecimal medicareDeductAmount;

    /**
     * 不合理金额
     */
    @Column(name = "nonresponsible_amount")
    private BigDecimal nonresponsibleAmount;

    /**
     * 医保支付金额
     */
    @Column(name = "medicare_pay_amount")
    private BigDecimal medicarePayAmount;

    /**
     * 第三方支付
     */
    @Column(name = "other_amount")
    private BigDecimal otherAmount;

    /**
     * 审核金额
     */
    @Column(name = "check_amount")
    private BigDecimal checkAmount;

    /**
     * 赔付比例
     */
    @Column(name = "paid_proportion")
    private BigDecimal paidProportion;

    /**
     * 赔付金额
     */
    @Column(name = "paid_amount")
    private BigDecimal paidAmount;

    /**
     * 扣除说明
     */
    @Column(name = "deduct_instruction")
    private String deductInstruction;

    /**
     * 案件状态
     */
    @Column(name = "case_status")
    private String caseStatus;

    /**
     * 结案日期
     */
    @Column(name = "close_date")
    private Date closeDate;

    /**
     * 结案月份
     */
    @Column(name = "close_month")
    private Date closeMonth;

    /**
     * 结案时效
     */
    @Column(name = "close_duration")
    private String closeDuration;

    /**
     * 开户行
     */
    @Column(name = "account_bank_name")
    private String accountBankName;

    /**
     * 账户名
     */
    @Column(name = "trans_account_name")
    private String transAccountName;

    /**
     * 账户
     */
    @Column(name = "trans_account")
    private String transAccount;

    /**
     * 转账日期
     */
    @Column(name = "trans_date")
    private Date transDate;

    /**
     * 转账时效
     */
    @Column(name = "trans_duration")
    private String transDuration;

    /**
     * 备注
     */
    private String remark;

    /**
     * 来源
     */
    private String source;

    /**
     * TPA案件号
     */
    @Column(name = "tpa_case_no")
    private String tpaCaseNo;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * 获取投保人编号
     *
     * @return app_holder_no - 投保人编号
     */
    public String getAppHolderNo() {
        return appHolderNo;
    }

    /**
     * 设置投保人编号
     *
     * @param appHolderNo 投保人编号
     */
    public void setAppHolderNo(String appHolderNo) {
        this.appHolderNo = appHolderNo;
    }

    /**
     * 获取投保人姓名
     *
     * @return app_holder_name - 投保人姓名
     */
    public String getAppHolderName() {
        return appHolderName;
    }

    /**
     * 设置投保人姓名
     *
     * @param appHolderName 投保人姓名
     */
    public void setAppHolderName(String appHolderName) {
        this.appHolderName = appHolderName;
    }

    /**
     * 获取团体保单号
     *
     * @return group_policy_no - 团体保单号
     */
    public String getGroupPolicyNo() {
        return groupPolicyNo;
    }

    /**
     * 设置团体保单号
     *
     * @param groupPolicyNo 团体保单号
     */
    public void setGroupPolicyNo(String groupPolicyNo) {
        this.groupPolicyNo = groupPolicyNo;
    }

    /**
     * 获取分单号
     *
     * @return individual_policy_no - 分单号
     */
    public String getIndividualPolicyNo() {
        return individualPolicyNo;
    }

    /**
     * 设置分单号
     *
     * @param individualPolicyNo 分单号
     */
    public void setIndividualPolicyNo(String individualPolicyNo) {
        this.individualPolicyNo = individualPolicyNo;
    }

    /**
     * 获取保险计划
     *
     * @return plan_name - 保险计划
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * 设置保险计划
     *
     * @param planName 保险计划
     */
    public void setPlanName(String planName) {
        this.planName = planName;
    }

    /**
     * 获取客户号
     *
     * @return cust_no - 客户号
     */
    public String getCustNo() {
        return custNo;
    }

    /**
     * 设置客户号
     *
     * @param custNo 客户号
     */
    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    /**
     * 获取被保险人姓名
     *
     * @return insurance_name - 被保险人姓名
     */
    public String getInsuranceName() {
        return insuranceName;
    }

    /**
     * 设置被保险人姓名
     *
     * @param insuranceName 被保险人姓名
     */
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取出生日期
     *
     * @return birth_date - 出生日期
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * 设置出生日期
     *
     * @param birthDate 出生日期
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * 获取证件类型
     *
     * @return cert_type - 证件类型
     */
    public String getCertType() {
        return certType;
    }

    /**
     * 设置证件类型
     *
     * @param certType 证件类型
     */
    public void setCertType(String certType) {
        this.certType = certType;
    }

    /**
     * 获取证件号码
     *
     * @return cert_no - 证件号码
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * 设置证件号码
     *
     * @param certNo 证件号码
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    /**
     * 获取英文名
     *
     * @return english_name - 英文名
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * 设置英文名
     *
     * @param englishName 英文名
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    /**
     * 获取中英文名
     *
     * @return chinese_and_english_name - 中英文名
     */
    public String getChineseAndEnglishName() {
        return chineseAndEnglishName;
    }

    /**
     * 设置中英文名
     *
     * @param chineseAndEnglishName 中英文名
     */
    public void setChineseAndEnglishName(String chineseAndEnglishName) {
        this.chineseAndEnglishName = chineseAndEnglishName;
    }

    /**
     * 获取城市
     *
     * @return city - 城市
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取工作所在地
     *
     * @return job_location - 工作所在地
     */
    public String getJobLocation() {
        return jobLocation;
    }

    /**
     * 设置工作所在地
     *
     * @param jobLocation 工作所在地
     */
    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    /**
     * 获取部门
     *
     * @return department - 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置部门
     *
     * @param department 部门
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取部门编码
     *
     * @return department_code - 部门编码
     */
    public String getDepartmentCode() {
        return departmentCode;
    }

    /**
     * 设置部门编码
     *
     * @param departmentCode 部门编码
     */
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    /**
     * 获取与被保人关系
     *
     * @return reporter_insured_relation - 与被保人关系
     */
    public String getReporterInsuredRelation() {
        return reporterInsuredRelation;
    }

    /**
     * 设置与被保人关系
     *
     * @param reporterInsuredRelation 与被保人关系
     */
    public void setReporterInsuredRelation(String reporterInsuredRelation) {
        this.reporterInsuredRelation = reporterInsuredRelation;
    }

    /**
     * 获取人员类型
     *
     * @return personnelType - 人员类型
     */
    public String getPersonneltype() {
        return personneltype;
    }

    /**
     * 设置人员类型
     *
     * @param personneltype 人员类型
     */
    public void setPersonneltype(String personneltype) {
        this.personneltype = personneltype;
    }

    /**
     * 获取事故原因
     *
     * @return accident_reason - 事故原因
     */
    public String getAccidentReason() {
        return accidentReason;
    }

    /**
     * 设置事故原因
     *
     * @param accidentReason 事故原因
     */
    public void setAccidentReason(String accidentReason) {
        this.accidentReason = accidentReason;
    }

    /**
     * 获取出险日期
     *
     * @return accident_date - 出险日期
     */
    public Date getAccidentDate() {
        return accidentDate;
    }

    /**
     * 设置出险日期
     *
     * @param accidentDate 出险日期
     */
    public void setAccidentDate(Date accidentDate) {
        this.accidentDate = accidentDate;
    }

    /**
     * 获取出险月份
     *
     * @return accident_month - 出险月份
     */
    public Date getAccidentMonth() {
        return accidentMonth;
    }

    /**
     * 设置出险月份
     *
     * @param accidentMonth 出险月份
     */
    public void setAccidentMonth(Date accidentMonth) {
        this.accidentMonth = accidentMonth;
    }

    /**
     * 获取报案日期
     *
     * @return report_date - 报案日期
     */
    public Date getReportDate() {
        return reportDate;
    }

    /**
     * 设置报案日期
     *
     * @param reportDate 报案日期
     */
    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * 获取立案号
     *
     * @return register_no - 立案号
     */
    public String getRegisterNo() {
        return registerNo;
    }

    /**
     * 设置立案号
     *
     * @param registerNo 立案号
     */
    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }

    /**
     * 获取险种名称
     *
     * @return product_name - 险种名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置险种名称
     *
     * @param productName 险种名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取责任名称
     *
     * @return liability_name - 责任名称
     */
    public String getLiabilityName() {
        return liabilityName;
    }

    /**
     * 设置责任名称
     *
     * @param liabilityName 责任名称
     */
    public void setLiabilityName(String liabilityName) {
        this.liabilityName = liabilityName;
    }

    /**
     * 获取就诊医院
     *
     * @return hospital_name - 就诊医院
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * 设置就诊医院
     *
     * @param hospitalName 就诊医院
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * 获取就诊科室
     *
     * @return hospital_department_name - 就诊科室
     */
    public String getHospitalDepartmentName() {
        return hospitalDepartmentName;
    }

    /**
     * 设置就诊科室
     *
     * @param hospitalDepartmentName 就诊科室
     */
    public void setHospitalDepartmentName(String hospitalDepartmentName) {
        this.hospitalDepartmentName = hospitalDepartmentName;
    }

    /**
     * 获取诊断
     *
     * @return diagnosis - 诊断
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * 设置诊断
     *
     * @param diagnosis 诊断
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * 获取ICD10—疾病编码
     *
     * @return disease_code - ICD10—疾病编码
     */
    public String getDiseaseCode() {
        return diseaseCode;
    }

    /**
     * 设置ICD10—疾病编码
     *
     * @param diseaseCode ICD10—疾病编码
     */
    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    /**
     * 获取索赔金额
     *
     * @return claim_amount - 索赔金额
     */
    public BigDecimal getClaimAmount() {
        return claimAmount;
    }

    /**
     * 设置索赔金额
     *
     * @param claimAmount 索赔金额
     */
    public void setClaimAmount(BigDecimal claimAmount) {
        this.claimAmount = claimAmount;
    }

    /**
     * 获取中草药费用
     *
     * @return herbal_medicine_fee - 中草药费用
     */
    public BigDecimal getHerbalMedicineFee() {
        return herbalMedicineFee;
    }

    /**
     * 设置中草药费用
     *
     * @param herbalMedicineFee 中草药费用
     */
    public void setHerbalMedicineFee(BigDecimal herbalMedicineFee) {
        this.herbalMedicineFee = herbalMedicineFee;
    }

    /**
     * 获取理疗费用
     *
     * @return therapy_fee - 理疗费用
     */
    public BigDecimal getTherapyFee() {
        return therapyFee;
    }

    /**
     * 设置理疗费用
     *
     * @param therapyFee 理疗费用
     */
    public void setTherapyFee(BigDecimal therapyFee) {
        this.therapyFee = therapyFee;
    }

    /**
     * 获取医保扣除金额
     *
     * @return medicare_deduct_amount - 医保扣除金额
     */
    public BigDecimal getMedicareDeductAmount() {
        return medicareDeductAmount;
    }

    /**
     * 设置医保扣除金额
     *
     * @param medicareDeductAmount 医保扣除金额
     */
    public void setMedicareDeductAmount(BigDecimal medicareDeductAmount) {
        this.medicareDeductAmount = medicareDeductAmount;
    }

    /**
     * 获取不合理金额
     *
     * @return nonresponsible_amount - 不合理金额
     */
    public BigDecimal getNonresponsibleAmount() {
        return nonresponsibleAmount;
    }

    /**
     * 设置不合理金额
     *
     * @param nonresponsibleAmount 不合理金额
     */
    public void setNonresponsibleAmount(BigDecimal nonresponsibleAmount) {
        this.nonresponsibleAmount = nonresponsibleAmount;
    }

    /**
     * 获取医保支付金额
     *
     * @return medicare_pay_amount - 医保支付金额
     */
    public BigDecimal getMedicarePayAmount() {
        return medicarePayAmount;
    }

    /**
     * 设置医保支付金额
     *
     * @param medicarePayAmount 医保支付金额
     */
    public void setMedicarePayAmount(BigDecimal medicarePayAmount) {
        this.medicarePayAmount = medicarePayAmount;
    }

    /**
     * 获取第三方支付
     *
     * @return other_amount - 第三方支付
     */
    public BigDecimal getOtherAmount() {
        return otherAmount;
    }

    /**
     * 设置第三方支付
     *
     * @param otherAmount 第三方支付
     */
    public void setOtherAmount(BigDecimal otherAmount) {
        this.otherAmount = otherAmount;
    }

    /**
     * 获取审核金额
     *
     * @return check_amount - 审核金额
     */
    public BigDecimal getCheckAmount() {
        return checkAmount;
    }

    /**
     * 设置审核金额
     *
     * @param checkAmount 审核金额
     */
    public void setCheckAmount(BigDecimal checkAmount) {
        this.checkAmount = checkAmount;
    }

    /**
     * 获取赔付比例
     *
     * @return paid_proportion - 赔付比例
     */
    public BigDecimal getPaidProportion() {
        return paidProportion;
    }

    /**
     * 设置赔付比例
     *
     * @param paidProportion 赔付比例
     */
    public void setPaidProportion(BigDecimal paidProportion) {
        this.paidProportion = paidProportion;
    }

    /**
     * 获取赔付金额
     *
     * @return paid_amount - 赔付金额
     */
    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    /**
     * 设置赔付金额
     *
     * @param paidAmount 赔付金额
     */
    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * 获取扣除说明
     *
     * @return deduct_instruction - 扣除说明
     */
    public String getDeductInstruction() {
        return deductInstruction;
    }

    /**
     * 设置扣除说明
     *
     * @param deductInstruction 扣除说明
     */
    public void setDeductInstruction(String deductInstruction) {
        this.deductInstruction = deductInstruction;
    }

    /**
     * 获取案件状态
     *
     * @return case_status - 案件状态
     */
    public String getCaseStatus() {
        return caseStatus;
    }

    /**
     * 设置案件状态
     *
     * @param caseStatus 案件状态
     */
    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    /**
     * 获取结案日期
     *
     * @return close_date - 结案日期
     */
    public Date getCloseDate() {
        return closeDate;
    }

    /**
     * 设置结案日期
     *
     * @param closeDate 结案日期
     */
    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    /**
     * 获取结案月份
     *
     * @return close_month - 结案月份
     */
    public Date getCloseMonth() {
        return closeMonth;
    }

    /**
     * 设置结案月份
     *
     * @param closeMonth 结案月份
     */
    public void setCloseMonth(Date closeMonth) {
        this.closeMonth = closeMonth;
    }

    /**
     * 获取结案时效
     *
     * @return close_duration - 结案时效
     */
    public String getCloseDuration() {
        return closeDuration;
    }

    /**
     * 设置结案时效
     *
     * @param closeDuration 结案时效
     */
    public void setCloseDuration(String closeDuration) {
        this.closeDuration = closeDuration;
    }

    /**
     * 获取开户行
     *
     * @return account_bank_name - 开户行
     */
    public String getAccountBankName() {
        return accountBankName;
    }

    /**
     * 设置开户行
     *
     * @param accountBankName 开户行
     */
    public void setAccountBankName(String accountBankName) {
        this.accountBankName = accountBankName;
    }

    /**
     * 获取账户名
     *
     * @return trans_account_name - 账户名
     */
    public String getTransAccountName() {
        return transAccountName;
    }

    /**
     * 设置账户名
     *
     * @param transAccountName 账户名
     */
    public void setTransAccountName(String transAccountName) {
        this.transAccountName = transAccountName;
    }

    /**
     * 获取账户
     *
     * @return trans_account - 账户
     */
    public String getTransAccount() {
        return transAccount;
    }

    /**
     * 设置账户
     *
     * @param transAccount 账户
     */
    public void setTransAccount(String transAccount) {
        this.transAccount = transAccount;
    }

    /**
     * 获取转账日期
     *
     * @return trans_date - 转账日期
     */
    public Date getTransDate() {
        return transDate;
    }

    /**
     * 设置转账日期
     *
     * @param transDate 转账日期
     */
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    /**
     * 获取转账时效
     *
     * @return trans_duration - 转账时效
     */
    public String getTransDuration() {
        return transDuration;
    }

    /**
     * 设置转账时效
     *
     * @param transDuration 转账时效
     */
    public void setTransDuration(String transDuration) {
        this.transDuration = transDuration;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取来源
     *
     * @return source - 来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置来源
     *
     * @param source 来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取TPA案件号
     *
     * @return tpa_case_no - TPA案件号
     */
    public String getTpaCaseNo() {
        return tpaCaseNo;
    }

    /**
     * 设置TPA案件号
     *
     * @param tpaCaseNo TPA案件号
     */
    public void setTpaCaseNo(String tpaCaseNo) {
        this.tpaCaseNo = tpaCaseNo;
    }
}