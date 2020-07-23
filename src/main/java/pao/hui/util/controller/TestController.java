package pao.hui.util.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pao.hui.util.bean.TestBean;

/**
 * @PackageName: pao.hui.util.controller
 * @Description:
 * @author: paohui
 * @date: 2020/7/10
 */

@Api(description = "测试类")
@Slf4j
@RestController
public class TestController {

    @ApiOperation("一个简单的测试类接口")
    @PostMapping("/verify_test1.service")
    public TestBean test(TestBean testBean){
        log.info("swagger测试");
        return testBean;
    }

//    @ApiOperation("不简单的测试接口")
//    @PostMapping("/verify_test2.service")
//    public String test2(@ApiParam(name = "字符串") String str){
//        return str;
//    }
}
