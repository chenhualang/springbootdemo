package tk.mybatis.mapper.mapper;

import dataobject.HaClaimApplicationDO;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.model.HaClaimApplication;

import java.util.List;

public interface HaClaimApplicationMapper extends Mapper<HaClaimApplication> {
    public List<HaClaimApplicationDO> selectApplicationList(HaClaimApplicationDO t);

    List<HaClaimApplication> selectPart(long l, long l1);
}