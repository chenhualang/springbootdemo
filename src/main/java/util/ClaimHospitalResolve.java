package util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import dataobject.HaClaimDataDTO;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import tk.mybatis.mapper.model.HaClaimHospital;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

public class ClaimHospitalResolve {
    public static List<HaClaimHospital> getAllByExcel(InputStream is) throws Exception {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Workbook workbook = null;
            JSONObject jo = new JSONObject();
            try {
                workbook = create(is);
                HaClaimHospital claimHospitalDTO = null;
                Map<String, String> map = new HashMap<>();
                List<HaClaimHospital> list = new ArrayList<HaClaimHospital>();
                Sheet hssfSheet = workbook.getSheetAt(0);
                // 循环行Row
                for (int rowNum = 1; rowNum <= hssfSheet.getLastRowNum(); rowNum++) {
                    Row hssfRow = hssfSheet.getRow(rowNum);
                    if (hssfRow != null) {
                        claimHospitalDTO = new HaClaimHospital();
                        claimHospitalDTO.setCircCode(hssfRow.getCell(0).getStringCellValue());
                        claimHospitalDTO.setName(hssfRow.getCell(1).getStringCellValue());
                        claimHospitalDTO.setProvince(hssfRow.getCell(2).getStringCellValue());
                        claimHospitalDTO.setCity(hssfRow.getCell(3).getStringCellValue());
                        claimHospitalDTO.setDistrict(hssfRow.getCell(4).getStringCellValue());
                        claimHospitalDTO.setHospitalClass(hssfRow.getCell(5).getStringCellValue());
                        claimHospitalDTO.setLevel(hssfRow.getCell(6).getStringCellValue());
                        list.add(claimHospitalDTO);
                    }          //行遍历结束
                }
                return list;
            }finally {
                workbook.close();
            }
    }

    public static Workbook create(InputStream in) throws IOException, InvalidFormatException {
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
}
