package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.println("这是第一个测试用例");
        System.out.printf("ThreaID: %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.println("这是第二个测试用例");
        System.out.printf("ThreaID: %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.println("这是第三个测试用例");
        System.out.printf("ThreaID: %s%n",Thread.currentThread().getId());
    }
}
