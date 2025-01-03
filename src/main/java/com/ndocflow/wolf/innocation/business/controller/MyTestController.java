package com.ndocflow.wolf.innocation.business.controller;

import com.ndocflow.wolf.innocation.business.data.SignInData;
import com.ndocflow.wolf.innocation.business.entity.TestBusiness;
import com.ndocflow.wolf.innocation.business.mapper.TestBusinessMapper;
import com.ndocflow.wolf.innocation.common.base.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author is Mj
 * @date 2025-01-03 13:3107
 * @functionDesc
 **/
@RestController
@RequestMapping("/test")
public class MyTestController {
    @Autowired
    private TestBusinessMapper testBusinessMapper;

    @PostMapping("/add")
    public Result signIn(@RequestBody @Validated TestBusiness testBusiness) {
        testBusiness.setCreateTime(LocalDateTime.now());
        testBusiness.setUpdateTime(LocalDateTime.now());
        testBusinessMapper.insert(testBusiness);
        return new Result().success();
    }

}
