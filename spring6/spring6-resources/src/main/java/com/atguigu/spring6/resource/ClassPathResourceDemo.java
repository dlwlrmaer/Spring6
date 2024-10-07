package com.atguigu.spring6.resource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * ClassName:ClassPathResourceDemo
 * Package:com.atguigu.spring6.resource
 * Description:
 *
 * @Author UESTC-史杰灵
 * @Create 2024/10/7 19:18
 * @Version 1.0
 */
public class ClassPathResourceDemo {
    public static void main(String[] args) {
        loadClassPathResources("atguigu.txt");
    }

    public static void loadClassPathResources(String path){
        ClassPathResource resource = new ClassPathResource(path);

        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());

        try {
            InputStream in = resource.getInputStream();
            byte[] b = new byte[1024];
            while (in.read(b) != -1){
                System.out.println(new String(b));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
