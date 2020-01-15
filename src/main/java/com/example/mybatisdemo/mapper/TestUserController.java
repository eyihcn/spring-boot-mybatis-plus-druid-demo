package com.example.mybatisdemo.mapper;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

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

    @PostMapping("/testBatch")
    public void testBatch(){

        String sql = "UPDATE `test`.`test_user` SET `id`='1', `uname`='aa', `pwd`='pwd', `test_filed`='ttttt' WHERE (`id`='1'); " +
                "UPDATE `test`.`test_user` SET `id`='2', `uname`='a', `pwd`='pwd', `test_filed`='ttttt' WHERE (`id`='2'); " +
                "UPDATE `test`.`test_user` SET `id`='3', `uname`='a', `pwd`='pwd', `test_filed`='ttttt' WHERE (`id`='3'); " +
                "UPDATE `test`.`test_user` SET `id`='4', `uname`='aa', `pwd`='pwd', `test_filed`='1' WHERE (`id`='4'); " +
                "UPDATE `test`.`test_user` SET `id`='5', `uname`='aa', `pwd`='pwd', `test_filed`='1' WHERE (`id`='5'); " +
                "UPDATE `test`.`test_user` SET `id`='6', `uname`='aa', `pwd`='pwd', `test_filed`='1' WHERE (`id`='6'); " +
                "UPDATE `test`.`test_user` SET `id`='7', `uname`='aa', `pwd`='pwd', `test_filed`='1' WHERE (`id`='7'); " +
                "UPDATE `test`.`test_user` SET `id`='8', `uname`='aa', `pwd`='pwd', `test_filed`='1' WHERE (`id`='8'); " +
                "UPDATE `test`.`test_user` SET `id`='9', `uname`='aa', `pwd`='pwd', `test_filed`='1' WHERE (`id`='9'); " +
                "UPDATE `test`.`test_user` SET `id`='10', `uname`='aa', `pwd`='pwd', `test_filed`='1' WHERE (`id`='10'); " +
                "UPDATE `test`.`test_user` SET `id`='11', `uname`='aa', `pwd`='pwd', `test_filed`='1' WHERE (`id`='11'); " +
                "UPDATE `test`.`test_user` SET `id`='12', `uname`='aa', `pwd`='pwd', `test_filed`='1' WHERE (`id`='12'); " +
                "UPDATE `test`.`test_user` SET `id`='13', `uname`='aa', `pwd`='pwd', `test_filed`='1' WHERE (`id`='13'); " +
                "UPDATE `test`.`test_user` SET `id`='14', `uname`='aa', `pwd`='pwd', `test_filed`='1' WHERE (`id`='14'); " +
                "UPDATE `test`.`test_user` SET `id`='15', `uname`='aa', `pwd`='pwd', `test_filed`='1' WHERE (`id`='15'); " +
                "UPDATE `test`.`test_user` SET `id`='16', `uname`='aa', `pwd`='pwd', `test_filed`='1' WHERE (`id`='16');" +
                " DELETE FROM test_user WHERE id = 2;" +
                "UPDATE `test`.`user` SET `id`='4', `name`='Sandy', `age`='21', `email`='test4@baomidou.com', `create_user`=NULL, `create_time`='2019-07-12 15:06:34', `update_user`=111, `update_time`='2019-07-12 15:06:34' WHERE (`id`='4');";
        testUserMapper.batchSql(sql);
    }


}
