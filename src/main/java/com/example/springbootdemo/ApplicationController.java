package com.example.springbootdemo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dataobject.HaClaimApplicationDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.mapper.HaClaimApplicationMapper;
import tk.mybatis.mapper.model.HaClaimApplication;

import java.util.Date;
import java.util.List;

@RequestMapping("application")
@RestController
public class ApplicationController {
    @Autowired
    private HaClaimApplicationMapper applicationMapper;

    @RequestMapping(value = "/list/all",method = RequestMethod.GET)
    public List<HaClaimApplication> listAll() {
        HaClaimApplication t = new HaClaimApplication();
        t.setSource("op");
        List<HaClaimApplication> applications = applicationMapper.select(t);
        return applications;
    }

    @RequestMapping(value = "/selectByPage",method = RequestMethod.POST)
    public PageInfo<HaClaimApplicationDO> selectApplicationByPage(int currentPage, int pageSize){
        PageHelper.startPage(currentPage, pageSize);
        HaClaimApplicationDO t = new HaClaimApplicationDO();
        t.setSource("op");
//        t.setStatus("reportClosed");
        t.setLevel(1);
        List<HaClaimApplicationDO> haClaimApplications = applicationMapper.selectApplicationList(t);
        PageInfo<HaClaimApplicationDO> pageInfo = new PageInfo<>(haClaimApplications);
        return pageInfo;
    }

    @RequestMapping("/query")
    public int selectByCondition(HaClaimApplication condition){
        HaClaimApplication t = new HaClaimApplication();
        t.setId(9840003L);
        List<HaClaimApplication> haClaimApplicationList = applicationMapper.select(t);
        HaClaimApplication haClaimApplication = haClaimApplicationList.get(0);
        Date closeDate = haClaimApplication.getCloseDate();
        return 1;
    }

    @RequestMapping("/selectPart")
    public List<HaClaimApplication> getPart(){
        List<HaClaimApplication> list = applicationMapper.selectPart(9840001L,9840005L);
        return list;
    }
}
