package tk.mybatis.mapper.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ha_claim_case_level")
public class HaClaimCaseLevel {
    /**
     * 主键id
     */
    @Id
    private Long id;

    /**
     * 报案号
     */
    @Column(name = "report_no")
    private String reportNo;

    /**
     * 评分
     */
    private Integer score;

    /**
     * 理赔级别，默认为：1
     */
    private Double level;

    /**
     * 扩展字段
     */
    @Column(name = "extra_info")
    private String extraInfo;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "gmt_created")
    private Date gmtCreated;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 是否删除 Y/N
     */
    @Column(name = "is_deleted")
    private String isDeleted;

    /**
     * 案件ID
     */
    @Column(name = "claim_id")
    private Long claimId;

    /**
     * 被保险人
     */
    @Column(name = "insured_name")
    private String insuredName;

    /**
     * 被保险人ID
     */
    @Column(name = "insured_id")
    private Long insuredId;

    /**
     * 投保人
     */
    private String applicant;

    /**
     * 投保人ID
     */
    @Column(name = "applicant_id")
    private Long applicantId;

    /**
     * 产品名称
     */
    @Column(name = "policy_product_name")
    private String policyProductName;

    /**
     * 产品ID
     */
    @Column(name = "policy_product_id")
    private Long policyProductId;

    /**
     * 保单号
     */
    @Column(name = "policy_no")
    private String policyNo;

    /**
     * 保单ID
     */
    @Column(name = "policy_id")
    private Long policyId;

    /**
     * 报案时间
     */
    @Column(name = "report_date")
    private Date reportDate;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取报案号
     *
     * @return report_no - 报案号
     */
    public String getReportNo() {
        return reportNo;
    }

    /**
     * 设置报案号
     *
     * @param reportNo 报案号
     */
    public void setReportNo(String reportNo) {
        this.reportNo = reportNo;
    }

    /**
     * 获取评分
     *
     * @return score - 评分
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 设置评分
     *
     * @param score 评分
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取理赔级别，默认为：1
     *
     * @return level - 理赔级别，默认为：1
     */
    public Double getLevel() {
        return level;
    }

    /**
     * 设置理赔级别，默认为：1
     *
     * @param level 理赔级别，默认为：1
     */
    public void setLevel(Double level) {
        this.level = level;
    }

    /**
     * 获取扩展字段
     *
     * @return extra_info - 扩展字段
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * 设置扩展字段
     *
     * @param extraInfo 扩展字段
     */
    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
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
     * 获取是否删除 Y/N
     *
     * @return is_deleted - 是否删除 Y/N
     */
    public String getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除 Y/N
     *
     * @param isDeleted 是否删除 Y/N
     */
    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取案件ID
     *
     * @return claim_id - 案件ID
     */
    public Long getClaimId() {
        return claimId;
    }

    /**
     * 设置案件ID
     *
     * @param claimId 案件ID
     */
    public void setClaimId(Long claimId) {
        this.claimId = claimId;
    }

    /**
     * 获取被保险人
     *
     * @return insured_name - 被保险人
     */
    public String getInsuredName() {
        return insuredName;
    }

    /**
     * 设置被保险人
     *
     * @param insuredName 被保险人
     */
    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    /**
     * 获取被保险人ID
     *
     * @return insured_id - 被保险人ID
     */
    public Long getInsuredId() {
        return insuredId;
    }

    /**
     * 设置被保险人ID
     *
     * @param insuredId 被保险人ID
     */
    public void setInsuredId(Long insuredId) {
        this.insuredId = insuredId;
    }

    /**
     * 获取投保人
     *
     * @return applicant - 投保人
     */
    public String getApplicant() {
        return applicant;
    }

    /**
     * 设置投保人
     *
     * @param applicant 投保人
     */
    public void setApplicant(String applicant) {
        this.applicant = applicant;
    }

    /**
     * 获取投保人ID
     *
     * @return applicant_id - 投保人ID
     */
    public Long getApplicantId() {
        return applicantId;
    }

    /**
     * 设置投保人ID
     *
     * @param applicantId 投保人ID
     */
    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

    /**
     * 获取产品名称
     *
     * @return policy_product_name - 产品名称
     */
    public String getPolicyProductName() {
        return policyProductName;
    }

    /**
     * 设置产品名称
     *
     * @param policyProductName 产品名称
     */
    public void setPolicyProductName(String policyProductName) {
        this.policyProductName = policyProductName;
    }

    /**
     * 获取产品ID
     *
     * @return policy_product_id - 产品ID
     */
    public Long getPolicyProductId() {
        return policyProductId;
    }

    /**
     * 设置产品ID
     *
     * @param policyProductId 产品ID
     */
    public void setPolicyProductId(Long policyProductId) {
        this.policyProductId = policyProductId;
    }

    /**
     * 获取保单号
     *
     * @return policy_no - 保单号
     */
    public String getPolicyNo() {
        return policyNo;
    }

    /**
     * 设置保单号
     *
     * @param policyNo 保单号
     */
    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    /**
     * 获取保单ID
     *
     * @return policy_id - 保单ID
     */
    public Long getPolicyId() {
        return policyId;
    }

    /**
     * 设置保单ID
     *
     * @param policyId 保单ID
     */
    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    /**
     * 获取报案时间
     *
     * @return report_date - 报案时间
     */
    public Date getReportDate() {
        return reportDate;
    }

    /**
     * 设置报案时间
     *
     * @param reportDate 报案时间
     */
    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }
}