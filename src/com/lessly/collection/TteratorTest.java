package com.lessly.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TteratorTest {

    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("j2ee应用");
        books.add("java讲义");
        books.add("Android讲义");
        Iterator it = books.iterator();
        while (it.hasNext()){
            String book = (String) it.next();
            if("Android讲义".equals(book)){
                books.remove(book);
//                it.remove();
            }
            book = "测试字符串";
        }

        System.out.println(books);
    }
}
