package com.company;

import java.io.*;

/**
 * 1. Создайте в классе Circle метод, вычисляющий длину окружности.
 * <p>
 * 2. Создайте в классе Circle метод, перемещающий центр круга в случайную
 * точку квадрата координатной плоскости с диагональю от [-99;-99] до [99;99].
 * Обратите внимание на то, что требуется создать обычный метод, применимый
 * к уже существующему объекту, а не конструктор создающий новый объект.
 * <p>
 * 3. Измените в классе Circle конструктор по умолчанию так, чтобы в момент
 * создания объекта с его помощью, координаты центра и радиус окружности
 * пользователь вводил с клавиатуры.
 * <p>
 * 4. Создайте в классе Circle метод, вычисляющий расстояние между центрами
 * двух окружностей.
 * <p>
 * 5. Создайте в классе Circle метод, проверяющий, касаются ли окружности
 * в одной точке. Учтите, что возможен вариант, когда одна окружность
 * содержится внутри другой и при этом всё равно возможно касание в одной точке.
 */
public class Circle {

    static double vvod() {

        double vhodnoeChislo = 0;
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String vhod_str = null; //читаем строку с клавиатуры
        try {
            vhod_str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            vhodnoeChislo = Integer.parseInt(vhod_str);
        } catch (Exception e) {
            System.out.println("Ошибка ввода координаты ");

        }
        return vhodnoeChislo;
    }

    public double x = Circle.vvod(); //Центр окр х
    public double y = Circle.vvod(); //Центр окр y
    public double r = Circle.vvod(); //Радиус окр

    //Методо отображающий длину окружности
    public void dlinCirkle(double r) {
        System.out.println("Длина окружности =" + (6.28 * r));
    }

    //Метод переноса центра окружности
    public void centrCirlce(double x, double y) {
        x = Math.random() * (199) - 99;
        y = Math.random() * (199) - 99;
        System.out.println("Координата х =" + x + " Корордината y =" + y);
    }

    public static double rasstoyznieCircle(Circle c1, Circle c2) {
        return (Math.sqrt(Math.pow(c2.x - c1.x, 2) + Math.pow(c2.y - c1.y, 2)));
    }

    public static void kasanie(Circle o1, Circle o2) {
        if ((o1.r + o2.r) == rasstoyznieCircle(o1, o2))
            System.out.println("Внешнее касание двух окружностей");
        if ((o1.r - o2.r) == rasstoyznieCircle(o1, o2))
            System.out.println("Внутреннее касание двух окружностей");
        else
            System.out.println("Нет касания");
    }
}