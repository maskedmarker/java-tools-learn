package org.example.learn.tools.dozer.simple;

import org.dozer.DozerBeanMapper;

import java.util.Map;

public class ToMapDemo {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.setAddress("India");
        classA.setName("Sajal");
        classA.setAge("50");

        Map map = new DozerBeanMapper().map(classA, Map.class);
        System.out.println(map);
    }
}
