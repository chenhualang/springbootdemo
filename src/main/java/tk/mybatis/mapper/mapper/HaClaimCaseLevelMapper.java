package tk.mybatis.mapper.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.model.HaClaimCaseLevel;

public interface HaClaimCaseLevelMapper extends Mapper<HaClaimCaseLevel> {

    public int updatebyCaseLevel(HaClaimCaseLevel claimLevel);
    public HaClaimCaseLevel selectHaClaimCaseLevel(HaClaimCaseLevel claimLevel);
    public int saveHaClaimCaseLevel(HaClaimCaseLevel claimLevel);
}