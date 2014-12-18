package com.huangjie.dubbo_Service.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProviderMain {  
    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        		new String[]{"applicationProvider.xml"}); 
        System.out.println("Get started.");
        
        
        context.start();
        
        System.out.println("Press any key to exit.");  
        System.in.read();  
    }  
}  