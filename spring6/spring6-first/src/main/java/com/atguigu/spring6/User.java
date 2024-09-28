package com.atguigu.spring6;

/**
 * ClassName:User
 * Package:com.atguigu.spring6
 * Description:
 *
 * @Author UESTC-史杰灵
 * @Create 2024/9/28 15:07
 * @Version 1.0
 */
public class User {
    public void add(){
        System.out.println("add......");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}
