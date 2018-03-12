package com.goodsave.basic.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamB {

    public static void main(String[] args) {
        List<Persion> persions = new ArrayList<Persion>();

        for (int i = 0; i < 20; i++) {
            persions.add(new Persion(i + "th name", i));
        }

        List<Persion> filteredPersions = persions.stream().peek(persion -> {
            persion.setName(persion.name + " ----> ");
            persion.setAge(persion.getAge() + 10);
        }).filter(persion -> persion.age != 29).sorted((persionA, persionB) -> persionB.getAge() - persionA.getAge()).collect(Collectors.toList());

        filteredPersions.forEach(persion -> {
            persion.setName(persion.name + " ----> ");
            System.out.println(persion.getName());
        });

        filteredPersions.forEach(System.out::println);

    }

    private static class Persion {
        String name;
        int age;

        public Persion(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Name=" + this.getName() + " Age=" + this.getAge();
        }

    }

}

