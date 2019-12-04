package com.ylw.springcloud.eureka.a;

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

    @ApiOperation(value = "新增学生信息", notes = "新增学生信息：用户名、性别、年龄")
    @ApiResponses({
            @ApiResponse(code = 200, message = "校验成功"),
            @ApiResponse(code = 400, message = "校验失败"),
            @ApiResponse(code = 401, message = "参数不合法"),
            @ApiResponse(code = 500, message = "系统异常"),
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userName", value = "学生名字", required = true, dataType = "String"),
            @ApiImplicitParam(name = "sex", value = "性别", required = false, dataType = "String"),
            @ApiImplicitParam(name = "age", value = "年龄", required = false, dataType = "Integer"),
    })
    @RequestMapping(value = "/addStudent/{userName}/{sex}/{age}", method = RequestMethod.POST)
    public Response addStudent(@PathVariable String userName, @PathVariable String sex, @PathVariable Integer age) {
        logger.info("新增学生信息操作");
        return new Response(200, "新增学生信息成功！");
    }


    @ApiOperation(value = "删除学生信息", notes = "删除学生信息：用户名、性别、年龄")
    @ApiResponses({
            @ApiResponse(code = 200, message = "校验成功"),
            @ApiResponse(code = 400, message = "校验失败"),
            @ApiResponse(code = 401, message = "参数不合法"),
            @ApiResponse(code = 500, message = "系统异常"),
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uuid", value = "学生id", required = true, dataType = "String"),
    })
    @RequestMapping(value = "/delStudent/{uuid}", method = RequestMethod.DELETE)
    public Response delStudent(@PathVariable String uuid) {
        logger.info("删除学生信息操作");
        return new Response(200, "删除学生信息成功！");
    }

    @ApiOperation(value = "修改学生信息", notes = "修改学生信息：用户名、性别、年龄")
    @ApiResponses({
            @ApiResponse(code = 200, message = "校验成功"),
            @ApiResponse(code = 400, message = "校验失败"),
            @ApiResponse(code = 401, message = "参数不合法"),
            @ApiResponse(code = 500, message = "系统异常"),
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "学生id", required = true, dataType = "String"),
            @ApiImplicitParam(name = "userName", value = "学生名字", required = true, dataType = "String"),
            @ApiImplicitParam(name = "sex", value = "性别", required = false, dataType = "String"),
            @ApiImplicitParam(name = "age", value = "年龄", required = false, dataType = "Integer"),
    })
    @RequestMapping(value = "/updateStudent/{id}/{userName}/{sex}/{age}", method = RequestMethod.POST)
    public Response updateStudent(@PathVariable String id, @PathVariable String userName, @PathVariable String sex, @PathVariable Integer age) {
        logger.info("修改学生信息操作");
        return new Response(200, "修改学生信息成功！");
    }


}
