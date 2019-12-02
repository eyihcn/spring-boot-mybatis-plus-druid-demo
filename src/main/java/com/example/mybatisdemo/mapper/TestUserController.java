package com.example.mybatisdemo.mapper;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <pre>
 * Description:
 * </pre>
 *
 * @author chenyi
 * @date 2019/11/29
 */

@RequestMapping("testUser")
@RestController
public class TestUserController {

    @Resource
    TestUserMapper testUserMapper;

    @PostMapping("/getById")
    public TestUser getById(@RequestParam(name = "id") Integer id){

        return testUserMapper.selectById(id);
    }
}
