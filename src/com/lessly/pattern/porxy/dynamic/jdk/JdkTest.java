package com.lessly.pattern.porxy.dynamic.jdk;

import com.lessly.pattern.porxy.staticed.Person;
import com.lessly.pattern.porxy.staticed.XiaoMin;

public class JdkTest {

    public static void main(String[] args) {
        try {
            Person target =  (Person) new SelfJDKPorxy().getInstance(new XiaoMin());
            target.findJob();
            target.findLove();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
