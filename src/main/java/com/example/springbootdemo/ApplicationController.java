package com.example.springbootdemo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.mapper.HaClaimApplicationMapper;
import tk.mybatis.mapper.model.HaClaimApplication;

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
    public PageInfo<HaClaimApplication> selectApplicationByPage(int currentPage, int pageSize){
        PageHelper.startPage(currentPage, pageSize);
        HaClaimApplication t = new HaClaimApplication();
        t.setSource("op");
//        t.setStatus("reportClosed");
        List<HaClaimApplication> haClaimApplications = applicationMapper.select(t);
        PageInfo<HaClaimApplication> pageInfo = new PageInfo<>(haClaimApplications);
        return pageInfo;
    }

//    @RequestMapping("update")
//    public int update(HaClaimApplication t){
//        return applicationMapper.
//    }
}
