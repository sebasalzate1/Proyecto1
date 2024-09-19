package com.example.Proyect1;

import java.util.Queue;
import java.util.LinkedList;

public class Queuee {

    private Queue category1;
    private Queue category2;
    private Queue category3;
    private Queue category4;
    private Queue category5;

    public Queuee() {
        category1 = new LinkedList<Article>();
        category2 = new LinkedList<Article>();
        category3 = new LinkedList<Article>();
        category4 = new LinkedList<Article>();
        category5 = new LinkedList<Article>();
    }

    public void fillQueues() {
        Generator gen = new Generator();
        Article[] list = gen.fill();
        for (int i = 0; i < 1000000; i++) {
            switch (list[i].getCategory()) {
                case "Shampoo" ->
                    category1.add(list[i]);
                case "Cera" ->
                    category2.add(list[i]);
                case "Crema" ->
                    category3.add(list[i]);
                case "Plancha" ->
                    category4.add(list[i]);
                default ->
                    category5.add(list[i]);
            }
        }
        list = new Article[0];
    }

    public Queue getCategory1() {
        return category1;
    }

    public Queue getCategory2() {
        return category2;
    }

    public Queue getCategory3() {
        return category3;
    }

    public Queue getCategory4() {
        return category4;
    }

    public Queue getCategory5() {
        return category5;
    }

}
