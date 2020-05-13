package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,Integer age,String sex){
        System.out.println("name ="+name+"; age ="+age+"; sex ="+sex);
    }
    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",20,"female"},
                {"lisi",10,"male"},
                {"wangwu",30,"male"}
        };
        return o;
    }
}
