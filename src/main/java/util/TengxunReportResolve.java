package util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import dataobject.HaClaimDataDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.mapper.model.HaTpaReport;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

@Slf4j
public class TengxunReportResolve {
    public static JSONObject getAllByExcel(InputStream is) throws Exception {

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM");
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        Workbook workbook = null;
        JSONObject jo = new JSONObject();
        try {
            workbook = create(is);
            HaTpaReport tpaReport = null;
            Map<String,String> map  = new HashMap<>();
            List<HaTpaReport> list = new ArrayList<HaTpaReport>();
            Sheet hssfSheet = workbook.getSheetAt(0);
            int numberOfCells = hssfSheet.getRow(0).getPhysicalNumberOfCells();
            jo.put("totalColumn",numberOfCells);
            jo.put("totalRow",hssfSheet.getLastRowNum());
            if(numberOfCells!=53||hssfSheet.getLastRowNum()==0){
                return jo;
            }
            // 循环行Row
            Map<Integer,String> errorMsgMap = new HashMap<>();
            for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                Row hssfRow = hssfSheet.getRow(rowNum);
                StringBuilder rowErrorStr = new StringBuilder();
                if (hssfRow != null) {
                    tpaReport = new HaTpaReport();
                    tpaReport.setAppHolderNo(hssfRow.getCell(0).getStringCellValue());
                    tpaReport.setAppHolderName(hssfRow.getCell(1).getStringCellValue());
                    tpaReport.setGroupPolicyNo(hssfRow.getCell(2).getStringCellValue());
                    tpaReport.setIndividualPolicyNo(hssfRow.getCell(3).getStringCellValue());
                    tpaReport.setPlanName(hssfRow.getCell(4).getStringCellValue());
                    tpaReport.setCustNo(hssfRow.getCell(5).getStringCellValue());
                    tpaReport.setInsuranceName(hssfRow.getCell(6).getStringCellValue());
                    tpaReport.setSex(hssfRow.getCell(7).getStringCellValue());
                    String birthDateStr = hssfRow.getCell(8).getStringCellValue();
                    Date birthDate = sdf3.parse(birthDateStr);
                    tpaReport.setBirthDate(birthDate);
                    tpaReport.setCertType(hssfRow.getCell(9).getStringCellValue());
                    tpaReport.setCertNo(hssfRow.getCell(10).getStringCellValue());
                    tpaReport.setEnglishName(hssfRow.getCell(11).getStringCellValue());
                    tpaReport.setChineseAndEnglishName(hssfRow.getCell(12).getStringCellValue());
                    tpaReport.setCity(hssfRow.getCell(13).getStringCellValue());
                    tpaReport.setJobLocation(hssfRow.getCell(14).getStringCellValue());
                    tpaReport.setDepartment(hssfRow.getCell(15).getStringCellValue());
                    tpaReport.setDepartmentCode(hssfRow.getCell(16).getStringCellValue());
                    tpaReport.setReporterInsuredRelation(hssfRow.getCell(17).getStringCellValue());
                    tpaReport.setPersonneltype(hssfRow.getCell(18).getStringCellValue());
                    tpaReport.setAccidentReason(hssfRow.getCell(19).getStringCellValue());

                    if(HSSFDateUtil.isCellDateFormatted(hssfRow.getCell(20))){
                        Date dateCellValue = hssfRow.getCell(20).getDateCellValue();
                        tpaReport.setAccidentDate(dateCellValue);
                    }else {
                        String s = String.format("%s列字段不是自定义yyyy/MM/dd类型,错误位置%s", hssfSheet.getRow(0).getCell(20),hssfRow.getCell(20).getAddress());
                        rowErrorStr.append(s).append("|");
                    }

                    if(HSSFDateUtil.isCellDateFormatted(hssfRow.getCell(21))){
                        Date dateCellValue = hssfRow.getCell(21).getDateCellValue();
                        tpaReport.setAccidentMonth(dateCellValue);
                    }

                    if(hssfRow.getCell(22).getCellType()!=1){
                        String s = String.format("%s列字段不是自定义yyyy/MM/dd类型,错误位置%s", hssfSheet.getRow(0).getCell(22),hssfRow.getCell(22).getAddress());
                        rowErrorStr.append(s).append("|");
                    }else{
                        String reportDateStr = hssfRow.getCell(22).getStringCellValue();
                        Date reportDate = sdf3.parse(reportDateStr);
                        tpaReport.setReportDate(reportDate);
                    }

                    String reportNo = hssfRow.getCell(23).getStringCellValue();
                    if(StringUtils.isNotBlank(reportNo)){
                        tpaReport.setRegisterNo(hssfRow.getCell(23).getStringCellValue());
                    }else {
                        String s = String.format("%s列字段为空,不能为空,错误位置%s", hssfSheet.getRow(0).getCell(22),hssfRow.getCell(22).getAddress());
                        rowErrorStr.append(s).append("|");
                    }

                    tpaReport.setProductName(hssfRow.getCell(24).getStringCellValue());
                    tpaReport.setLiabilityName(hssfRow.getCell(25).getStringCellValue());
                    tpaReport.setHospitalName(hssfRow.getCell(26).getStringCellValue());
                    tpaReport.setHospitalDepartmentName(hssfRow.getCell(27).getStringCellValue());
                    tpaReport.setDiagnosis(hssfRow.getCell(28).getStringCellValue());
                    tpaReport.setDiseaseCode(hssfRow.getCell(29).getStringCellValue());


                    if(hssfRow.getCell(30).getCellType() != 0){
                        String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(30),hssfRow.getCell(30).getAddress());
                        rowErrorStr.append(s).append("|");
                    }else {
                        double claimAmount = hssfRow.getCell(30).getNumericCellValue();
                        BigDecimal ca1 = new BigDecimal(claimAmount);
                        tpaReport.setClaimAmount(ca1);
                    }

                    if(hssfRow.getCell(31).getCellType() != 0){
                        String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(31),hssfRow.getCell(31).getAddress());
                        rowErrorStr.append(s).append("|");
                    }else {
                        double herbalMedicineFee = hssfRow.getCell(31).getNumericCellValue();
                        BigDecimal hmf = new BigDecimal(herbalMedicineFee);
                        tpaReport.setHerbalMedicineFee(hmf);
                    }


                    if(hssfRow.getCell(32).getCellType() != 0){
                        String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(32),hssfRow.getCell(32).getAddress());
                        rowErrorStr.append(s).append("|");
                    }else {
                        double therapyFee = hssfRow.getCell(32).getNumericCellValue();
                        BigDecimal tf = new BigDecimal(therapyFee);
                        tpaReport.setTherapyFee(tf);
                    }


                    if(hssfRow.getCell(33).getCellType() != 0){
                        String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(33),hssfRow.getCell(33).getAddress());
                        rowErrorStr.append(s).append("|");
                    }else {
                        double medicalDecutAmount = hssfRow.getCell(33).getNumericCellValue();
                        BigDecimal mda = new BigDecimal(medicalDecutAmount);
                        tpaReport.setMedicareDeductAmount(mda);
                    }


                    if(hssfRow.getCell(34).getCellType() != 0){
                        String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(34),hssfRow.getCell(34).getAddress());
                        rowErrorStr.append(s).append("|");
                    }else {
                        double nonResponsibleAmount = hssfRow.getCell(34).getNumericCellValue();
                        BigDecimal npa = new BigDecimal(nonResponsibleAmount);
                        tpaReport.setNonresponsibleAmount(npa);
                    }

                    if(hssfRow.getCell(35).getCellType() != 0){
                        String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(35),hssfRow.getCell(35).getAddress());
                        rowErrorStr.append(s).append("|");
                    }else {
                        double medicarePayAmount = hssfRow.getCell(35).getNumericCellValue();
                        BigDecimal ma = new BigDecimal(medicarePayAmount);
                        tpaReport.setMedicarePayAmount(ma);
                    }


                    if(hssfRow.getCell(36).getCellType() != 0){
                        String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(36),hssfRow.getCell(36).getAddress());
                        rowErrorStr.append(s).append("|");
                    }else {
                        double otherAmount = hssfRow.getCell(36).getNumericCellValue();
                        BigDecimal oa = new BigDecimal(otherAmount);
                        tpaReport.setOtherAmount(oa);
                    }

                    if(hssfRow.getCell(37).getCellType() != 0){
                        String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(37),hssfRow.getCell(37).getAddress());
                        rowErrorStr.append(s).append("|");
                    }else {
                        double checkAmount = hssfRow.getCell(37).getNumericCellValue();
                        BigDecimal ca2 = new BigDecimal(checkAmount);
                        tpaReport.setCheckAmount(ca2);
                    }

                    if(hssfRow.getCell(38).getCellType() != 0){
                        String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(38),hssfRow.getCell(38).getAddress());
                        rowErrorStr.append(s).append("|");
                    }else {
                        double paidPromotion = hssfRow.getCell(38).getNumericCellValue();
                        BigDecimal pp = new BigDecimal(paidPromotion);
                        tpaReport.setPaidProportion(pp);
                    }

                    if(hssfRow.getCell(39).getCellType() != 0){
                        String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(39),hssfRow.getCell(39).getAddress());
                        rowErrorStr.append(s).append("|");
                    }else {
                        double paidAmount = hssfRow.getCell(39).getNumericCellValue();
                        BigDecimal pa = new BigDecimal(paidAmount);
                        tpaReport.setPaidAmount(pa);
                    }

                    tpaReport.setDeductInstruction(hssfRow.getCell(40).getStringCellValue());
                    tpaReport.setCaseStatus(hssfRow.getCell(41).getStringCellValue());

                    String closeDateStr = hssfRow.getCell(42).getStringCellValue();
//                    Date closeDate = sdf3.parse(closeDateStr);
//                    tpaReport.setCloseDate(closeDate);

                    if(HSSFDateUtil.isCellDateFormatted(hssfRow.getCell(43))){
                        Date dateCellValue = hssfRow.getCell(43).getDateCellValue();
                        tpaReport.setCloseMonth(dateCellValue);
                    }
                    tpaReport.setCloseDuration(hssfRow.getCell(44).getStringCellValue());
                    tpaReport.setAccountBankName(hssfRow.getCell(45).getStringCellValue());
                    tpaReport.setTransAccountName(hssfRow.getCell(46).getStringCellValue());
                    tpaReport.setTransAccount(hssfRow.getCell(47).getStringCellValue());
                    String transDateStr = hssfRow.getCell(48).getStringCellValue();
                    Date  transDate = sdf3.parse(transDateStr);
                    tpaReport.setTransDate(transDate);
                    tpaReport.setTransDuration(hssfRow.getCell(49).getStringCellValue());
                    tpaReport.setRemark(hssfRow.getCell(50).getStringCellValue());
                    tpaReport.setSource(hssfRow.getCell(51).getStringCellValue());
                    tpaReport.setTpaCaseNo(hssfRow.getCell(52).getStringCellValue());
                    list.add(tpaReport);
                }
                if(StringUtils.isNotEmpty(rowErrorStr.toString())){
                    String rowError = rowErrorStr.toString().substring(0, rowErrorStr.toString().length() - 1);
                    errorMsgMap.put(rowNum,rowError);
                }
            }          //行遍历结束
            jo.put("resultList",list);
            jo.put("errorMsg",errorMsgMap);
            System.out.println("转换后的数据为"+JSON.toJSONString(jo));
        }finally {
            workbook.close();
        }


        return jo;

    }


    public static byte[] storeErrorInfoToData(Map<Integer,String> map, MultipartFile imageFile) throws Exception{
        Workbook workbook = null;
        byte[] b = null;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            workbook = create(imageFile.getInputStream());

            Sheet hssfSheet = workbook.getSheetAt(0);

            int numberOfCells = hssfSheet.getRow(0).getPhysicalNumberOfCells();
            hssfSheet.setColumnWidth(numberOfCells,30*512);
            Set<Integer> rows = map.keySet();
            Row row1 = hssfSheet.getRow(0);
            Cell cell = row1.createCell((short) numberOfCells);
            cell.setCellValue("错误信息");
            for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                hssfSheet.getRow(rowNum).createCell((short)numberOfCells);
            }
            // 循环行Row
            for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                if(rows.contains(rowNum)){
                    //当前行数据有错误
                    Row hssfRow = hssfSheet.getRow(rowNum);
                    hssfRow.getCell(numberOfCells).setCellValue(map.get(rowNum));

                }
            }
            try {
                workbook.write(os);
            } catch (IOException e) {
                log.error("Excel数据写出到流异常");
            }
            b = os.toByteArray();
        }finally {
            workbook.close();
        }
        return b;
    }
    public static byte[] writeDataToExcel(Map<Integer, String> map) {
        byte[] b = null;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        // 声明一个工作薄
        HSSFWorkbook wb = new HSSFWorkbook();
        try {

            //声明一个单子并命名
            HSSFSheet sheet = wb.createSheet("错误日志");
            //给单子名称一个长度
            sheet.setDefaultColumnWidth((short) 15);
            // 生成一个样式
            HSSFCellStyle style = wb.createCellStyle();
            //创建第一行（也可以称为表头）
            HSSFRow row = sheet.createRow(0);
            //样式字体居中
            style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
            //给表头第一行一次创建单元格
            HSSFCell cell = row.createCell((short) 0);
            cell.setCellValue("行号");
            cell.setCellStyle(style);
            cell = row.createCell((short) 1);
            cell.setCellValue("错误信息");
            cell.setCellStyle(style);
            int i = 1;

            Set<Integer> set = map.keySet();
            for(Integer key:set){
                String s = map.get(key);
                HSSFRow r = sheet.createRow(i);
                r.createCell(0).setCellValue(key);
                r.createCell(1).setCellValue(s);
                i++;
            }

            try {
                wb.write(os);
            } catch (IOException e) {
                log.error("Excel数据写出到流异常");
            }
            b = os.toByteArray();
            return b;

        }catch (Exception e){
            log.error("写入数据到excel字节流中发生异常"+e);
        }finally {
            try {
                if(os!=null){
                    os.close();
                }
            }catch (IOException e){
                log.error("关闭流异常"+e);
            }
            try {
                if(wb!=null){
                    wb.close();
                }
            }catch (IOException e){
                log.error("关闭流异常"+e);
            }

        }
        return b;
    }


    public static Workbook create(InputStream in) throws IOException,InvalidFormatException {
        if (!in.markSupported()) {
            in = new PushbackInputStream(in, 8);
        }
        if (POIFSFileSystem.hasPOIFSHeader(in)) {
            return new HSSFWorkbook(in);
        }
        if (POIXMLDocument.hasOOXMLHeader(in)) {
            return new XSSFWorkbook(OPCPackage.open(in));
        }
        throw new IllegalArgumentException("你的excel版本目前poi解析不了");
    }

    public static boolean checkDate(String s){
//                String str = "12413243567767.8" ;        // 指定好一个日期格式的字符串
//                String str = String.valueOf(d);
        String pat = "\\d{4}-\\d{2}-\\d{2}" ;    // 指定好正则表达式
        Pattern p = compile(pat) ;    // 实例化Pattern类
        Matcher m = p.matcher(s) ;    // 实例化Matcher类
        if(m.matches()){        // 进行验证的匹配，使用正则
            return true;
        }else{
            System.out.println("日期格式不合法！") ;
            return false;
        }
    }

}