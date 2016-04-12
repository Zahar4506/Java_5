package com.company;

import java.io.*;

//Тестовый файл
public class Test {


    public static void main(String[] args) throws IOException {

        System.out.println("Введие координаты центра окржности и его радиус");
        Circle c1 = new Circle();
        System.out.println("Введие координаты центра окржности и его радиус");
        Circle c2 = new Circle();

        c1.dlinCirkle(c1.r);
        c1.centrCirlce(c1.x, c1.y);
        System.out.println("Расстояние между центрами окружностей = " + Circle.rasstoyznieCircle(c1, c2));
        Circle.kasanie(c1,c2);

    }
}
