package com.nihui.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @Classname SpringTest
 * @Description TODO
 * @Date 2019/12/31 2:14 PM
 * @Created by nihui
 */
@Service
public class SpringTest {

    @Test
    public void test(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringTest springTest = (SpringTest) applicationContext.getBean("springTest");
        springTest.sayHello();
    }

    public void sayHello(){
        System.out.println("Hello World!");
    }
}
