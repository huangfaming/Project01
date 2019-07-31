package com.point.test;


import com.atpoint.java.Customer;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author hfm
 * @create 2019-07-30 上午 9:10
 * 1.IEDA中代码模板所处的位置:settings-editor-live templates/postfix completion
 * 2.常用的模板
 *
 */
public class TemplatesTest {


    //模板六:prsf:可生成 private static final
    private static final Customer CUST=new Customer();
    //变形:psf
    public static final int NUM =1;
    //变形:psfi
    public static final int AGE=20;
    //变形:psfs
    public static final String NAME="zhangsan";



    //模板一:psvm
    public static void main(String[] args) {
        //模板二: sout
        System.out.println("刘晓喜.....");
        //变形:soutp/soutm/soutv/xxxxx.sout
        method1("张飞",32,"zhangfei", new Date(2019, 9, 12));

        System.out.println("----------------------------------");
        //模板三:fori
        String [] arr=new String[]{"Tom","Jerry","HanMeimei","Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("----------------------------------");
        //变形:iter
        for (String s : arr) {
            System.out.println(s);
        }

        System.out.println("----------------------------------");
        //变形:itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        System.out.println("----------------------------------");
        //模板四:list.for
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(123345);
        arrayList.add(555);
        arrayList.add(6666);
        for (Object o : arrayList) {
            System.out.println(o);
        }

        System.out.println("----------------------------------");
        //变形:list.fori
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("arrayList.get(i) = " + arrayList.get(i));
        }

        System.out.println("----------------------------------");
        //变形:list.forr
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println("arrayList.get(i) = " + arrayList.get(i));
        }
        System.out.println("----------------------------------");
        //模板五:ifn
        if (arrayList == null) {

        }
        //变形:inn
        if (arrayList != null) {

        }
        //变形:xxxx.nn/xxxx.null
        if (arrayList != null) {
        }
        if (arrayList == null) {

        }

        System.out.println("----------------------------------");
        CUST.setAge(54);
        System.out.println(CUST.getAge());


    }

    public static void method1(String name, int age, Object obj, Date dtime){
        System.out.println("name = [" + name + "], age = [" + age + "], obj = [" + obj + "], dtime = [" + dtime + "]");
        String name1="张三";
        name=name1;
        int age1=24;
        age=age1;
        Object obj1=new Object();
        obj1=obj;
        Date dtime1=new Date();
        dtime=dtime1;
        System.out.println("TemplatesTest.method1");
        System.out.println("dtime1 = " + dtime1);


    }
}
