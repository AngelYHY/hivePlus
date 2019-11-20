package com.freestar.hiveplus.ynyc_dm.controller;


import com.freestar.hiveplus.config.ResponseHelper;
import com.freestar.hiveplus.config.ResponseModel;
import com.freestar.hiveplus.ynyc_dm.mapper.TestMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author zongzi
 * @since 2019-11-18
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @ApiOperation(value = "测试接口", httpMethod = "GET")
    @RequestMapping(value = "test", method = RequestMethod.GET)
    public ResponseModel test() {
//        testMapper.getAll()
//        adminMapper.selectList(null)
//        return ResponseHelper.buildResponseModel(testMapper.selectMaps(new QueryWrapper<Test>()
//                .eq("id", 1)));
//        return ResponseHelper.buildResponseModel(testMapper.getAll());
        return ResponseHelper.buildResponseModel(testMapper.getAll());
    }

}

