package com.goodsave.basic.abstracta;

import org.junit.Test;

/**
 * AbstractA
 * <p>
 * 抽象类是用来捕捉子类的通用特性的 。它不能被实例化，只能被用作子类的超类。抽象类是被用来创建继承层级里子类的模板
 * 什么时候使用抽象类<p>
 * 如果你拥有一些方法并且想让它们中的一些有默认实现，那么使用抽象类吧。
 * 如果你想实现多重继承，那么你必须使用接口。由于Java不支持多继承，子类不能够继承多个类，但可以实现多个接口。因此你就可以使用接口来解决它。
 * 如果基本功能在不断改变，那么就需要使用抽象类。如果不断改变基本功能并且使用接口，那么就需要改变所有实现了该接口的类。
 * Created by Joker on 2017/8/23.
 */
public class AbstractA {

    private abstract class Person {
        abstract Person sayWhat();

        abstract Person doWhat();
    }

    private class Teacher extends Person {
        @Override
        Person sayWhat() {
            System.out.println("I'm a teacher");
            return this;
        }

        @Override
        Person doWhat() {
            System.out.println("I'm teaching");
            return this;
        }
    }

    private class Student extends Person {
        @Override
        Person sayWhat() {
            System.out.println("I'm a student");
            return this;
        }

        @Override
        Person doWhat() {
            System.out.println("I'm studying");
            return this;
        }
    }

    @Test
    public void test() {
        Person teacher = new Teacher();
        teacher.sayWhat().doWhat();
        Person student = new Student();
        student.sayWhat().doWhat();
    }


}
