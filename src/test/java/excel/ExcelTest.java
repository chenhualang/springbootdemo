package excel;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
//import com.zhongan.health.common.utils.excel.parse.ExcelReader;
//import com.zhongan.health.common.utils.excel.parse.callback.SimpleExcelTemplateCallback;
//import org.apache.commons.collections4.CollectionUtils;
import org.assertj.core.util.Lists;
import org.junit.Test;
//import template.TengxunReportUploadTemplate;
import tk.mybatis.mapper.model.HaClaimHospital;
import tk.mybatis.mapper.model.HaTpaReport;
import util.ClaimHospitalResolve;
import util.ExcelDataResolve;
import util.TengxunReportResolve;

import java.io.FileInputStream;
import java.util.List;
import java.util.Map;

public class ExcelTest {
    @Test
    public void testParseExcel(){
        String filePath = "D:\\chenhualang\\docs\\tengxun1.xls";
        try{
            FileInputStream fis = new FileInputStream(filePath);
            JSONObject json = ExcelDataResolve.getAllByExcel(fis);
            System.out.println("解析结果如下;");
            System.out.println("excel解析结果为"+json);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


//    @Test
//    public void test2(){
//        String filePath = "D:\\chenhualang\\docs\\tengxun3.xlsx";
//        try{
//            FileInputStream fis = new FileInputStream(filePath);
//            ExcelReader reader = new ExcelReader(fis);
//            SimpleExcelTemplateCallback<TengxunReportUploadTemplate> callback = new SimpleExcelTemplateCallback<>(
//                    TengxunReportUploadTemplate.class, 2);
//            reader.parse(2, callback);
//            reader.close();
//            List<TengxunReportUploadTemplate> els = callback.getResults();
//            System.out.println("==============="+els.size());
////            if (CollectionUtils.isEmpty(els)) {
////                System.out.println("上传文件数据为空");
////            }
////            Map<String, String> gensites;
////            StringBuilder errMsg = new StringBuilder();
////            for (TengxunReportUploadTemplate template : els){
////
////            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//
//    }



    @Test
    public void test3(){
        String filePath = "D:\\chenhualang\\docs\\hospital.xlsx";
        try{
            FileInputStream fis = new FileInputStream(filePath);
            List<HaClaimHospital> claimHospitalList = ClaimHospitalResolve.getAllByExcel(fis);
            System.out.println("解析结果如下;");
            System.out.println("excel解析结果为"+ JSON.toJSONString(claimHospitalList));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void test4(){
        String filePath = "D:\\chenhualang\\docs\\tengxun4.xlsx";
        try{
            FileInputStream fis = new FileInputStream(filePath);
            JSONObject json = TengxunReportResolve.getAllByExcel(fis);
            System.out.println("解析结果如下;");
            System.out.println("excel解析结果为"+ json);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
