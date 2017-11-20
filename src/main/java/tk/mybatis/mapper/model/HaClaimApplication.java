package tk.mybatis.mapper.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ha_claim_application")
public class HaClaimApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ������
     */
    @Column(name = "report_no")
    private String reportNo;

    /**
     * ����״̬
     */
    private String status;

    /**
     * ������Դ
     */
    private String source;

    /**
     * ������
     */
    @Column(name = "archive_no")
    private String archiveNo;

    /**
     * pdf�ļ�����
     */
    @Column(name = "seppage_path_file_name")
    private String seppagePathFileName;

    /**
     * ��������I����D
     */
    @Column(name = "channel_application_id")
    private String channelApplicationId;

    /**
     * Ӱ�����
     */
    @Column(name = "image_no")
    private String imageNo;

    /**
     * �ָ�ҳ����·��
     */
    @Column(name = "seppage_path")
    private String seppagePath;

    /**
     * ����ԭ��
     */
    @Column(name = "loss_code")
    private String lossCode;

    /**
     * ������
     */
    @Column(name = "insurance_name")
    private String insuranceName;

    /**
     * ������֤������
     */
    @Column(name = "insurance_ceti_no")
    private String insuranceCetiNo;

    /**
     * ������֤������
     */
    @Column(name = "insurance_ceti_type")
    private String insuranceCetiType;

    /**
     * ����ʱ��
     */
    @Column(name = "accident_date")
    private Date accidentDate;

    /**
     * ��������
     */
    @Column(name = "accident_area")
    private String accidentArea;

    /**
     * ���յص�
     */
    @Column(name = "accident_place")
    private String accidentPlace;

    /**
     * ���վ���
     */
    @Column(name = "accident_process")
    private String accidentProcess;

    /**
     * ������
     */
    private String reporter;

    /**
     * �뱻�����˹�ϵ
     */
    @Column(name = "reporter_insured_relation")
    private String reporterInsuredRelation;

    /**
     * �̶��绰����
     */
    @Column(name = "tel_no")
    private String telNo;

    /**
     * �ֻ�����
     */
    @Column(name = "mobile_no")
    private String mobileNo;

    /**
     * ������
     */
    @Column(name = "claim_amount")
    private String claimAmount;

    /**
     * �������
     */
    @Column(name = "claim_currency")
    private String claimCurrency;

    /**
     * ��ע
     */
    private String remark;

    /**
     * ������
     */
    private String handler;

    /**
     * ����ʱ��
     */
    @Column(name = "reported_date")
    private Date reportedDate;

    /**
     * ������ԭ���ǡ���ʡ�ʱ������ֶ�Ϊ������
     */
    @Column(name = "death_date")
    private Date deathDate;

    /**
     * �᰸ʱ��
     */
    @Column(name = "close_date")
    private Date closeDate;

    private String creator;

    /**
     * �����߱��
     */
    @Column(name = "creator_no")
    private String creatorNo;

    /**
     * ����ʱ��
     */
    @Column(name = "gmt_created")
    private Date gmtCreated;

    private String modifier;

    /**
     * �޸�ʱ��
     */
    @Column(name = "gmt_modified")
    private Date gmtModified;

    /**
     * ��չ�ֶΣ��ִ�ţ�wayBillNo���˵��ţ���������������Ϣ
     */
    @Column(name = "extra_info")
    private String extraInfo;

    /**
     * �Ƿ�ɾ����Y-�ǣ�N-��
     */
    @Column(name = "is_deleted")
    private String isDeleted;

    /**
     * �Ƿ��·�TPA
     */
    @Column(name = "istpaDispatch")
    private String istpadispatch;

    /**
     * ����������
     */
    private String email;

    /**
     * �Ա�
     */
    private String gender;

    /**
     * ��������
     */
    @Column(name = "birth_day")
    private Date birthDay;

    /**
     * �����ܰ���
     */
    @Column(name = "channel_batch_no")
    private String channelBatchNo;

    /**
     * �����ְ���
     */
    @Column(name = "channel_report_no")
    private String channelReportNo;

    /**
     * ����ʱ��
     */
    @Column(name = "adjustment_date")
    private Date adjustmentDate;

    /**
     * TPA��Դ��haihong-����,yiyong-��Ӻ,insupro-�������,doubao-����,jinwei-����,huadao-����,ensurlink-г��,taiping-̫ƽ����
     */
    @Column(name = "tpa_source")
    private String tpaSource;

    /**
     * ��������֤������(��֤�����ͱ���ʱ������������)
     */
    @Column(name = "master_insured_cert_no")
    private String masterInsuredCertNo;

    /**
     * ��������֤������(��֤�����ͱ���ʱ������������)
     */
    @Column(name = "master_insured_cert_type")
    private String masterInsuredCertType;

    /**
     * �Ƿ�Ϊ�ౣ��Ӫ�����1�ǣ�0��
     */
    @Column(name = "is_campaign")
    private Byte isCampaign;

    /**
     * �ؼ�ȷ����
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
     * ��ȡ����״̬
     *
     * @return status - ����״̬
     */
    public String getStatus() {
        return status;
    }

    /**
     * ��������״̬
     *
     * @param status ����״̬
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * ��ȡ������Դ
     *
     * @return source - ������Դ
     */
    public String getSource() {
        return source;
    }

    /**
     * ���ñ�����Դ
     *
     * @param source ������Դ
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * ��ȡ������
     *
     * @return archive_no - ������
     */
    public String getArchiveNo() {
        return archiveNo;
    }

    /**
     * ����������
     *
     * @param archiveNo ������
     */
    public void setArchiveNo(String archiveNo) {
        this.archiveNo = archiveNo;
    }

    /**
     * ��ȡpdf�ļ�����
     *
     * @return seppage_path_file_name - pdf�ļ�����
     */
    public String getSeppagePathFileName() {
        return seppagePathFileName;
    }

    /**
     * ����pdf�ļ�����
     *
     * @param seppagePathFileName pdf�ļ�����
     */
    public void setSeppagePathFileName(String seppagePathFileName) {
        this.seppagePathFileName = seppagePathFileName;
    }

    /**
     * ��ȡ��������I����D
     *
     * @return channel_application_id - ��������I����D
     */
    public String getChannelApplicationId() {
        return channelApplicationId;
    }

    /**
     * ������������I����D
     *
     * @param channelApplicationId ��������I����D
     */
    public void setChannelApplicationId(String channelApplicationId) {
        this.channelApplicationId = channelApplicationId;
    }

    /**
     * ��ȡӰ�����
     *
     * @return image_no - Ӱ�����
     */
    public String getImageNo() {
        return imageNo;
    }

    /**
     * ����Ӱ�����
     *
     * @param imageNo Ӱ�����
     */
    public void setImageNo(String imageNo) {
        this.imageNo = imageNo;
    }

    /**
     * ��ȡ�ָ�ҳ����·��
     *
     * @return seppage_path - �ָ�ҳ����·��
     */
    public String getSeppagePath() {
        return seppagePath;
    }

    /**
     * ���÷ָ�ҳ����·��
     *
     * @param seppagePath �ָ�ҳ����·��
     */
    public void setSeppagePath(String seppagePath) {
        this.seppagePath = seppagePath;
    }

    /**
     * ��ȡ����ԭ��
     *
     * @return loss_code - ����ԭ��
     */
    public String getLossCode() {
        return lossCode;
    }

    /**
     * ���ó���ԭ��
     *
     * @param lossCode ����ԭ��
     */
    public void setLossCode(String lossCode) {
        this.lossCode = lossCode;
    }

    /**
     * ��ȡ������
     *
     * @return insurance_name - ������
     */
    public String getInsuranceName() {
        return insuranceName;
    }

    /**
     * ���ñ�����
     *
     * @param insuranceName ������
     */
    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    /**
     * ��ȡ������֤������
     *
     * @return insurance_ceti_no - ������֤������
     */
    public String getInsuranceCetiNo() {
        return insuranceCetiNo;
    }

    /**
     * ���ñ�����֤������
     *
     * @param insuranceCetiNo ������֤������
     */
    public void setInsuranceCetiNo(String insuranceCetiNo) {
        this.insuranceCetiNo = insuranceCetiNo;
    }

    /**
     * ��ȡ������֤������
     *
     * @return insurance_ceti_type - ������֤������
     */
    public String getInsuranceCetiType() {
        return insuranceCetiType;
    }

    /**
     * ���ñ�����֤������
     *
     * @param insuranceCetiType ������֤������
     */
    public void setInsuranceCetiType(String insuranceCetiType) {
        this.insuranceCetiType = insuranceCetiType;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return accident_date - ����ʱ��
     */
    public Date getAccidentDate() {
        return accidentDate;
    }

    /**
     * ���ó���ʱ��
     *
     * @param accidentDate ����ʱ��
     */
    public void setAccidentDate(Date accidentDate) {
        this.accidentDate = accidentDate;
    }

    /**
     * ��ȡ��������
     *
     * @return accident_area - ��������
     */
    public String getAccidentArea() {
        return accidentArea;
    }

    /**
     * ���ó�������
     *
     * @param accidentArea ��������
     */
    public void setAccidentArea(String accidentArea) {
        this.accidentArea = accidentArea;
    }

    /**
     * ��ȡ���յص�
     *
     * @return accident_place - ���յص�
     */
    public String getAccidentPlace() {
        return accidentPlace;
    }

    /**
     * ���ó��յص�
     *
     * @param accidentPlace ���յص�
     */
    public void setAccidentPlace(String accidentPlace) {
        this.accidentPlace = accidentPlace;
    }

    /**
     * ��ȡ���վ���
     *
     * @return accident_process - ���վ���
     */
    public String getAccidentProcess() {
        return accidentProcess;
    }

    /**
     * ���ó��վ���
     *
     * @param accidentProcess ���վ���
     */
    public void setAccidentProcess(String accidentProcess) {
        this.accidentProcess = accidentProcess;
    }

    /**
     * ��ȡ������
     *
     * @return reporter - ������
     */
    public String getReporter() {
        return reporter;
    }

    /**
     * ���ñ�����
     *
     * @param reporter ������
     */
    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    /**
     * ��ȡ�뱻�����˹�ϵ
     *
     * @return reporter_insured_relation - �뱻�����˹�ϵ
     */
    public String getReporterInsuredRelation() {
        return reporterInsuredRelation;
    }

    /**
     * �����뱻�����˹�ϵ
     *
     * @param reporterInsuredRelation �뱻�����˹�ϵ
     */
    public void setReporterInsuredRelation(String reporterInsuredRelation) {
        this.reporterInsuredRelation = reporterInsuredRelation;
    }

    /**
     * ��ȡ�̶��绰����
     *
     * @return tel_no - �̶��绰����
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * ���ù̶��绰����
     *
     * @param telNo �̶��绰����
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    /**
     * ��ȡ�ֻ�����
     *
     * @return mobile_no - �ֻ�����
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * �����ֻ�����
     *
     * @param mobileNo �ֻ�����
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * ��ȡ������
     *
     * @return claim_amount - ������
     */
    public String getClaimAmount() {
        return claimAmount;
    }

    /**
     * ����������
     *
     * @param claimAmount ������
     */
    public void setClaimAmount(String claimAmount) {
        this.claimAmount = claimAmount;
    }

    /**
     * ��ȡ�������
     *
     * @return claim_currency - �������
     */
    public String getClaimCurrency() {
        return claimCurrency;
    }

    /**
     * �����������
     *
     * @param claimCurrency �������
     */
    public void setClaimCurrency(String claimCurrency) {
        this.claimCurrency = claimCurrency;
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
     * ��ȡ������
     *
     * @return handler - ������
     */
    public String getHandler() {
        return handler;
    }

    /**
     * ����������
     *
     * @param handler ������
     */
    public void setHandler(String handler) {
        this.handler = handler;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return reported_date - ����ʱ��
     */
    public Date getReportedDate() {
        return reportedDate;
    }

    /**
     * ���ñ���ʱ��
     *
     * @param reportedDate ����ʱ��
     */
    public void setReportedDate(Date reportedDate) {
        this.reportedDate = reportedDate;
    }

    /**
     * ��ȡ������ԭ���ǡ���ʡ�ʱ������ֶ�Ϊ������
     *
     * @return death_date - ������ԭ���ǡ���ʡ�ʱ������ֶ�Ϊ������
     */
    public Date getDeathDate() {
        return deathDate;
    }

    /**
     * ���õ�����ԭ���ǡ���ʡ�ʱ������ֶ�Ϊ������
     *
     * @param deathDate ������ԭ���ǡ���ʡ�ʱ������ֶ�Ϊ������
     */
    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    /**
     * ��ȡ�᰸ʱ��
     *
     * @return close_date - �᰸ʱ��
     */
    public Date getCloseDate() {
        return closeDate;
    }

    /**
     * ���ý᰸ʱ��
     *
     * @param closeDate �᰸ʱ��
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
     * ��ȡ�����߱��
     *
     * @return creator_no - �����߱��
     */
    public String getCreatorNo() {
        return creatorNo;
    }

    /**
     * ���ô����߱��
     *
     * @param creatorNo �����߱��
     */
    public void setCreatorNo(String creatorNo) {
        this.creatorNo = creatorNo;
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
     * ��ȡ��չ�ֶΣ��ִ�ţ�wayBillNo���˵��ţ���������������Ϣ
     *
     * @return extra_info - ��չ�ֶΣ��ִ�ţ�wayBillNo���˵��ţ���������������Ϣ
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * ������չ�ֶΣ��ִ�ţ�wayBillNo���˵��ţ���������������Ϣ
     *
     * @param extraInfo ��չ�ֶΣ��ִ�ţ�wayBillNo���˵��ţ���������������Ϣ
     */
    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
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
     * ��ȡ�Ƿ��·�TPA
     *
     * @return istpaDispatch - �Ƿ��·�TPA
     */
    public String getIstpadispatch() {
        return istpadispatch;
    }

    /**
     * �����Ƿ��·�TPA
     *
     * @param istpadispatch �Ƿ��·�TPA
     */
    public void setIstpadispatch(String istpadispatch) {
        this.istpadispatch = istpadispatch;
    }

    /**
     * ��ȡ����������
     *
     * @return email - ����������
     */
    public String getEmail() {
        return email;
    }

    /**
     * ��������������
     *
     * @param email ����������
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * ��ȡ�Ա�
     *
     * @return gender - �Ա�
     */
    public String getGender() {
        return gender;
    }

    /**
     * �����Ա�
     *
     * @param gender �Ա�
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * ��ȡ��������
     *
     * @return birth_day - ��������
     */
    public Date getBirthDay() {
        return birthDay;
    }

    /**
     * ���ó�������
     *
     * @param birthDay ��������
     */
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * ��ȡ�����ܰ���
     *
     * @return channel_batch_no - �����ܰ���
     */
    public String getChannelBatchNo() {
        return channelBatchNo;
    }

    /**
     * ���������ܰ���
     *
     * @param channelBatchNo �����ܰ���
     */
    public void setChannelBatchNo(String channelBatchNo) {
        this.channelBatchNo = channelBatchNo;
    }

    /**
     * ��ȡ�����ְ���
     *
     * @return channel_report_no - �����ְ���
     */
    public String getChannelReportNo() {
        return channelReportNo;
    }

    /**
     * ���������ְ���
     *
     * @param channelReportNo �����ְ���
     */
    public void setChannelReportNo(String channelReportNo) {
        this.channelReportNo = channelReportNo;
    }

    /**
     * ��ȡ����ʱ��
     *
     * @return adjustment_date - ����ʱ��
     */
    public Date getAdjustmentDate() {
        return adjustmentDate;
    }

    /**
     * ���û���ʱ��
     *
     * @param adjustmentDate ����ʱ��
     */
    public void setAdjustmentDate(Date adjustmentDate) {
        this.adjustmentDate = adjustmentDate;
    }

    /**
     * ��ȡTPA��Դ��haihong-����,yiyong-��Ӻ,insupro-�������,doubao-����,jinwei-����,huadao-����,ensurlink-г��,taiping-̫ƽ����
     *
     * @return tpa_source - TPA��Դ��haihong-����,yiyong-��Ӻ,insupro-�������,doubao-����,jinwei-����,huadao-����,ensurlink-г��,taiping-̫ƽ����
     */
    public String getTpaSource() {
        return tpaSource;
    }

    /**
     * ����TPA��Դ��haihong-����,yiyong-��Ӻ,insupro-�������,doubao-����,jinwei-����,huadao-����,ensurlink-г��,taiping-̫ƽ����
     *
     * @param tpaSource TPA��Դ��haihong-����,yiyong-��Ӻ,insupro-�������,doubao-����,jinwei-����,huadao-����,ensurlink-г��,taiping-̫ƽ����
     */
    public void setTpaSource(String tpaSource) {
        this.tpaSource = tpaSource;
    }

    /**
     * ��ȡ��������֤������(��֤�����ͱ���ʱ������������)
     *
     * @return master_insured_cert_no - ��������֤������(��֤�����ͱ���ʱ������������)
     */
    public String getMasterInsuredCertNo() {
        return masterInsuredCertNo;
    }

    /**
     * ������������֤������(��֤�����ͱ���ʱ������������)
     *
     * @param masterInsuredCertNo ��������֤������(��֤�����ͱ���ʱ������������)
     */
    public void setMasterInsuredCertNo(String masterInsuredCertNo) {
        this.masterInsuredCertNo = masterInsuredCertNo;
    }

    /**
     * ��ȡ��������֤������(��֤�����ͱ���ʱ������������)
     *
     * @return master_insured_cert_type - ��������֤������(��֤�����ͱ���ʱ������������)
     */
    public String getMasterInsuredCertType() {
        return masterInsuredCertType;
    }

    /**
     * ������������֤������(��֤�����ͱ���ʱ������������)
     *
     * @param masterInsuredCertType ��������֤������(��֤�����ͱ���ʱ������������)
     */
    public void setMasterInsuredCertType(String masterInsuredCertType) {
        this.masterInsuredCertType = masterInsuredCertType;
    }

    /**
     * ��ȡ�Ƿ�Ϊ�ౣ��Ӫ�����1�ǣ�0��
     *
     * @return is_campaign - �Ƿ�Ϊ�ౣ��Ӫ�����1�ǣ�0��
     */
    public Byte getIsCampaign() {
        return isCampaign;
    }

    /**
     * �����Ƿ�Ϊ�ౣ��Ӫ�����1�ǣ�0��
     *
     * @param isCampaign �Ƿ�Ϊ�ౣ��Ӫ�����1�ǣ�0��
     */
    public void setIsCampaign(Byte isCampaign) {
        this.isCampaign = isCampaign;
    }

    /**
     * ��ȡ�ؼ�ȷ����
     *
     * @return diagnosis_date - �ؼ�ȷ����
     */
    public Date getDiagnosisDate() {
        return diagnosisDate;
    }

    /**
     * �����ؼ�ȷ����
     *
     * @param diagnosisDate �ؼ�ȷ����
     */
    public void setDiagnosisDate(Date diagnosisDate) {
        this.diagnosisDate = diagnosisDate;
    }
}