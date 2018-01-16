//package com.example.springbootdemo;
//
//import com.alibaba.fastjson.JSON;
//import constant.HaClaimWebUriConst;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.collections4.CollectionUtils;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import javax.servlet.http.HttpServletResponse;
//import java.util.Date;
//import java.util.List;
//
//@RestController
//@Slf4j
//@RequestMapping(HaClaimWebUriConst.CL_WEB_ENUM_ROOT_URI)
//public class HaClaimEnumResourceContoller {
//    static {
//        CfgLoaderFactory.registerEnm("com.chen.health.common.share.enm", "com.chen.astraea.share.constants");
//    }
//    private final int maxAgeInSeconds = 21600;
//
//    @RequestMapping(method = RequestMethod.GET, value = HaClaimWebUriConst.CL_WEB_TASK_ENUM)
//    public BaseResult<List<CfgVO>> locdTaskStatusEnum(CfgQueryCondition cond, HttpServletResponse response) {
//        BaseResult<List<CfgVO>> result = new BaseResult<>();
//        List<CfgVO> data = Lists.newArrayList();
//        try {
//            if (!"ClaimStatusTypeEnum".equals(cond.getType())) {
//                throw new CheckException("枚举对象传递有误");
//            }
//            result = loadCfg(cond, response);
//            List<CfgVO> enumDatas = result.getResult();
//            if (CollectionUtils.isEmpty(enumDatas)) {
//                return result;
//            }
//            for (CfgVO cfgvo : enumDatas) {
//                if (ClaimStatusTypeEnum.CASECLOSED.getCode().equals(cfgvo.getCode())
//                        || ClaimStatusTypeEnum.REPORTCLOSED.getCode().equals(cfgvo.getCode())) {
//                    continue;
//                }
//                data.add(cfgvo);
//            }
//            result.setSuccess(data);
//        } catch (Exception ex) {
//        	//ExceptionHandler.handleException(ex, result);
//            ExceptionHandler.handleException(ex, result);
//        }
//        return result;
//    }
//
//}
