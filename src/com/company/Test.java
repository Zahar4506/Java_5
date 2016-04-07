package com.company;

import java.io.*;

//Тестовый файл
public class Test {

    public static void main(String[] args) throws IOException {
        System.out.println("Введие координаты центра окржности и его радиус");

        int x = 0, y = 0, r = 0;
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String x_str = bufferedReader.readLine(); //читаем строку с клавиатуры
        String y_str = bufferedReader.readLine();
        String r_str = bufferedReader.readLine();

        try {
            x = Integer.parseInt(x_str);
        } catch (Exception e) {
            System.out.println("Ошибка ввода координаты x");
        }
        try {
            y = Integer.parseInt(y_str);
        } catch (Exception e) {
            System.out.println("Ошибка ввода координаты y");
        }
        try {
            r = Integer.parseInt(r_str);
        } catch (Exception e) {
            System.out.println("Ошибка ввода координаты y");
        }

        Circle c1 = new Circle();
        c1.x=x;
        c1.y=y;
        c1.r=r;
        c1.dlinCirkle(r);
    }
}
