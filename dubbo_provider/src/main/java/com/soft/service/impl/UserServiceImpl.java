package com.soft.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.soft.service.UserService;

/**
 * Created by Administrator on 2020/9/15 0015.
 */
@Service
public class UserServiceImpl implements UserService {
    public void sysHello(String msg) {
        System.out.println("hello" + msg);
    }
}
