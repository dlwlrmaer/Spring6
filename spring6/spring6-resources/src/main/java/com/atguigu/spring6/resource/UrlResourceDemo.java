package com.atguigu.spring6.resource;

import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.net.MalformedURLException;

//演示UrlResource访问网络资源
public class UrlResourceDemo {

    public static void main(String[] args) {
        //loadUrlResource("http://www.baidu.com");

        loadUrlResource("file:atguigu.txt");
    }
    //访问前缀http
    public static void loadUrlResource(String path){
        //创建Resource实现类的对象 UrlResource
        try {
            UrlResource url = new UrlResource(path);

            //获取资源信息
            System.out.println(url.getFilename());
            System.out.println(url.getURL());
            System.out.println(url.getDescription());
            System.out.println(url.getInputStream().read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
