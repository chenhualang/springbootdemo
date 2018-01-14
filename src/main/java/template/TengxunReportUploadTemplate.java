//package template;
//
//import com.zhongan.health.common.utils.bean.annotation.ColumnMeta;
//import com.zhongan.health.common.utils.excel.common.AbstractExcelTemplate;
//import com.zhongan.health.common.utils.excel.common.ConvertMeta;
//import com.zhongan.health.common.utils.excel.convertor.ColToString;
//
//import lombok.Data;
//
//@Data
//public class TengxunReportUploadTemplate extends AbstractExcelTemplate {
//
//    public TengxunReportUploadTemplate(int titleIndex, int dataIndex, int maxRow, String sheetName) {
//        super(titleIndex, dataIndex, false, false, maxRow, sheetName);
//    }
//
//    public TengxunReportUploadTemplate(int titleIndex, int dataIndex) {
//        this(titleIndex, dataIndex, 200, "Sheet1");
//    }
//
//    public TengxunReportUploadTemplate() {
//        this(1, 2, 200, "Sheet1");
//    }
//
//    /**
//     * 投保人编号
//     */
//    @ColumnMeta(index = 1, displayName = "投保人编号")
//    @ConvertMeta(convert = ColToString.class)
//    private String appHolderNo;
//
//    /**
//     * 投保人姓名
//     */
//    @ColumnMeta(index = 2, displayName = "投保人姓名")
//    @ConvertMeta(convert = ColToString.class)
//    private String appHolderName;
//
//    /**
//     * 团体保单号
//     */
//    @ColumnMeta(index = 3, displayName = "团体保单号")
//    @ConvertMeta(convert = ColToString.class)
//    private String groupPolicyNo;
//
//    /**
//     * 分单号
//     */
//    @ColumnMeta(index = 4, displayName = "分单号")
//    @ConvertMeta(convert = ColToString.class)
//    private String individualPolicyNo;
//
//    /**
//     * 保险计划
//     */
//    @ColumnMeta(index = 5, displayName = "保险计划")
//    @ConvertMeta(convert = ColToString.class)
//    private String planName;
//
//    /**
//     * 客户号
//     */
//    @ColumnMeta(index = 6, displayName = "客户号")
//    @ConvertMeta(convert = ColToString.class)
//    private String custNo;
//
//    /**
//     * 被保险人姓名
//     */
//    @ColumnMeta(index = 7, displayName = "被保险人姓名")
//    @ConvertMeta(convert = ColToString.class)
//    private String insuranceName;
//
//    /**
//     * 性别
//     */
//    @ColumnMeta(index = 8, displayName = "性别")
//    @ConvertMeta(convert = ColToString.class)
//    private String sex;
//
//    /**
//     * 出生日期
//     */
//    @ColumnMeta(index = 9, displayName = "出生日期")
//    @ConvertMeta(convert = ColToString.class)
//    private String birthDate;
//
//    /**
//     * 证件类型
//     */
//    @ColumnMeta(index = 10, displayName = "证件类型")
//    @ConvertMeta(convert = ColToString.class)
//    private String certType;
//
//    /**
//     * 证件号码
//     */
//    @ColumnMeta(index = 11, displayName = "证件号码")
//    @ConvertMeta(convert = ColToString.class)
//    private String certNo;
//
//    /**
//     * 英文名
//     */
//    @ColumnMeta(index = 12, displayName = "英文名")
//    @ConvertMeta(convert = ColToString.class)
//    private String englishName;
//
//    /**
//     * 中英文名
//     */
//    @ColumnMeta(index = 13, displayName = "中英文名")
//    @ConvertMeta(convert = ColToString.class)
//    private String chineseAndEnglishName;
//
//    /**
//     * 城市
//     */
//    @ColumnMeta(index = 14, displayName = "城市")
//    @ConvertMeta(convert = ColToString.class)
//    private String city;
//
//    /**
//     * 工作所在地
//     */
//    @ColumnMeta(index = 15, displayName = "工作所在地")
//    @ConvertMeta(convert = ColToString.class)
//    private String jobLocation;
//
//    /**
//     * 部门
//     */
//    @ColumnMeta(index = 16, displayName = "部门")
//    @ConvertMeta(convert = ColToString.class)
//    private String department;
//
//    /**
//     * 部门编码
//     */
//    @ColumnMeta(index = 17, displayName = "部门编码")
//    @ConvertMeta(convert = ColToString.class)
//    private String departmentCode;
//
//    /**
//     * 与被保人关系
//     */
//    @ColumnMeta(index = 18, displayName = "与被保人关系")
//    @ConvertMeta(convert = ColToString.class)
//    private String reporterInsuredRelation;
//
//    /**
//     * 人员类型
//     */
//    @ColumnMeta(index = 19, displayName = "人员类型")
//    @ConvertMeta(convert = ColToString.class)
//    private String personnelType;
//
//    /**
//     * 事故原因
//     */
//    @ColumnMeta(index = 20, displayName = "事故原因")
//    @ConvertMeta(convert = ColToString.class)
//    private String accidentReason;
//
//    /**
//     * 出险日期
//     */
//    @ColumnMeta(index = 21, displayName = "出险日期")
//    @ConvertMeta(convert = ColToString.class)
//    private String accidentDate;
//
//    /**
//     * 出险月份
//     */
//    @ColumnMeta(index = 22, displayName = "出险月份")
//    @ConvertMeta(convert = ColToString.class)
//    private String accidentMonth;
//
//    /**
//     * 报案日期
//     */
//    @ColumnMeta(index = 23, displayName = "报案日期")
//    @ConvertMeta(convert = ColToString.class)
//    private String reportDate;
//
//    /**
//     * 立案号
//     */
//    @ColumnMeta(index = 24, displayName = "立案号")
//    @ConvertMeta(convert = ColToString.class)
//    private String registerNo;
//
//    /**
//     * 险种名称
//     */
//    @ColumnMeta(index = 25, displayName = "险种名称")
//    @ConvertMeta(convert = ColToString.class)
//    private String productName;
//
//    /**
//     * 责任名称
//     */
//    @ColumnMeta(index = 26, displayName = "责任名称")
//    @ConvertMeta(convert = ColToString.class)
//    private String liabilityName;
//
//    /**
//     * 就诊医院
//     */
//    @ColumnMeta(index = 27, displayName = "就诊医院")
//    @ConvertMeta(convert = ColToString.class)
//    private String hospitalName;
//
//    /**
//     * 就诊科室
//     */
//    @ColumnMeta(index = 28, displayName = "就诊科室")
//    @ConvertMeta(convert = ColToString.class)
//    private String hospitalDepartmentName;
//
//    /**
//     * 诊断
//     */
//    @ColumnMeta(index = 29, displayName = "诊断")
//    @ConvertMeta(convert = ColToString.class)
//    private String diagnosis;
//
//    /**
//     * ICD10—疾病编码
//     */
//    @ColumnMeta(index = 30, displayName = "ICD10—疾病编码")
//    @ConvertMeta(convert = ColToString.class)
//    private String diseaseCode;
//
//    /**
//     * 索赔金额
//     */
//    @ColumnMeta(index = 31, displayName = "索赔金额")
//    @ConvertMeta(convert = ColToString.class)
//    private String claimAmount;
//
//    /**
//     * 中草药费用
//     */
//    @ColumnMeta(index = 32, displayName = "中草药费用")
//    @ConvertMeta(convert = ColToString.class)
//    private String herbalMedicineFee;
//
//    /**
//     * 理疗费用
//     */
//    @ColumnMeta(index = 33, displayName = "理疗费用")
//    @ConvertMeta(convert = ColToString.class)
//    private String therapyFee;
//
//    /**
//     * 医保扣除金额
//     */
//    @ColumnMeta(index = 34, displayName = "医保扣除金额")
//    @ConvertMeta(convert = ColToString.class)
//    private String medicareDeductAmount;
//
//    /**
//     * 不合理金额
//     */
//    @ColumnMeta(index = 35, displayName = "不合理金额")
//    @ConvertMeta(convert = ColToString.class)
//    private String nonresponsibleAmount;
//
//    /**
//     * 医保支付金额
//     */
//    @ColumnMeta(index = 36, displayName = "医保支付金额")
//    @ConvertMeta(convert = ColToString.class)
//    private String medicarePayAmount;
//
//    /**
//     * 第三方支付金额
//     */
//    @ColumnMeta(index = 37, displayName = "第三方支付金额")
//    @ConvertMeta(convert = ColToString.class)
//    private String otherAmount;
//
//    /**
//     * 审核金额
//     */
//    @ColumnMeta(index = 38, displayName = "审核金额")
//    @ConvertMeta(convert = ColToString.class)
//    private String checkAmount;
//
//    /**
//     * 赔付比例
//     */
//    @ColumnMeta(index = 39, displayName = "赔付比例")
//    @ConvertMeta(convert = ColToString.class)
//    private String paidProportion;
//
//    /**
//     * 赔付金额
//     */
//    @ColumnMeta(index = 40, displayName = "赔付金额")
//    @ConvertMeta(convert = ColToString.class)
//    private String paidAmount;
//
//    /**
//     * 扣除说明
//     */
//    @ColumnMeta(index = 41, displayName = "扣除说明")
//    @ConvertMeta(convert = ColToString.class)
//    private String deductInstruction;
//
//    /**
//     * 案件状态
//     */
//    @ColumnMeta(index = 42, displayName = "案件状态")
//    @ConvertMeta(convert = ColToString.class)
//    private String caseStatus;
//
//    /**
//     * 结案日期
//     */
//    @ColumnMeta(index = 43, displayName = "结案日期")
//    @ConvertMeta(convert = ColToString.class)
//    private String closeDate;
//
//    /**
//     * 结案月份
//     */
//    @ColumnMeta(index = 44, displayName = "结案月份")
//    @ConvertMeta(convert = ColToString.class)
//    private String closeMonth;
//
//    /**
//     * 结案时效
//     */
//    @ColumnMeta(index = 45, displayName = "结案时效")
//    @ConvertMeta(convert = ColToString.class)
//    private String closeDuration;
//
//    /**
//     * 开户行
//     */
//    @ColumnMeta(index = 46, displayName = "开户行")
//    @ConvertMeta(convert = ColToString.class)
//    private String accountBankName;
//
//    /**
//     * 账户名
//     */
//    @ColumnMeta(index = 47, displayName = "账户名")
//    @ConvertMeta(convert = ColToString.class)
//    private String transAccountName;
//
//    /**
//     * 账户
//     */
//    @ColumnMeta(index = 48, displayName = "账户")
//    @ConvertMeta(convert = ColToString.class)
//    private String transAccount;
//
//    /**
//     * 转账日期
//     */
//    @ColumnMeta(index = 49, displayName = "转账日期")
//    @ConvertMeta(convert = ColToString.class)
//    private String transDate;
//
//    /**
//     * 转账时效
//     */
//    @ColumnMeta(index = 50, displayName = "转账时效")
//    @ConvertMeta(convert = ColToString.class)
//    private String transDuration;
//
//    /**
//     * 备注
//     */
//    @ColumnMeta(index = 51, displayName = "备注")
//    @ConvertMeta(convert = ColToString.class)
//    private String notes;
//
//    /**
//     * 来源
//     */
//    @ColumnMeta(index = 52, displayName = "来源")
//    @ConvertMeta(convert = ColToString.class)
//    private String source;
//
//    /**
//     * TPA案件号
//     */
//    @ColumnMeta(index = 53, displayName = "TPA案件号")
//    @ConvertMeta(convert = ColToString.class)
//    private String TPACaseNo;
//
//}
