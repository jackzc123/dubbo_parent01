package com.soft.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2020/9/15 0015.
 */
public class UserServiceBoot {
    public static void main(String[] args) throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:dubbo_provider.xml");
        System.in.read();
    }
}
