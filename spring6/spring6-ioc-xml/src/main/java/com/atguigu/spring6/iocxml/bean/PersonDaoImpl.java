package com.atguigu.spring6.iocxml.bean;

/**
 * ClassName:PersonDaoImpl
 * Package:com.atguigu.spring6.iocxml.bean
 * Description:
 *
 * @Author UESTC-史杰灵
 * @Create 2024/9/28 16:02
 * @Version 1.0
 */
public class PersonDaoImpl implements UserDao{
    @Override
    public void run() {
        System.out.println("PersonDao...");
    }
}
