package com.example.springbootdemo;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.mapper.HaClaimHospitalMapper;
import tk.mybatis.mapper.model.HaClaimApplication;
import tk.mybatis.mapper.model.HaClaimHospital;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@RequestMapping("hospital")
@RestController
public class HospitalController {
    @Autowired
    private HaClaimHospitalMapper haClaimHospitalMapper;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public  Set<String> listAll(){
        List<HaClaimHospital> claimHospitalList = haClaimHospitalMapper.selectHospitalList("0000001","0039416");
        System.out.println("一共有"+claimHospitalList.size()+"条记录");
        Set<Integer> codeSet1 = new TreeSet<>();
        for (HaClaimHospital haClaimHospital : claimHospitalList) {
            String circCode = haClaimHospital.getCircCode();
            int a = Integer.parseInt(circCode);
            codeSet1.add(a);
        }
        Set<Integer> codeSet2 = new TreeSet<>();
        for(int i =0;i<39416;i++){
          if(!codeSet1.contains(i)){
              codeSet2.add(i);
          }
        }
        Set<String> cs = new TreeSet<>();
        for (Integer integer : codeSet2) {
            String s = String.valueOf(integer);
            String codeStr = null;
            switch (s.length()){
                case 1:
                    codeStr= "000000"+s;
                    break;
                case 2:
                    codeStr= "00000"+s;
                    break;
                case  3:
                    codeStr= "0000"+s;
                    break;
                case  4:
                    codeStr= "000"+s;
                    break;
                case  5:
                    codeStr= "00"+s;
                    break;
                case  6:
                    codeStr= "0"+s;
                    break;
            }
            System.out.println("========"+codeStr);
            cs.add(codeStr);
        }
        return cs;
    }
}
