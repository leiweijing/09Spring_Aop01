package cn.louie.test;

import cn.louie.service.UserSerivce;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserSerivce userService = (UserSerivce)ac.getBean("userService");
        userService.search();
    }
}
