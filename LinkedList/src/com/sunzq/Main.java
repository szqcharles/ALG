package com.sunzq;

import com.sunzq.circle.CircleLinkedList;

public class Main {
    public static void main(String[] args) {
        josephus();
//        com.sunzq.List<Integer> list = new SingleCircleLinkedList<>();
//        list.add(11);
//        list.add(22);
//        list.add(33);
//        list.add(44);
//
//        System.out.println(list);
//        list.add(0, 55);
//
//        System.out.println(list);
//        list.add(2, 66);
//
//        System.out.println(list);
//        list.remove(0);
//
//        System.out.println(list);
//        list.remove(2);
//
//        System.out.println(list);
//        list.remove(list.size() - 1);
//
//        System.out.println(list);
//
//
//        list.remove(1);
//        System.out.println(list);
    }


    static void josephus() {
        CircleLinkedList<Integer> list = new CircleLinkedList<>();
        for (int i = 1; i <= 8; i++) {
            list.add(i);
        }

        list.reset();

        while (!list.isEmpty()) {

            list.next();
            list.next();
            System.out.println(list.remove());
        }

        System.out.println(list);
    }
}