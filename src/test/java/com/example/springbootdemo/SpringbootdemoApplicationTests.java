package com.example.springbootdemo;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.mapper.HaClaimCaseLevelMapper;
import tk.mybatis.mapper.mapper.HaClaimHospitalMapper;
import tk.mybatis.mapper.mapper.HaClaimMedicalBillingDOMapper;
import tk.mybatis.mapper.model.HaClaimCaseLevel;
import tk.mybatis.mapper.model.HaClaimMedicalBillingDO;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration({ "/mybatis.xml" })
public class SpringbootdemoApplicationTests {
	@Autowired
	private HaClaimCaseLevelMapper mapper;

	@Autowired
	private HaClaimMedicalBillingDOMapper medicalBillingDOMapper;

	@Test
	public void test() {
		HaClaimCaseLevel claimCaseLevelDTO = new HaClaimCaseLevel();
		claimCaseLevelDTO.setLevel(1.5);
		claimCaseLevelDTO.setReportNo("CL0300000860000604");
		claimCaseLevelDTO.setScore(1);
		claimCaseLevelDTO.setCreator("test");
		claimCaseLevelDTO.setModifier("test");
		claimCaseLevelDTO.setGmtCreated(new Date());
		claimCaseLevelDTO.setGmtModified(new Date());
		claimCaseLevelDTO.setIsDeleted("N");
		claimCaseLevelDTO.setId(594329657236L);
		mapper.insert(claimCaseLevelDTO);
		System.out.println("插入案件级别成功");
		System.out.println(JSON.toJSONString(claimCaseLevelDTO));
	}


	@Test
	public void Test2(){
		HaClaimMedicalBillingDO medicalBillingDO = new HaClaimMedicalBillingDO();
		medicalBillingDO.setHospitalCode("9999999");
		medicalBillingDO.setHospitalName("本代码中不存在的医院");
		medicalBillingDO.setHospitalCustomName("测试11111");
		medicalBillingDO.setMedicalBillingNo("5633737");
		medicalBillingDO.setId(22325006L);
		int n = medicalBillingDOMapper.updateByPrimaryKeySelective(medicalBillingDO);
		System.out.println("更新结果:"+n);

	}

}
