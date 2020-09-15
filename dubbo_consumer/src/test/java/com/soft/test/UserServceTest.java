package com.soft.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.soft.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2020/9/15 0015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dubbo_consumer.xml")
public class UserServceTest {

    @Reference
    private UserService userService;

    @Test
    public void test1(){
        userService.sysHello("张三");
    }

}
