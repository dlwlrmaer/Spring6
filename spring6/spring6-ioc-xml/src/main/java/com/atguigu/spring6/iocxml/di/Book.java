package com.atguigu.spring6.iocxml.di;

/**
 * ClassName:Book
 * Package:com.atguigu.spring6.iocxml.di
 * Description:
 *
 * @Author UESTC-史杰灵
 * @Create 2024/9/28 16:07
 * @Version 1.0
 */
public class Book {
    private String bname;
    private String author;

    private String others;
    // 生成set方法


    public Book() {
        System.out.println("无参数构造执行了...");
    }

    public Book(String bname, String author) {
        this.bname = bname;
        this.author = author;
        System.out.println("有参数构造执行了...");
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //set方法注入
        Book book = new Book();
        book.setBname("java");
        book.setAuthor("尚硅谷");

        //通过构造器注入
        Book book2 = new Book("python", "黑马");
    }
}
