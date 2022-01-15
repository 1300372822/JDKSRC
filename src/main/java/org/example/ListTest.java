package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        Iterator iterator = list.iterator();
//        list.remove(-1);
//        while (iterator.hasNext()){
//         String s = (String) iterator.next();
//         //迭代时不能删除或者新增元素 ConcurrentModificationException
//         list.add("aaa");
//            System.out.println(s);
//        }

        for (int i = 0; i < list.size(); i++) {
            list.add("aaa");
            System.out.println(list.get(i));
        }
    }
}
