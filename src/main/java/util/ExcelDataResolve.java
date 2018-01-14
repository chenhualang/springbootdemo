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
public class ExcelDataResolve {
    public static JSONObject getAllByExcel(InputStream is) throws Exception {

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Workbook workbook = null;
            JSONObject jo = new JSONObject();
            try {
                workbook = create(is);
                HaClaimDataDTO claimDataDTO = null;
                Map<String,String> map  = new HashMap<>();
                List<HaClaimDataDTO> list = new ArrayList<HaClaimDataDTO>();
                Sheet hssfSheet = workbook.getSheetAt(0);
                hssfSheet.autoSizeColumn(1);
                int numberOfCells = hssfSheet.getRow(0).getPhysicalNumberOfCells();
                jo.put("totalColumn",numberOfCells);
                jo.put("totalRow",hssfSheet.getLastRowNum());
                if(numberOfCells!=46||hssfSheet.getLastRowNum()==0){
                    return jo;
                }
                // 循环行Row
                Map<Integer,String> errorMsgMap = new HashMap<>();
                for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                    Row hssfRow = hssfSheet.getRow(rowNum);
                    StringBuilder rowErrorStr = new StringBuilder();
                    if (hssfRow != null) {
                        claimDataDTO = new HaClaimDataDTO();
                        claimDataDTO.setAppHolderName(hssfRow.getCell(2).getStringCellValue());
                        claimDataDTO.setGroupPolicyNo(hssfRow.getCell(3).getStringCellValue());
                        claimDataDTO.setIndividualPolicyNo(hssfRow.getCell(4).getStringCellValue());
                        claimDataDTO.setPlanName(hssfRow.getCell(5).getStringCellValue());
                        claimDataDTO.setCustNo(hssfRow.getCell(6).getStringCellValue());
                        claimDataDTO.setInsuranceName(hssfRow.getCell(7).getStringCellValue());
                        claimDataDTO.setSex(hssfRow.getCell(8).getStringCellValue());
                        String birthDateStr = hssfRow.getCell(9).getStringCellValue();
                        Date birthDate = sdf.parse(birthDateStr);
                        claimDataDTO.setBirthDate(birthDate);
                        claimDataDTO.setCertType(hssfRow.getCell(10).getStringCellValue());
                        claimDataDTO.setCustNo(hssfRow.getCell(11).getStringCellValue());
                        claimDataDTO.setEnglishName(hssfRow.getCell(12).getStringCellValue());
                        claimDataDTO.setDepartment(hssfRow.getCell(13).getStringCellValue());
                        claimDataDTO.setCity(hssfRow.getCell(14).getStringCellValue());
                        claimDataDTO.setReporterInsuredRelation(hssfRow.getCell(15).getStringCellValue());
                        claimDataDTO.setAccidentReason(hssfRow.getCell(16).getStringCellValue());

                        if (hssfRow.getCell(17).getCellType() != 0) {
                            String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(17),hssfRow.getCell(17).getAddress());
                            rowErrorStr.append(s).append("|");
                        }else if (HSSFDateUtil.isCellDateFormatted(hssfRow.getCell(17))) {
                            double d = hssfRow.getCell(17).getNumericCellValue();
                            Date accidentDate = HSSFDateUtil.getJavaDate(d);
                            String ds = sdf.format(accidentDate);
                            boolean b = checkDate(ds);
                            if(b){
                                claimDataDTO.setAccidentDate(accidentDate);
                            }else {
                                String s = String.format("%s列字段是数字类型,但是不是日期格式(yyyy-MM-dd),错误位置%s", hssfSheet.getRow(0).getCell(17),hssfRow.getCell(17).getAddress());
                                rowErrorStr.append(s).append("|");
                            }
                        }
                        if(hssfRow.getCell(18).getCellType() != 0){
                            String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(18),hssfRow.getCell(18).getAddress());
                            rowErrorStr.append(s).append("|");
                        }else if (HSSFDateUtil.isCellDateFormatted(hssfRow.getCell(18))) {
                            double d = hssfRow.getCell(18).getNumericCellValue();
                            Date reportDate = HSSFDateUtil.getJavaDate(d);
                            String ds = sdf.format(reportDate);
                            boolean b = checkDate(ds);
                            if(b){
                                claimDataDTO.setReportDate(reportDate);
                            }else {
                                String s = String.format("%s列字段是数字类型,但是不是日期格式(yyyy-MM-dd),错误位置%s", hssfSheet.getRow(0).getCell(18),hssfRow.getCell(18).getAddress());
                                rowErrorStr.append(s).append("|");
                            }
                        }
                        if(hssfRow.getCell(37).getCellType() != 0){
                            String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(37),hssfRow.getCell(37).getAddress());
                            rowErrorStr.append(s).append("|");
                        }else if (HSSFDateUtil.isCellDateFormatted(hssfRow.getCell(37))) {
                            double d = hssfRow.getCell(37).getNumericCellValue();
                            Date closeDate = HSSFDateUtil.getJavaDate(d);
                            String ds = sdf.format(closeDate);
                            boolean b = checkDate(ds);
                            if(b){
                                claimDataDTO.setCloseDate(closeDate);
                            }else {
                                String s = String.format("%s列字段是数字类型,但是不是日期格式(yyyy-MM-dd),错误位置%s", hssfSheet.getRow(0).getCell(37),hssfRow.getCell(37).getAddress());
                                rowErrorStr.append(s).append("|");
                            }
                        }

                        if(hssfRow.getCell(25).getCellType() != 0){
                            String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(25),hssfRow.getCell(25).getAddress());
                            rowErrorStr.append(s).append("|");
                        }else {
                            double claimAmount = hssfRow.getCell(25).getNumericCellValue();
                            BigDecimal ca1 = new BigDecimal(claimAmount);
                            claimDataDTO.setNonresponsibleAmount(ca1);
                        }

                        if(hssfRow.getCell(26).getCellType() != 0){
                            String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(26),hssfRow.getCell(26).getAddress());
                            rowErrorStr.append(s).append("|");
                        }else {
                            double herbalMedicineFee = hssfRow.getCell(26).getNumericCellValue();
                            BigDecimal hmf = new BigDecimal(herbalMedicineFee);
                            claimDataDTO.setNonresponsibleAmount(hmf);
                        }


                        if(hssfRow.getCell(27).getCellType() != 0){
                            String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(27),hssfRow.getCell(27).getAddress());
                            rowErrorStr.append(s).append("|");
                        }else {
                            double therapyFee = hssfRow.getCell(27).getNumericCellValue();
                            BigDecimal tf = new BigDecimal(therapyFee);
                            claimDataDTO.setNonresponsibleAmount(tf);
                        }


                        if(hssfRow.getCell(28).getCellType() != 0){
                            String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(28),hssfRow.getCell(28).getAddress());
                            rowErrorStr.append(s).append("|");
                        }else {
                            double medicalDecutAmount = hssfRow.getCell(28).getNumericCellValue();
                            BigDecimal mda = new BigDecimal(medicalDecutAmount);
                            claimDataDTO.setMedicareDeductAmount(mda);
                        }


                        if(hssfRow.getCell(29).getCellType() != 0){
                            String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(29),hssfRow.getCell(29).getAddress());
                            rowErrorStr.append(s).append("|");
                        }else {
                            double nonResponsibleAmount = hssfRow.getCell(29).getNumericCellValue();
                            BigDecimal npa = new BigDecimal(nonResponsibleAmount);
                            claimDataDTO.setNonresponsibleAmount(npa);
                        }

                        if(hssfRow.getCell(30).getCellType() != 0){
                            String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(30),hssfRow.getCell(30).getAddress());
                            rowErrorStr.append(s).append("|");
                        }else {
                            double medicareAmount = hssfRow.getCell(30).getNumericCellValue();
                            BigDecimal ma = new BigDecimal(medicareAmount);
                            claimDataDTO.setNonresponsibleAmount(ma);
                        }


                        if(hssfRow.getCell(31).getCellType() != 0){
                            String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(31),hssfRow.getCell(31).getAddress());
                            rowErrorStr.append(s).append("|");
                        }else {
                            double otherAmount = hssfRow.getCell(31).getNumericCellValue();
                            BigDecimal oa = new BigDecimal(otherAmount);
                            claimDataDTO.setOtherAmount(oa);
                        }

                        if(hssfRow.getCell(32).getCellType() != 0){
                            String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(32),hssfRow.getCell(32).getAddress());
                            rowErrorStr.append(s).append("|");
                        }else {
                            double checkAmount = hssfRow.getCell(32).getNumericCellValue();
                            BigDecimal ca2 = new BigDecimal(checkAmount);
                            claimDataDTO.setCheckAmount(ca2);
                        }

                        if(hssfRow.getCell(34).getCellType() != 0){
                            String s = String.format("%s列字段不是数字类型,错误位置%s", hssfSheet.getRow(0).getCell(34),hssfRow.getCell(34).getAddress());
                            rowErrorStr.append(s).append("|");
                        }else {
                            double paidAmount = hssfRow.getCell(34).getNumericCellValue();
                            BigDecimal pa = new BigDecimal(paidAmount);
                            claimDataDTO.setPaidAmount(pa);
                        }



                        claimDataDTO.setRegisterNo(hssfRow.getCell(19).getStringCellValue());
                        claimDataDTO.setProductName(hssfRow.getCell(20).getStringCellValue());
                        claimDataDTO.setLiabilityName(hssfRow.getCell(21).getStringCellValue());
                        claimDataDTO.setHospitalName(hssfRow.getCell(22).getStringCellValue());
                        claimDataDTO.setHospitalDepartmentName(hssfRow.getCell(23).getStringCellValue());
                        claimDataDTO.setDiagnosis(hssfRow.getCell(24).getStringCellValue());

                        String paidProportion = hssfRow.getCell(33).getStringCellValue();
                        BigDecimal pp = new BigDecimal(paidProportion);
                        claimDataDTO.setPaidProportion(pp);
                        claimDataDTO.setDeductInstruction(hssfRow.getCell(35).getStringCellValue());
                        claimDataDTO.setCaseStatus(hssfRow.getCell(36).getStringCellValue());
                        claimDataDTO.setAccountBankName(hssfRow.getCell(38).getStringCellValue());
                        claimDataDTO.setTransAccountName(hssfRow.getCell(39).getStringCellValue());
                        claimDataDTO.setTransAccount(hssfRow.getCell(40).getStringCellValue());
                        String transDateStr = hssfRow.getCell(41).getStringCellValue();
                        Date transDate = null;
                        if (StringUtils.isNotEmpty(transDateStr)) {
                            transDate = sdf.parse(transDateStr);
                        }
                        claimDataDTO.setTransDate(transDate);
                        claimDataDTO.setRemark(hssfRow.getCell(42).getStringCellValue());
                        claimDataDTO.setSource(hssfRow.getCell(43).getStringCellValue());
                        claimDataDTO.setBarcode(hssfRow.getCell(44).getStringCellValue());
                        claimDataDTO.setBenType(hssfRow.getCell(45).getStringCellValue());
                        list.add(claimDataDTO);
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