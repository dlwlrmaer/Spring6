package com.atguigu.spring6.iocxml.bean;

/**
 * ClassName:UserDapImpl
 * Package:com.atguigu.spring6.iocxml.bean
 * Description:
 *
 * @Author UESTC-史杰灵
 * @Create 2024/9/28 15:55
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("UserDao...");
    }
}
