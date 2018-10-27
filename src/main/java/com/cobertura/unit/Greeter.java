package com.cobertura.unit;

public class Greeter {
    public String sayHello() {
        //возвращаем фразу
        return "Hello world!";
    }

    //объявление констр
    String name;
    Greeter(){
        name="Undefined";
        //this("Undefined"); - тоже самое, что и сверху
    }

    Greeter(String name){
        //name = n; - тоже самое что и снизу
        this.name=name;
    }
}
