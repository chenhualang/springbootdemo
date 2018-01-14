package dataobject;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class HaClaimApplicationDO implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 4905184826776542038L;

    private Long              id;

    private String            reportNo;                               //报案号

    private String            status;                                 //理赔状态

    private String            source;                                 //报案来源

    private String            tpaSource;                              //TPA来源

    private String            archiveNo;                              //箱条码

    private String            imageNo;                                //影像件码

    public String getSeppagePath() {
        return seppagePath;
    }

    public void setSeppagePath(String seppagePath) {
        this.seppagePath = seppagePath;
    }

    private String seppagePath;             //分隔页钛盘路径

    private String lossCode;                //出险原因

    private String insuranceName;           //被保人

    private String insuranceCetiNo;         //被保人证件号码

    private String insuranceCetiType;       //被保人证件类型

    private String mainInsuranceCetiNo;     //主被保人证件号

    private String mainInsuranceCetiType;   //主被保人证件类型

    private Date   accidentDate;            //出险时间

    private String accidentArea;            //出现区域

    private String accidentPlace;           //出险地点

    private String accidentProcess;         //出险经过

    private String reporter;                //报案人

    private String reporterInsuredRelation; //与被保险人关系

    private String telNo;                   //固定电话号码

    private String mobileNo;                //手机号码
    private String extraInfo;
    private String seppagePathName;
    private String channelApplicationId;
    private String istpaDispatch;

    private String gender; //被保险人性别
    private Date birthDay; //被保险人出生日期

    /***
     * 渠道总报案号
     */
    private String                              channelBatchNo;

    /***
     * 渠道分报案号
     */
    private String                              channelReportNo;

    private Date adjustmentDate ; //回盘时间

    /**
     * 报案号列表，批量查询时使用
     */
    private List<String>  reportNoList ;

    /**
     * 创建时间查询开始时间(yyyy-MM-DD HH:MM:SS)
     */
    private Date startDate;

    /**
     * 创建时间查询结束时间(yyyy-MM-DD HH:MM:SS)
     */
    private Date endDate;

    /**
     * 修改时间查询开始时间(yyyy-MM-DD HH:MM:SS)
     */
    private Date startDate2;

    /**
     * 修改时间查询结束时间(yyyy-MM-DD HH:MM:SS)
     */

    private Date endDate2;

    private List<String>            statusList;

    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<String> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<String> statusList) {
        this.statusList = statusList;
    }

    public Date getStartDate2() {
        return startDate2;
    }

    public void setStartDate2(Date startDate2) {
        this.startDate2 = startDate2;
    }

    public Date getEndDate2() {
        return endDate2;
    }

    public void setEndDate2(Date endDate2) {
        this.endDate2 = endDate2;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getIstpaDispatch() {
        return istpaDispatch;
    }

    public void setIstpaDispatch(String istpaDispatch) {
        this.istpaDispatch = istpaDispatch;
    }

    public String getSeppagePathName() {
        return seppagePathName;
    }

    public void setSeppagePathName(String seppagePathName) {
        this.seppagePathName = seppagePathName;
    }

    public String getChannelApplicationId() {
        return channelApplicationId;
    }

    public void setChannelApplicationId(String channelApplicationId) {
        this.channelApplicationId = channelApplicationId;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    private String claimAmount;   //索赔金额

    private String claimCurrency; //索赔币种

    private String remark;        //备注

    private String handler;       //受理人

    public String getCreatorNo() {
        return creatorNo;
    }

    public void setCreatorNo(String creatorNo) {
        this.creatorNo = creatorNo;
    }

    private Date   reportedDate; //报案时间

    private Date   deathDate;    //死亡时间，当出险原因是“身故”时，则该字段为必填项

    private Date   closeDate;    //结案时间

    private String creator;      //创建者
    private String creatorNo;    //创建者用户编号

    private Date   gmtCreated;   //创建时间

    private String modifier;     //修改者

    private Date   gmtModified;  //修改时间

    private String isDeleted;    //是否删除

    /**
     * 索赔人邮箱
     */
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReportNo() {
        return reportNo;
    }

    public void setReportNo(String reportNo) {
        this.reportNo = reportNo == null ? null : reportNo.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getArchiveNo() {
        return archiveNo;
    }

    public void setArchiveNo(String archiveNo) {
        this.archiveNo = archiveNo == null ? null : archiveNo.trim();
    }

    public String getImageNo() {
        return imageNo;
    }

    public void setImageNo(String imageNo) {
        this.imageNo = imageNo == null ? null : imageNo.trim();
    }

    public String getLossCode() {
        return lossCode;
    }

    public void setLossCode(String lossCode) {
        this.lossCode = lossCode == null ? null : lossCode.trim();
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName == null ? null : insuranceName.trim();
    }

    public String getInsuranceCetiNo() {
        return insuranceCetiNo;
    }

    public void setInsuranceCetiNo(String insuranceCetiNo) {
        this.insuranceCetiNo = insuranceCetiNo == null ? null : insuranceCetiNo.trim();
    }

    public String getInsuranceCetiType() {
        return insuranceCetiType;
    }

    public void setInsuranceCetiType(String insuranceCetiType) {
        this.insuranceCetiType = insuranceCetiType == null ? null : insuranceCetiType.trim();
    }

    public String getAccidentArea() {
        return accidentArea;
    }

    public void setAccidentArea(String accidentArea) {
        this.accidentArea = accidentArea == null ? null : accidentArea.trim();
    }

    public Date getAccidentDate() {
        return accidentDate;
    }

    public void setAccidentDate(Date accidentDate) {
        this.accidentDate = accidentDate;
    }

    public String getAccidentPlace() {
        return accidentPlace;
    }

    public void setAccidentPlace(String accidentPlace) {
        this.accidentPlace = accidentPlace == null ? null : accidentPlace.trim();
    }

    public String getAccidentProcess() {
        return accidentProcess;
    }

    public void setAccidentProcess(String accidentProcess) {
        this.accidentProcess = accidentProcess == null ? null : accidentProcess.trim();
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter == null ? null : reporter.trim();
    }

    public String getReporterInsuredRelation() {
        return reporterInsuredRelation;
    }

    public void setReporterInsuredRelation(String reporterInsuredRelation) {
        this.reporterInsuredRelation = reporterInsuredRelation == null ? null : reporterInsuredRelation.trim();
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo == null ? null : telNo.trim();
    }

    public String getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(String claimAmount) {
        this.claimAmount = claimAmount == null ? null : claimAmount.trim();
    }

    public String getClaimCurrency() {
        return claimCurrency;
    }

    public void setClaimCurrency(String claimCurrency) {
        this.claimCurrency = claimCurrency == null ? null : claimCurrency.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    public Date getReportedDate() {
        return reportedDate;
    }

    public void setReportedDate(Date reportedDate) {
        this.reportedDate = reportedDate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
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
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getTpaSource() {
        return tpaSource;
    }

    public void setTpaSource(String tpaSource) {
        this.tpaSource = tpaSource;
    }

    public String getChannelBatchNo() {
        return channelBatchNo;
    }

    public void setChannelBatchNo(String channelBatchNo) {
        this.channelBatchNo = channelBatchNo;
    }

    public String getChannelReportNo() {
        return channelReportNo;
    }

    public void setChannelReportNo(String channelReportNo) {
        this.channelReportNo = channelReportNo;
    }

    public Date getAdjustmentDate() {
        return adjustmentDate;
    }

    public void setAdjustmentDate(Date adjustmentDate) {
        this.adjustmentDate = adjustmentDate;
    }

    public List<String> getReportNoList() {
        return reportNoList;
    }

    public void setReportNoList(List<String> reportNoList) {
        this.reportNoList = reportNoList;
    }

    public String getMainInsuranceCetiNo() {
        return mainInsuranceCetiNo;
    }

    public void setMainInsuranceCetiNo(String mainInsuranceCetiNo) {
        this.mainInsuranceCetiNo = mainInsuranceCetiNo;
    }

    public String getMainInsuranceCetiType() {
        return mainInsuranceCetiType;
    }

    public void setMainInsuranceCetiType(String mainInsuranceCetiType) {
        this.mainInsuranceCetiType = mainInsuranceCetiType;
    }
}
