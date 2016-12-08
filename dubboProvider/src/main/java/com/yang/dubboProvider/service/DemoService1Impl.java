package com.yang.dubboProvider.service;

import com.yang.service.DemoService1;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/12/7.
 */
public class DemoService1Impl implements DemoService1{

    @Override
    public String sayHello(String s) {
        return "Akari";
    }
}
