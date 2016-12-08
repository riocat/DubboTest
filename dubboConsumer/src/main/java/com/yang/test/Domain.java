package com.yang.test;

import com.yang.service.DemoService1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ASUS on 2016/12/8.
 */
public class Domain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("spring_core.xml");
        cxt.start();
        DemoService1 demoService1 = (DemoService1)  cxt.getBean("DemoService1");
        System.out.println(demoService1.sayHello(""));
    }
}
