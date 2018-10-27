package com.cobertura.unit;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        //{
        //    System.out.println( "Hello World!" );
        //}
        //создаем новый объект
        LocalTime currentTime = new LocalTime();
        //выводим текущее время - опираясь на класс org.joda.time.LocalTime, где метод currentTime тянет информацию ПК по времени
        System.out.println("The current local time is: " + currentTime);

        //обращаемся к классу Greeter, где описан метод sayHello(), который возвращает значение "Hello world!"
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        Greeter constructor_Undefined = new Greeter();
        System.out.println(constructor_Undefined.name);
        Greeter constructor_HelloWorld = new Greeter("Привет мир");
        System.out.println(constructor_HelloWorld.name);


        Operation o1 = new Addition(); //Создание данного объекта представляется как экземпляр (отдельный объект из ряда подобных) класса
        Operation o5 = new Addition(); //второй экземпляр класса сложения
        Operation o2 = new Subtraction();
        Operation o3 = new Multiplication();
        Operation o4 = new Division();
        System.out.println(o1.calculate(2, 3));
        System.out.println(o2.calculate(7, 8));
        System.out.println(o3.calculate(4, 2));
        System.out.println(o4.calculate(8,16));
        System.out.println(o5.calculate(-8,16));
    }
}

