package com.atguigu.spring6.resourceloader;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * ClassName:ResourceloaderDemo
 * Package:com.atguigu.spring6.resourceloader
 * Description:
 *
 * @Author UESTC-史杰灵
 * @Create 2024/10/7 23:04
 * @Version 1.0
 */
public class ResourceloaderDemo {
    @Test
    public void demo1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        Resource resource = context.getResource("atguigu.txt");
        System.out.println(resource.getFilename());
    }
}
