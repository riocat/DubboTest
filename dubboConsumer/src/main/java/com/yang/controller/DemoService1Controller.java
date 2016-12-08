package com.yang.controller;

import com.yang.service.DemoService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2016/12/7.
 */
public class DemoService1Controller extends HttpServlet {

//    Servlet受web.xml托管无法直接使用spring注入
//    @Autowired
//    private DemoService1 demoService1;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(req.getSession().getServletContext());
        DemoService1 demoService1 = (DemoService1) ctx.getBean("DemoService1");
        req.setAttribute("name", demoService1.sayHello(""));
        req.getRequestDispatcher("show.jsp").forward(req, resp);
    }
}
