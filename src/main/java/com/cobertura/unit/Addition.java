package com.cobertura.unit;

//Класс "сложение". Класс это описание объекта
//в каждом классе присутствуют поля - переменные и методы - описание над данными переменными. а = 3 б = 5 поля, метод - сложение
public class Addition extends Operation {
    public int calculate(int a, int b) {
        return a+b;
    }
}
