package tk.mybatis.mapper.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ha_claim_application")
public class HaClaimApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 报案号
     */
    @Column(name = "report_no")
    private String reportNo;

    /**
     * 理赔状态
     */
    private String status;

    /**
     * 报案来源
     */
    private String source;

    /**
     * 箱条码
     */
    @Column(name = "archive_no")
    private String archiveNo;

    /**
     * pdf文件名称
     */
    @Column(name = "seppage_path_file_name")
    private String seppagePathFileName;

    /**
     * 渠道报案I申请D
     */
    @Column(name = "channel_application_id")
    private String channelApplicationId;

    /**
     * 影像件码
     */
    @Column(name = "image_no")
    private String imageNo;

    /**
     * 分隔页钛盘路径
     */
    @Column(name = "seppage_path")
    private String seppagePath;

    /**
     * 出险原因
     */
    @Column(name = "loss_code")
    private String lossCode;

    /**
     * 被保人
     */
    @Column(name = "insurance_name")
    private String insuranceName;

    /**
     * 被保人证件号码
     */
    @Column(name = "insurance_ceti_no")
    private String insuranceCetiNo;

    /**
     * 被保人证件类型
     */
    @Column(name = "insurance_ceti_type")
    private String insuranceCetiType;

    /**
     * 出险时间
     */
    @Column(name = "accident_date")
    private Date accidentDate;

    /**
     * 出现区域
     */
    @Column(name = "accident_area")
    private String accidentArea;

    /**
     * 出险地点
     */
    @Column(name = "accident_place")
    private String accidentPlace;

    /**
     * 出险经过
     */
    @Column(name = "accident_process")
    private String accidentProcess;

    /**
     * 报案人
     */
    private String reporter;

    /**
     * 与被保险人关系
     */
    @Column(name = "reporter_insured_relation")
    private String reporterInsuredRelation;

    /**
     * 固定电话号码
     */
    @Column(name = "tel_no")
    private String telNo;

    /**
     * 手机号码
     */
    @Column(name = "mobile_no")
    private String mobileNo;

    /**
     * 索赔金额
     */
    @Column(name = "claim_amount")
    private String claimAmount;

    /**
     * 索赔币种
     */
    @Column(name = "claim_currency")
    private String claimCurrency;

    /**
     * 备注
     */
    private String remark;

    /**
     * 受理人
     */
    private String handler;

    /**
     * 报案时间
     */
    @Column(name = "reported_date")
    private Date reportedDate;

    /**
     * 当出险原因是“身故”时，则该字段为必填项
     */
    @Column(name = "death_date")
    private Date deathDate;

    /**
     * 结案时间
     */
    @Column(name = "close_date")
    private Date closeDate;

    private String creator;

    /**
     * 创建者编号
     */
    @Column(name = "creator_no")
    private String creatorNo;

    /**
     * 创建时间
     */
    @Column(name = "gmt_created")
    private Date gmtCreated;

    private String modifier;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * 扩展字段，现存放：wayBillNo（运单号），主被保险人信息
     */
    @Column(name = "extra_info")
    private String extraInfo;

    /**
     * 是否删除（Y-是，N-否）
     */
    @Column(name = "is_deleted")
    private String isDeleted;

    /**
     * 是否下发TPA
     */
    @Column(name = "istpaDispatch")
    private String istpadispatch;

    /**
     * 索赔人邮箱
     */
    private String email;

    /**
     * 性别
     */
    private String gender;

    /**
     * 出生日期
     */
    @Column(name = "birth_day")
    private Date birthDay;

    /**
     * 渠道总案号
     */
    @Column(name = "channel_batch_no")
    private String channelBatchNo;

    /**
     * 渠道分案号
     */
    @Column(name = "channel_report_no")
    private String channelReportNo;

    /**
     * 回盘时间
     */
    @Column(name = "adjustment_date")
    private Date adjustmentDate;

    /**
     * TPA来源（haihong-海虹,yiyong-易雍,insupro-万家理赔,doubao-豆包,jinwei-金卫,huadao-华道,ensurlink-谐筑,taiping-太平共享）
     */
    @Column(name = "tpa_source")
    private String tpaSource;

    /**
     * 主被保人证件号码(无证件类型报案时，用主被保人)
     */
    @Column(name = "master_insured_cert_no")
    private String masterInsuredCertNo;

    /**
     * 主被保人证件类型(无证件类型报案时，用主被保人)
     */
    @Column(name = "master_insured_cert_type")
    private String masterInsuredCertType;

    /**
     * 是否为多保单营销活动（1是；0否）
     */
    @Column(name = "is_campaign")
    private Byte isCampaign;

    /**
     * 重疾确诊日
     */
    @Column(name = "diagnosis_date")
    private Date diagnosisDate;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
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
     * 获取理赔状态
     *
     * @return status - 理赔状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置理赔状态
     *
     * @param status 理赔状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取报案来源
     *
     * @return source - 报案来源
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置报案来源
     *
     * @param source 报案来源
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取箱条码
     *
     * @return archive_no - 箱条码
     */
    public String getArchiveNo() {
        return archiveNo;
    }

    /**
     * 设置箱条码
     *
     * @param archiveNo 箱条码
     */
    public void setArchiveNo(String archiveNo) {
        this.archiveNo = archiveNo;
    }

    /**
     * 获取pdf文件名称
     *
     * @return seppage_path_file_name - pdf文件名称
     */
    public String getSeppagePathFileName() {
        return seppagePathFileName;
    }

    /**
     * 设置pdf文件名称
     *
     * @param seppagePathFileName pdf文件名称
     */
    public void setSeppagePathFileName(String seppagePathFileName) {
        this.seppagePathFileName = seppagePathFileName;
    }

    /**
     * 获取渠道报案I申请D
     *
     * @return channel_application_id - 渠道报案I申请D
     */
    public String getChannelApplicationId() {
        return channelApplicationId;
    }

    /**
     * 设置渠道报案I申请D
     *
     * @param channelApplicationId 渠道报案I申请D
     */
    public void setChannelApplicationId(String channelApplicationId) {
        this.channelApplicationId = channelApplicationId;
    }

    /**
     * 获取影像件码
     *
     * @return image_no - 影像件码
     */
    public String getImageNo() {
        return imageNo;
    }

    /**
     * 设置影像件码
     *
     * @param imageNo 影像件码
     */
    public void setImageNo(String imageNo) {
        this.imageNo = imageNo;
    }

    /**
     * 获取分隔页钛盘路径
     *
     * @return seppage_path - 分隔页钛盘路径
     */
    public String getSeppagePath() {
        return seppagePath;
    }

    /**
     * 设置分隔页钛盘路径
     *
     * @param seppagePath 分隔页钛盘路径
     */
    public void setSeppagePath(String seppagePath) {
        this.seppagePath = seppagePath;
    }

    /**
     * 获取出险原因
     *
     * @return loss_code - 出险原因
     */
    public String getLossCode() {
        return lossCode;
    }

    /**
     * 设置出险原因
     *
     * @param lossCode 出险原因
     */
    public void setLossCode(String lossCode) {
        this.lossCode = lossCode;
    }

    /**
     * 获取被保人
     *
     * @return insurance_name - 被保人
     */
    public String getInsuranceName() {
        return insuranceName;
    }

    /**
     * 设置被保人
     *
     * @param insuranceName 被保人
     */
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    /**
     * 获取被保人证件号码
     *
     * @return insurance_ceti_no - 被保人证件号码
     */
    public String getInsuranceCetiNo() {
        return insuranceCetiNo;
    }

    /**
     * 设置被保人证件号码
     *
     * @param insuranceCetiNo 被保人证件号码
     */
    public void setInsuranceCetiNo(String insuranceCetiNo) {
        this.insuranceCetiNo = insuranceCetiNo;
    }

    /**
     * 获取被保人证件类型
     *
     * @return insurance_ceti_type - 被保人证件类型
     */
    public String getInsuranceCetiType() {
        return insuranceCetiType;
    }

    /**
     * 设置被保人证件类型
     *
     * @param insuranceCetiType 被保人证件类型
     */
    public void setInsuranceCetiType(String insuranceCetiType) {
        this.insuranceCetiType = insuranceCetiType;
    }

    /**
     * 获取出险时间
     *
     * @return accident_date - 出险时间
     */
    public Date getAccidentDate() {
        return accidentDate;
    }

    /**
     * 设置出险时间
     *
     * @param accidentDate 出险时间
     */
    public void setAccidentDate(Date accidentDate) {
        this.accidentDate = accidentDate;
    }

    /**
     * 获取出现区域
     *
     * @return accident_area - 出现区域
     */
    public String getAccidentArea() {
        return accidentArea;
    }

    /**
     * 设置出现区域
     *
     * @param accidentArea 出现区域
     */
    public void setAccidentArea(String accidentArea) {
        this.accidentArea = accidentArea;
    }

    /**
     * 获取出险地点
     *
     * @return accident_place - 出险地点
     */
    public String getAccidentPlace() {
        return accidentPlace;
    }

    /**
     * 设置出险地点
     *
     * @param accidentPlace 出险地点
     */
    public void setAccidentPlace(String accidentPlace) {
        this.accidentPlace = accidentPlace;
    }

    /**
     * 获取出险经过
     *
     * @return accident_process - 出险经过
     */
    public String getAccidentProcess() {
        return accidentProcess;
    }

    /**
     * 设置出险经过
     *
     * @param accidentProcess 出险经过
     */
    public void setAccidentProcess(String accidentProcess) {
        this.accidentProcess = accidentProcess;
    }

    /**
     * 获取报案人
     *
     * @return reporter - 报案人
     */
    public String getReporter() {
        return reporter;
    }

    /**
     * 设置报案人
     *
     * @param reporter 报案人
     */
    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    /**
     * 获取与被保险人关系
     *
     * @return reporter_insured_relation - 与被保险人关系
     */
    public String getReporterInsuredRelation() {
        return reporterInsuredRelation;
    }

    /**
     * 设置与被保险人关系
     *
     * @param reporterInsuredRelation 与被保险人关系
     */
    public void setReporterInsuredRelation(String reporterInsuredRelation) {
        this.reporterInsuredRelation = reporterInsuredRelation;
    }

    /**
     * 获取固定电话号码
     *
     * @return tel_no - 固定电话号码
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * 设置固定电话号码
     *
     * @param telNo 固定电话号码
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    /**
     * 获取手机号码
     *
     * @return mobile_no - 手机号码
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * 设置手机号码
     *
     * @param mobileNo 手机号码
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * 获取索赔金额
     *
     * @return claim_amount - 索赔金额
     */
    public String getClaimAmount() {
        return claimAmount;
    }

    /**
     * 设置索赔金额
     *
     * @param claimAmount 索赔金额
     */
    public void setClaimAmount(String claimAmount) {
        this.claimAmount = claimAmount;
    }

    /**
     * 获取索赔币种
     *
     * @return claim_currency - 索赔币种
     */
    public String getClaimCurrency() {
        return claimCurrency;
    }

    /**
     * 设置索赔币种
     *
     * @param claimCurrency 索赔币种
     */
    public void setClaimCurrency(String claimCurrency) {
        this.claimCurrency = claimCurrency;
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
     * 获取受理人
     *
     * @return handler - 受理人
     */
    public String getHandler() {
        return handler;
    }

    /**
     * 设置受理人
     *
     * @param handler 受理人
     */
    public void setHandler(String handler) {
        this.handler = handler;
    }

    /**
     * 获取报案时间
     *
     * @return reported_date - 报案时间
     */
    public Date getReportedDate() {
        return reportedDate;
    }

    /**
     * 设置报案时间
     *
     * @param reportedDate 报案时间
     */
    public void setReportedDate(Date reportedDate) {
        this.reportedDate = reportedDate;
    }

    /**
     * 获取当出险原因是“身故”时，则该字段为必填项
     *
     * @return death_date - 当出险原因是“身故”时，则该字段为必填项
     */
    public Date getDeathDate() {
        return deathDate;
    }

    /**
     * 设置当出险原因是“身故”时，则该字段为必填项
     *
     * @param deathDate 当出险原因是“身故”时，则该字段为必填项
     */
    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    /**
     * 获取结案时间
     *
     * @return close_date - 结案时间
     */
    public Date getCloseDate() {
        return closeDate;
    }

    /**
     * 设置结案时间
     *
     * @param closeDate 结案时间
     */
    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取创建者编号
     *
     * @return creator_no - 创建者编号
     */
    public String getCreatorNo() {
        return creatorNo;
    }

    /**
     * 设置创建者编号
     *
     * @param creatorNo 创建者编号
     */
    public void setCreatorNo(String creatorNo) {
        this.creatorNo = creatorNo;
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
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * @param modifier
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
     * 获取扩展字段，现存放：wayBillNo（运单号），主被保险人信息
     *
     * @return extra_info - 扩展字段，现存放：wayBillNo（运单号），主被保险人信息
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * 设置扩展字段，现存放：wayBillNo（运单号），主被保险人信息
     *
     * @param extraInfo 扩展字段，现存放：wayBillNo（运单号），主被保险人信息
     */
    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
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
     * 获取是否下发TPA
     *
     * @return istpaDispatch - 是否下发TPA
     */
    public String getIstpadispatch() {
        return istpadispatch;
    }

    /**
     * 设置是否下发TPA
     *
     * @param istpadispatch 是否下发TPA
     */
    public void setIstpadispatch(String istpadispatch) {
        this.istpadispatch = istpadispatch;
    }

    /**
     * 获取索赔人邮箱
     *
     * @return email - 索赔人邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置索赔人邮箱
     *
     * @param email 索赔人邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取出生日期
     *
     * @return birth_day - 出生日期
     */
    public Date getBirthDay() {
        return birthDay;
    }

    /**
     * 设置出生日期
     *
     * @param birthDay 出生日期
     */
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * 获取渠道总案号
     *
     * @return channel_batch_no - 渠道总案号
     */
    public String getChannelBatchNo() {
        return channelBatchNo;
    }

    /**
     * 设置渠道总案号
     *
     * @param channelBatchNo 渠道总案号
     */
    public void setChannelBatchNo(String channelBatchNo) {
        this.channelBatchNo = channelBatchNo;
    }

    /**
     * 获取渠道分案号
     *
     * @return channel_report_no - 渠道分案号
     */
    public String getChannelReportNo() {
        return channelReportNo;
    }

    /**
     * 设置渠道分案号
     *
     * @param channelReportNo 渠道分案号
     */
    public void setChannelReportNo(String channelReportNo) {
        this.channelReportNo = channelReportNo;
    }

    /**
     * 获取回盘时间
     *
     * @return adjustment_date - 回盘时间
     */
    public Date getAdjustmentDate() {
        return adjustmentDate;
    }

    /**
     * 设置回盘时间
     *
     * @param adjustmentDate 回盘时间
     */
    public void setAdjustmentDate(Date adjustmentDate) {
        this.adjustmentDate = adjustmentDate;
    }

    /**
     * 获取TPA来源（haihong-海虹,yiyong-易雍,insupro-万家理赔,doubao-豆包,jinwei-金卫,huadao-华道,ensurlink-谐筑,taiping-太平共享）
     *
     * @return tpa_source - TPA来源（haihong-海虹,yiyong-易雍,insupro-万家理赔,doubao-豆包,jinwei-金卫,huadao-华道,ensurlink-谐筑,taiping-太平共享）
     */
    public String getTpaSource() {
        return tpaSource;
    }

    /**
     * 设置TPA来源（haihong-海虹,yiyong-易雍,insupro-万家理赔,doubao-豆包,jinwei-金卫,huadao-华道,ensurlink-谐筑,taiping-太平共享）
     *
     * @param tpaSource TPA来源（haihong-海虹,yiyong-易雍,insupro-万家理赔,doubao-豆包,jinwei-金卫,huadao-华道,ensurlink-谐筑,taiping-太平共享）
     */
    public void setTpaSource(String tpaSource) {
        this.tpaSource = tpaSource;
    }

    /**
     * 获取主被保人证件号码(无证件类型报案时，用主被保人)
     *
     * @return master_insured_cert_no - 主被保人证件号码(无证件类型报案时，用主被保人)
     */
    public String getMasterInsuredCertNo() {
        return masterInsuredCertNo;
    }

    /**
     * 设置主被保人证件号码(无证件类型报案时，用主被保人)
     *
     * @param masterInsuredCertNo 主被保人证件号码(无证件类型报案时，用主被保人)
     */
    public void setMasterInsuredCertNo(String masterInsuredCertNo) {
        this.masterInsuredCertNo = masterInsuredCertNo;
    }

    /**
     * 获取主被保人证件类型(无证件类型报案时，用主被保人)
     *
     * @return master_insured_cert_type - 主被保人证件类型(无证件类型报案时，用主被保人)
     */
    public String getMasterInsuredCertType() {
        return masterInsuredCertType;
    }

    /**
     * 设置主被保人证件类型(无证件类型报案时，用主被保人)
     *
     * @param masterInsuredCertType 主被保人证件类型(无证件类型报案时，用主被保人)
     */
    public void setMasterInsuredCertType(String masterInsuredCertType) {
        this.masterInsuredCertType = masterInsuredCertType;
    }

    /**
     * 获取是否为多保单营销活动（1是；0否）
     *
     * @return is_campaign - 是否为多保单营销活动（1是；0否）
     */
    public Byte getIsCampaign() {
        return isCampaign;
    }

    /**
     * 设置是否为多保单营销活动（1是；0否）
     *
     * @param isCampaign 是否为多保单营销活动（1是；0否）
     */
    public void setIsCampaign(Byte isCampaign) {
        this.isCampaign = isCampaign;
    }

    /**
     * 获取重疾确诊日
     *
     * @return diagnosis_date - 重疾确诊日
     */
    public Date getDiagnosisDate() {
        return diagnosisDate;
    }

    /**
     * 设置重疾确诊日
     *
     * @param diagnosisDate 重疾确诊日
     */
    public void setDiagnosisDate(Date diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }
}