package tk.mybatis.mapper.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ha_tpa_report")
public class HaTpaReport {
    /**
     * ���
     */
    @Column(name = "serial_no")
    private String serialNo;

    /**
     * Ͷ���˱��
     */
    @Column(name = "app_holder_no")
    private String appHolderNo;

    /**
     * Ͷ��������
     */
    @Column(name = "app_holder_name")
    private String appHolderName;

    /**
     * ���屣����
     */
    @Column(name = "group_policy_no")
    private String groupPolicyNo;

    /**
     * �ֵ���
     */
    @Column(name = "individual_policy_no")
    private String individualPolicyNo;

    /**
     * ���ռƻ�
     */
    @Column(name = "plan_name")
    private String planName;

    /**
     * �ͻ���
     */
    @Column(name = "cust_no")
    private String custNo;

    /**
     * ������������
     */
    @Column(name = "insurance_name")
    private String insuranceName;

    /**
     * �Ա�
     */
    private String sex;

    /**
     * ��������
     */
    @Column(name = "birth_date")
    private Date birthDate;

    /**
     * ֤������
     */
    @Column(name = "cert_type")
    private String certType;

    /**
     * ֤������
     */
    @Column(name = "cert_no")
    private String certNo;

    /**
     * Ӣ����
     */
    @Column(name = "english_name")
    private String englishName;

    /**
     * ��Ӣ����
     */
    @Column(name = "chinese_and_english_name")
    private String chineseAndEnglishName;

    /**
     * ����
     */
    private String city;

    /**
     * �������ڵ�
     */
    @Column(name = "job_location")
    private String jobLocation;

    /**
     * ����
     */
    private String department;

    /**
     * ���ű���
     */
    @Column(name = "department_code")
    private String departmentCode;

    /**
     * �뱻���˹�ϵ
     */
    @Column(name = "reporter_insured_relation")
    private String reporterInsuredRelation;

    /**
     * ��Ա����
     */
    @Column(name = "personnelType")
    private String personneltype;

    /**
     * �¹�ԭ��
     */
    @Column(name = "accident_reason")
    private String accidentReason;

    /**
     * ��������
     */
    @Column(name = "accident_date")
    private Date accidentDate;

    /**
     * �����·�
     */
    @Column(name = "accident_month")
    private Date accidentMonth;

    /**
     * ��������
     */
    @Column(name = "report_date")
    private Date reportDate;

    /**
     * ������
     */
    @Column(name = "register_no")
    private String registerNo;

    /**
     * ��������
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * ��������
     */
    @Column(name = "liability_name")
    private String liabilityName;

    /**
     * ����ҽԺ
     */
    @Column(name = "hospital_name")
    private String hospitalName;

    /**
     * �������
     */
    @Column(name = "hospital_department_name")
    private String hospitalDepartmentName;

    /**
     * ���
     */
    private String diagnosis;

    /**
     * ICD10����������
     */
    @Column(name = "disease_code")
    private String diseaseCode;

    /**
     * ������
     */
    @Column(name = "claim_amount")
    private BigDecimal claimAmount;

    /**
     * �в�ҩ����
     */
    @Column(name = "herbal_medicine_fee")
    private BigDecimal herbalMedicineFee;

    /**
     * ���Ʒ���
     */
    @Column(name = "therapy_fee")
    private BigDecimal therapyFee;

    /**
     * ҽ���۳����
     */
    @Column(name = "medicare_deduct_amount")
    private BigDecimal medicareDeductAmount;

    /**
     * ��������
     */
    @Column(name = "nonresponsible_amount")
    private BigDecimal nonresponsibleAmount;

    /**
     * ҽ��֧�����
     */
    @Column(name = "medicare_pay_amount")
    private BigDecimal medicarePayAmount;

    /**
     * ������֧��
     */
    @Column(name = "other_amount")
    private BigDecimal otherAmount;

    /**
     * ��˽��
     */
    @Column(name = "check_amount")
    private BigDecimal checkAmount;

    /**
     * �⸶����
     */
    @Column(name = "paid_proportion")
    private BigDecimal paidProportion;

    /**
     * �⸶���
     */
    @Column(name = "paid_amount")
    private BigDecimal paidAmount;

    /**
     * �۳�˵��
     */
    @Column(name = "deduct_instruction")
    private String deductInstruction;

    /**
     * ����״̬
     */
    @Column(name = "case_status")
    private String caseStatus;

    /**
     * �᰸����
     */
    @Column(name = "close_date")
    private Date closeDate;

    /**
     * �᰸�·�
     */
    @Column(name = "close_month")
    private Date closeMonth;

    /**
     * �᰸ʱЧ
     */
    @Column(name = "close_duration")
    private String closeDuration;

    /**
     * ������
     */
    @Column(name = "account_bank_name")
    private String accountBankName;

    /**
     * �˻���
     */
    @Column(name = "trans_account_name")
    private String transAccountName;

    /**
     * �˻�
     */
    @Column(name = "trans_account")
    private String transAccount;

    /**
     * ת������
     */
    @Column(name = "trans_date")
    private Date transDate;

    /**
     * ת��ʱЧ
     */
    @Column(name = "trans_duration")
    private String transDuration;

    /**
     * ��ע
     */
    private String remark;

    /**
     * ��Դ
     */
    private String source;

    /**
     * TPA������
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
     * ��ȡͶ���˱��
     *
     * @return app_holder_no - Ͷ���˱��
     */
    public String getAppHolderNo() {
        return appHolderNo;
    }

    /**
     * ����Ͷ���˱��
     *
     * @param appHolderNo Ͷ���˱��
     */
    public void setAppHolderNo(String appHolderNo) {
        this.appHolderNo = appHolderNo;
    }

    /**
     * ��ȡͶ��������
     *
     * @return app_holder_name - Ͷ��������
     */
    public String getAppHolderName() {
        return appHolderName;
    }

    /**
     * ����Ͷ��������
     *
     * @param appHolderName Ͷ��������
     */
    public void setAppHolderName(String appHolderName) {
        this.appHolderName = appHolderName;
    }

    /**
     * ��ȡ���屣����
     *
     * @return group_policy_no - ���屣����
     */
    public String getGroupPolicyNo() {
        return groupPolicyNo;
    }

    /**
     * �������屣����
     *
     * @param groupPolicyNo ���屣����
     */
    public void setGroupPolicyNo(String groupPolicyNo) {
        this.groupPolicyNo = groupPolicyNo;
    }

    /**
     * ��ȡ�ֵ���
     *
     * @return individual_policy_no - �ֵ���
     */
    public String getIndividualPolicyNo() {
        return individualPolicyNo;
    }

    /**
     * ���÷ֵ���
     *
     * @param individualPolicyNo �ֵ���
     */
    public void setIndividualPolicyNo(String individualPolicyNo) {
        this.individualPolicyNo = individualPolicyNo;
    }

    /**
     * ��ȡ���ռƻ�
     *
     * @return plan_name - ���ռƻ�
     */
    public String getPlanName() {
        return planName;
    }

    /**
     * ���ñ��ռƻ�
     *
     * @param planName ���ռƻ�
     */
    public void setPlanName(String planName) {
        this.planName = planName;
    }

    /**
     * ��ȡ�ͻ���
     *
     * @return cust_no - �ͻ���
     */
    public String getCustNo() {
        return custNo;
    }

    /**
     * ���ÿͻ���
     *
     * @param custNo �ͻ���
     */
    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    /**
     * ��ȡ������������
     *
     * @return insurance_name - ������������
     */
    public String getInsuranceName() {
        return insuranceName;
    }

    /**
     * ���ñ�����������
     *
     * @param insuranceName ������������
     */
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    /**
     * ��ȡ�Ա�
     *
     * @return sex - �Ա�
     */
    public String getSex() {
        return sex;
    }

    /**
     * �����Ա�
     *
     * @param sex �Ա�
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * ��ȡ��������
     *
     * @return birth_date - ��������
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * ���ó�������
     *
     * @param birthDate ��������
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * ��ȡ֤������
     *
     * @return cert_type - ֤������
     */
    public String getCertType() {
        return certType;
    }

    /**
     * ����֤������
     *
     * @param certType ֤������
     */
    public void setCertType(String certType) {
        this.certType = certType;
    }

    /**
     * ��ȡ֤������
     *
     * @return cert_no - ֤������
     */
    public String getCertNo() {
        return certNo;
    }

    /**
     * ����֤������
     *
     * @param certNo ֤������
     */
    public void setCertNo(String certNo) {
        this.certNo = certNo;
    }

    /**
     * ��ȡӢ����
     *
     * @return english_name - Ӣ����
     */
    public String getEnglishName() {
        return englishName;
    }

    /**
     * ����Ӣ����
     *
     * @param englishName Ӣ����
     */
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    /**
     * ��ȡ��Ӣ����
     *
     * @return chinese_and_english_name - ��Ӣ����
     */
    public String getChineseAndEnglishName() {
        return chineseAndEnglishName;
    }

    /**
     * ������Ӣ����
     *
     * @param chineseAndEnglishName ��Ӣ����
     */
    public void setChineseAndEnglishName(String chineseAndEnglishName) {
        this.chineseAndEnglishName = chineseAndEnglishName;
    }

    /**
     * ��ȡ����
     *
     * @return city - ����
     */
    public String getCity() {
        return city;
    }

    /**
     * ���ó���
     *
     * @param city ����
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * ��ȡ�������ڵ�
     *
     * @return job_location - �������ڵ�
     */
    public String getJobLocation() {
        return jobLocation;
    }

    /**
     * ���ù������ڵ�
     *
     * @param jobLocation �������ڵ�
     */
    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    /**
     * ��ȡ����
     *
     * @return department - ����
     */
    public String getDepartment() {
        return department;
    }

    /**
     * ���ò���
     *
     * @param department ����
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * ��ȡ���ű���
     *
     * @return department_code - ���ű���
     */
    public String getDepartmentCode() {
        return departmentCode;
    }

    /**
     * ���ò��ű���
     *
     * @param departmentCode ���ű���
     */
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    /**
     * ��ȡ�뱻���˹�ϵ
     *
     * @return reporter_insured_relation - �뱻���˹�ϵ
     */
    public String getReporterInsuredRelation() {
        return reporterInsuredRelation;
    }

    /**
     * �����뱻���˹�ϵ
     *
     * @param reporterInsuredRelation �뱻���˹�ϵ
     */
    public void setReporterInsuredRelation(String reporterInsuredRelation) {
        this.reporterInsuredRelation = reporterInsuredRelation;
    }

    /**
     * ��ȡ��Ա����
     *
     * @return personnelType - ��Ա����
     */
    public String getPersonneltype() {
        return personneltype;
    }

    /**
     * ������Ա����
     *
     * @param personneltype ��Ա����
     */
    public void setPersonneltype(String personneltype) {
        this.personneltype = personneltype;
    }

    /**
     * ��ȡ�¹�ԭ��
     *
     * @return accident_reason - �¹�ԭ��
     */
    public String getAccidentReason() {
        return accidentReason;
    }

    /**
     * �����¹�ԭ��
     *
     * @param accidentReason �¹�ԭ��
     */
    public void setAccidentReason(String accidentReason) {
        this.accidentReason = accidentReason;
    }

    /**
     * ��ȡ��������
     *
     * @return accident_date - ��������
     */
    public Date getAccidentDate() {
        return accidentDate;
    }

    /**
     * ���ó�������
     *
     * @param accidentDate ��������
     */
    public void setAccidentDate(Date accidentDate) {
        this.accidentDate = accidentDate;
    }

    /**
     * ��ȡ�����·�
     *
     * @return accident_month - �����·�
     */
    public Date getAccidentMonth() {
        return accidentMonth;
    }

    /**
     * ���ó����·�
     *
     * @param accidentMonth �����·�
     */
    public void setAccidentMonth(Date accidentMonth) {
        this.accidentMonth = accidentMonth;
    }

    /**
     * ��ȡ��������
     *
     * @return report_date - ��������
     */
    public Date getReportDate() {
        return reportDate;
    }

    /**
     * ���ñ�������
     *
     * @param reportDate ��������
     */
    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * ��ȡ������
     *
     * @return register_no - ������
     */
    public String getRegisterNo() {
        return registerNo;
    }

    /**
     * ����������
     *
     * @param registerNo ������
     */
    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }

    /**
     * ��ȡ��������
     *
     * @return product_name - ��������
     */
    public String getProductName() {
        return productName;
    }

    /**
     * ������������
     *
     * @param productName ��������
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * ��ȡ��������
     *
     * @return liability_name - ��������
     */
    public String getLiabilityName() {
        return liabilityName;
    }

    /**
     * ������������
     *
     * @param liabilityName ��������
     */
    public void setLiabilityName(String liabilityName) {
        this.liabilityName = liabilityName;
    }

    /**
     * ��ȡ����ҽԺ
     *
     * @return hospital_name - ����ҽԺ
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * ���þ���ҽԺ
     *
     * @param hospitalName ����ҽԺ
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * ��ȡ�������
     *
     * @return hospital_department_name - �������
     */
    public String getHospitalDepartmentName() {
        return hospitalDepartmentName;
    }

    /**
     * ���þ������
     *
     * @param hospitalDepartmentName �������
     */
    public void setHospitalDepartmentName(String hospitalDepartmentName) {
        this.hospitalDepartmentName = hospitalDepartmentName;
    }

    /**
     * ��ȡ���
     *
     * @return diagnosis - ���
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * �������
     *
     * @param diagnosis ���
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * ��ȡICD10����������
     *
     * @return disease_code - ICD10����������
     */
    public String getDiseaseCode() {
        return diseaseCode;
    }

    /**
     * ����ICD10����������
     *
     * @param diseaseCode ICD10����������
     */
    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    /**
     * ��ȡ������
     *
     * @return claim_amount - ������
     */
    public BigDecimal getClaimAmount() {
        return claimAmount;
    }

    /**
     * ����������
     *
     * @param claimAmount ������
     */
    public void setClaimAmount(BigDecimal claimAmount) {
        this.claimAmount = claimAmount;
    }

    /**
     * ��ȡ�в�ҩ����
     *
     * @return herbal_medicine_fee - �в�ҩ����
     */
    public BigDecimal getHerbalMedicineFee() {
        return herbalMedicineFee;
    }

    /**
     * �����в�ҩ����
     *
     * @param herbalMedicineFee �в�ҩ����
     */
    public void setHerbalMedicineFee(BigDecimal herbalMedicineFee) {
        this.herbalMedicineFee = herbalMedicineFee;
    }

    /**
     * ��ȡ���Ʒ���
     *
     * @return therapy_fee - ���Ʒ���
     */
    public BigDecimal getTherapyFee() {
        return therapyFee;
    }

    /**
     * �������Ʒ���
     *
     * @param therapyFee ���Ʒ���
     */
    public void setTherapyFee(BigDecimal therapyFee) {
        this.therapyFee = therapyFee;
    }

    /**
     * ��ȡҽ���۳����
     *
     * @return medicare_deduct_amount - ҽ���۳����
     */
    public BigDecimal getMedicareDeductAmount() {
        return medicareDeductAmount;
    }

    /**
     * ����ҽ���۳����
     *
     * @param medicareDeductAmount ҽ���۳����
     */
    public void setMedicareDeductAmount(BigDecimal medicareDeductAmount) {
        this.medicareDeductAmount = medicareDeductAmount;
    }

    /**
     * ��ȡ��������
     *
     * @return nonresponsible_amount - ��������
     */
    public BigDecimal getNonresponsibleAmount() {
        return nonresponsibleAmount;
    }

    /**
     * ���ò�������
     *
     * @param nonresponsibleAmount ��������
     */
    public void setNonresponsibleAmount(BigDecimal nonresponsibleAmount) {
        this.nonresponsibleAmount = nonresponsibleAmount;
    }

    /**
     * ��ȡҽ��֧�����
     *
     * @return medicare_pay_amount - ҽ��֧�����
     */
    public BigDecimal getMedicarePayAmount() {
        return medicarePayAmount;
    }

    /**
     * ����ҽ��֧�����
     *
     * @param medicarePayAmount ҽ��֧�����
     */
    public void setMedicarePayAmount(BigDecimal medicarePayAmount) {
        this.medicarePayAmount = medicarePayAmount;
    }

    /**
     * ��ȡ������֧��
     *
     * @return other_amount - ������֧��
     */
    public BigDecimal getOtherAmount() {
        return otherAmount;
    }

    /**
     * ���õ�����֧��
     *
     * @param otherAmount ������֧��
     */
    public void setOtherAmount(BigDecimal otherAmount) {
        this.otherAmount = otherAmount;
    }

    /**
     * ��ȡ��˽��
     *
     * @return check_amount - ��˽��
     */
    public BigDecimal getCheckAmount() {
        return checkAmount;
    }

    /**
     * ������˽��
     *
     * @param checkAmount ��˽��
     */
    public void setCheckAmount(BigDecimal checkAmount) {
        this.checkAmount = checkAmount;
    }

    /**
     * ��ȡ�⸶����
     *
     * @return paid_proportion - �⸶����
     */
    public BigDecimal getPaidProportion() {
        return paidProportion;
    }

    /**
     * �����⸶����
     *
     * @param paidProportion �⸶����
     */
    public void setPaidProportion(BigDecimal paidProportion) {
        this.paidProportion = paidProportion;
    }

    /**
     * ��ȡ�⸶���
     *
     * @return paid_amount - �⸶���
     */
    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    /**
     * �����⸶���
     *
     * @param paidAmount �⸶���
     */
    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * ��ȡ�۳�˵��
     *
     * @return deduct_instruction - �۳�˵��
     */
    public String getDeductInstruction() {
        return deductInstruction;
    }

    /**
     * ���ÿ۳�˵��
     *
     * @param deductInstruction �۳�˵��
     */
    public void setDeductInstruction(String deductInstruction) {
        this.deductInstruction = deductInstruction;
    }

    /**
     * ��ȡ����״̬
     *
     * @return case_status - ����״̬
     */
    public String getCaseStatus() {
        return caseStatus;
    }

    /**
     * ���ð���״̬
     *
     * @param caseStatus ����״̬
     */
    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    /**
     * ��ȡ�᰸����
     *
     * @return close_date - �᰸����
     */
    public Date getCloseDate() {
        return closeDate;
    }

    /**
     * ���ý᰸����
     *
     * @param closeDate �᰸����
     */
    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    /**
     * ��ȡ�᰸�·�
     *
     * @return close_month - �᰸�·�
     */
    public Date getCloseMonth() {
        return closeMonth;
    }

    /**
     * ���ý᰸�·�
     *
     * @param closeMonth �᰸�·�
     */
    public void setCloseMonth(Date closeMonth) {
        this.closeMonth = closeMonth;
    }

    /**
     * ��ȡ�᰸ʱЧ
     *
     * @return close_duration - �᰸ʱЧ
     */
    public String getCloseDuration() {
        return closeDuration;
    }

    /**
     * ���ý᰸ʱЧ
     *
     * @param closeDuration �᰸ʱЧ
     */
    public void setCloseDuration(String closeDuration) {
        this.closeDuration = closeDuration;
    }

    /**
     * ��ȡ������
     *
     * @return account_bank_name - ������
     */
    public String getAccountBankName() {
        return accountBankName;
    }

    /**
     * ���ÿ�����
     *
     * @param accountBankName ������
     */
    public void setAccountBankName(String accountBankName) {
        this.accountBankName = accountBankName;
    }

    /**
     * ��ȡ�˻���
     *
     * @return trans_account_name - �˻���
     */
    public String getTransAccountName() {
        return transAccountName;
    }

    /**
     * �����˻���
     *
     * @param transAccountName �˻���
     */
    public void setTransAccountName(String transAccountName) {
        this.transAccountName = transAccountName;
    }

    /**
     * ��ȡ�˻�
     *
     * @return trans_account - �˻�
     */
    public String getTransAccount() {
        return transAccount;
    }

    /**
     * �����˻�
     *
     * @param transAccount �˻�
     */
    public void setTransAccount(String transAccount) {
        this.transAccount = transAccount;
    }

    /**
     * ��ȡת������
     *
     * @return trans_date - ת������
     */
    public Date getTransDate() {
        return transDate;
    }

    /**
     * ����ת������
     *
     * @param transDate ת������
     */
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    /**
     * ��ȡת��ʱЧ
     *
     * @return trans_duration - ת��ʱЧ
     */
    public String getTransDuration() {
        return transDuration;
    }

    /**
     * ����ת��ʱЧ
     *
     * @param transDuration ת��ʱЧ
     */
    public void setTransDuration(String transDuration) {
        this.transDuration = transDuration;
    }

    /**
     * ��ȡ��ע
     *
     * @return remark - ��ע
     */
    public String getRemark() {
        return remark;
    }

    /**
     * ���ñ�ע
     *
     * @param remark ��ע
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * ��ȡ��Դ
     *
     * @return source - ��Դ
     */
    public String getSource() {
        return source;
    }

    /**
     * ������Դ
     *
     * @param source ��Դ
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * ��ȡTPA������
     *
     * @return tpa_case_no - TPA������
     */
    public String getTpaCaseNo() {
        return tpaCaseNo;
    }

    /**
     * ����TPA������
     *
     * @param tpaCaseNo TPA������
     */
    public void setTpaCaseNo(String tpaCaseNo) {
        this.tpaCaseNo = tpaCaseNo;
    }
}