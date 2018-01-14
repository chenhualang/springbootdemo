package tk.mybatis.mapper.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.model.HaClaimHospital;

import java.util.List;

public interface HaClaimHospitalMapper extends Mapper<HaClaimHospital> {
    public List<HaClaimHospital> selectHospitalList(String b,String e);
}