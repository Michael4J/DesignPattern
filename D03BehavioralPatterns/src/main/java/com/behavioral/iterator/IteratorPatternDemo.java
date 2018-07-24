package com.behavioral.iterator;

/**
 * 迭代器模式
 * @Title: IteratorPatternDemo
 * @Auther: MichaelJ
 * @Date: 2018-7-23
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        namesRepository.setNames(new String[] {"Robert", "John", "Julie"});

        Iterator it = namesRepository.iterator();
        while(it.hasNext()){
            String name = (String)it.next();
            System.out.println("Name : " + name);
        }

    }
}
