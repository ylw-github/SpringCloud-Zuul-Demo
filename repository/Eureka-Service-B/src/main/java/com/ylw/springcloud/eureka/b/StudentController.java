package com.ylw.springcloud.eureka.b;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api")
@Api("学生信息管理系统相关的api")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @ApiOperation(value = "查询学生信息", notes = "查询学生信息：用户名、性别、年龄")
    @ApiResponses({
            @ApiResponse(code = 200, message = "校验成功"),
            @ApiResponse(code = 400, message = "校验失败"),
            @ApiResponse(code = 401, message = "参数不合法"),
            @ApiResponse(code = 500, message = "系统异常"),
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "学生id", required = true, dataType = "String"),
    })
    @RequestMapping(value = "/getStudent/{id}", method = RequestMethod.GET)
    public Response getStudent(@PathVariable String id) {
        logger.info("修改学生信息操作");
        return new Response(200, "修改学生信息成功！");
    }


}
