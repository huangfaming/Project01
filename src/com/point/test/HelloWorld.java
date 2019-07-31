package com.point.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
    public HelloWorld() {
    }

    public static final String  COUNT_SIZE="test";
    public static void main(String[] args) {
        //region 查询数据库获取成员列表
        System.out.println("hello world");
        ArrayList arrayList = getArrayList();
        //endregion
        Map map = new HashMap();
        System.out.println(arrayList);
    }

    public String getList() {

        ArrayList list = getArrayList();
        Map map = new HashMap();
        System.out.println(list);

        try {
            FileInputStream fis=new FileInputStream("D:\\text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }

    private static ArrayList getArrayList() {
        ArrayList list = new ArrayList();
        list.add(0, 123);
        list.add(1, 456);
        return list;
    }
}
