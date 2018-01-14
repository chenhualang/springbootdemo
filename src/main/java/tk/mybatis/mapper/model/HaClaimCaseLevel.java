package tk.mybatis.mapper.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ha_claim_case_level")
public class HaClaimCaseLevel {
    /**
     * ����id
     */
    @Id
    private Long id;

    /**
     * ������
     */
    @Column(name = "report_no")
    private String reportNo;

    /**
     * ����
     */
    private Integer score;

    /**
     * ���⼶��Ĭ��Ϊ��1
     */
    private Double level;

    /**
     * ��չ�ֶ�
     */
    @Column(name = "extra_info")
    private String extraInfo;

    /**
     * ������
     */
    private String creator;

    /**
     * ����ʱ��
     */
    @Column(name = "gmt_created")
    private Date gmtCreated;

    /**
     * �޸���
     */
    private String modifier;

    /**
     * �޸�ʱ��
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * �Ƿ�ɾ�� Y/N
     */
    @Column(name = "is_deleted")
    private String isDeleted;

    /**
     * ����ID
     */
    @Column(name = "claim_id")
    private Long claimId;

    /**
     * ��������
     */
    @Column(name = "insured_name")
    private String insuredName;

    /**
     * ��������ID
     */
    @Column(name = "insured_id")
    private Long insuredId;

    /**
     * Ͷ����
     */
    private String applicant;

    /**
     * Ͷ����ID
     */
    @Column(name = "applicant_id")
    private Long applicantId;

    /**
     * ��Ʒ����
     */
    @Column(name = "policy_product_name")
    private String policyProductName;

    /**
     * ��ƷID
     */
    @Column(name = "policy_product_id")
    private Long policyProductId;

    /**
     * ������
     */
    @Column(name = "policy_no")
    private String policyNo;

    /**
     * ����ID
     */
    @Column(name = "policy_id")
    private Long policyId;

    /**
     * ����ʱ��
     */
    @Column(name = "report_date")
    private Date reportDate;

    /**
     * ��ȡ����id
     *
     * @return id - ����id
     */
    public Long getId() {
        return id;
    }

    /**
     * ��������id
     *
     * @param id ����id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * ��ȡ������
     *
     * @return report_no - ������
     */
    public String getReportNo() {
        return reportNo;
    }

    /**
     * ���ñ�����
     *
     * @param reportNo ������
     */
    public void setReportNo(String reportNo) {
        this.reportNo = reportNo;
    }

    /**
     * ��ȡ����
     *
     * @return score - ����
     */
    public Integer getScore() {
        return score;
    }

    /**
     * ��������
     *
     * @param score ����
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * ��ȡ���⼶��Ĭ��Ϊ��1
     *
     * @return level - ���⼶��Ĭ��Ϊ��1
     */
    public Double getLevel() {
        return level;
    }

    /**
     * �������⼶��Ĭ��Ϊ��1
     *
     * @param level ���⼶��Ĭ��Ϊ��1
     */
    public void setLevel(Double level) {
        this.level = level;
    }

    /**
     * ��ȡ��չ�ֶ�
     *
     * @return extra_info - ��չ�ֶ�
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * ������չ�ֶ�
     *
     * @param extraInfo ��չ�ֶ�
     */
    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
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
     * ��ȡ�Ƿ�ɾ�� Y/N
     *
     * @return is_deleted - �Ƿ�ɾ�� Y/N
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * �����Ƿ�ɾ�� Y/N
     *
     * @param isDeleted �Ƿ�ɾ�� Y/N
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * ��ȡ����ID
     *
     * @return claim_id - ����ID
     */
    public Long getClaimId() {
        return claimId;
    }

    /**
     * ���ð���ID
     *
     * @param claimId ����ID
     */
    public void setClaimId(Long claimId) {
        this.claimId = claimId;
    }

    /**
     * ��ȡ��������
     *
     * @return insured_name - ��������
     */
    public String getInsuredName() {
        return insuredName;
    }

    /**
     * ���ñ�������
     *
     * @param insuredName ��������
     */
    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    /**
     * ��ȡ��������ID
     *
     * @return insured_id - ��������ID
     */
    public Long getInsuredId() {
        return insuredId;
    }

    /**
     * ���ñ�������ID
     *
     * @param insuredId ��������ID
     */
    public void setInsuredId(Long insuredId) {
        this.insuredId = insuredId;
    }

    /**
     * ��ȡͶ����
     *
     * @return applicant - Ͷ����
     */
    public String getApplicant() {
        return applicant;
    }

    /**
     * ����Ͷ����
     *
     * @param applicant Ͷ����
     */
    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    /**
     * ��ȡͶ����ID
     *
     * @return applicant_id - Ͷ����ID
     */
    public Long getApplicantId() {
        return applicantId;
    }

    /**
     * ����Ͷ����ID
     *
     * @param applicantId Ͷ����ID
     */
    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

    /**
     * ��ȡ��Ʒ����
     *
     * @return policy_product_name - ��Ʒ����
     */
    public String getPolicyProductName() {
        return policyProductName;
    }

    /**
     * ���ò�Ʒ����
     *
     * @param policyProductName ��Ʒ����
     */
    public void setPolicyProductName(String policyProductName) {
        this.policyProductName = policyProductName;
    }

    /**
     * ��ȡ��ƷID
     *
     * @return policy_product_id - ��ƷID
     */
    public Long getPolicyProductId() {
        return policyProductId;
    }

    /**
     * ���ò�ƷID
     *
     * @param policyProductId ��ƷID
     */
    public void setPolicyProductId(Long policyProductId) {
        this.policyProductId = policyProductId;
    }

    /**
     * ��ȡ������
     *
     * @return policy_no - ������
     */
    public String getPolicyNo() {
        return policyNo;
    }

    /**
     * ���ñ�����
     *
     * @param policyNo ������
     */
    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    /**
     * ��ȡ����ID
     *
     * @return policy_id - ����ID
     */
    public Long getPolicyId() {
        return policyId;
    }

    /**
     * ���ñ���ID
     *
     * @param policyId ����ID
     */
    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return report_date - ����ʱ��
     */
    public Date getReportDate() {
        return reportDate;
    }

    /**
     * ���ñ���ʱ��
     *
     * @param reportDate ����ʱ��
     */
    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }
}