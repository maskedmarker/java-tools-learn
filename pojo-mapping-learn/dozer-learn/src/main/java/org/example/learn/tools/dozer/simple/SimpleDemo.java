package org.example.learn.tools.dozer.simple;

import org.dozer.DozerBeanMapper;

public class SimpleDemo {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.setAddress("India");
        classA.setName("Sajal");
        classA.setAge("50");

        ClassB classB = new DozerBeanMapper().map(classA, ClassB.class);
        System.out.println(classB);
    }
}
