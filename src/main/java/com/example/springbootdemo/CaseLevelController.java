package com.example.springbootdemo;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.mapper.HaClaimCaseLevelMapper;
import tk.mybatis.mapper.model.HaClaimCaseLevel;

import java.util.List;

@RequestMapping("/caseLevel")
@RestController
public class CaseLevelController {
    @Autowired
    private HaClaimCaseLevelMapper mapper;

    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public String selectCaseLevel(@RequestParam(value="reportNo", required = false) String reportNo){
        HaClaimCaseLevel claimLevel = new HaClaimCaseLevel();
        claimLevel.setReportNo(reportNo);
        HaClaimCaseLevel claimLevel1 = mapper.selectHaClaimCaseLevel(claimLevel);
        return JSON.toJSONString(claimLevel1);
    }

    @RequestMapping(value="/update",method = RequestMethod.POST)
    public String updateCaseLevel(@RequestParam(value = "reportNo",required = false) String reportNo){
        HaClaimCaseLevel claimLevel = new HaClaimCaseLevel();
        claimLevel.setReportNo(reportNo);
        claimLevel.setLevel(1.5);
        mapper.updatebyCaseLevel(claimLevel);
        System.out.println("成功更新caseLevel");
        return "success";
    }

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public String saveCaseLevel(@RequestParam(value="reportNo", required = false) String reportNo){
        HaClaimCaseLevel claimLevel = new HaClaimCaseLevel();
        double a = 1.5;
        claimLevel.setLevel(a);
        claimLevel.setScore(60);
        claimLevel.setReportNo(reportNo);
        claimLevel.setId(12295L);
        int n = mapper.saveHaClaimCaseLevel(claimLevel);
        System.out.println("成功保存caseLevel");
        return "success";
    }
}
