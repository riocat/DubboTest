package com.yang.dubboProvider.test;

import com.yang.service.DemoService1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by ASUS on 2016/12/8.
 */
public class Domain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("spring_core.xml");
        cxt.start();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
