package com.atguigu.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:TestUser
 * Package:com.atguigu.spring6.iocxml
 * Description:
 *
 * @Author UESTC-史杰灵
 * @Create 2024/9/28 15:44
 * @Version 1.0
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean.xml");
        //1 根据id获取bean
        User user1 = (User) context.getBean("user");
        System.out.println("1 根据id获取bean" + user1);

        //2 根据类型获取bean
        User user2 = context.getBean(User.class);
        System.out.println("2 根据类型获取bean" + user2);

        //3 根据id和类型获取bean
        User user3 = context.getBean("user", User.class);
        System.out.println("3 根据id和类型获取bean" + user3);
    }
}
