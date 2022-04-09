package com.phoenix;

/* в объектно-ориентированном программировании: абстракция – это процесс
скрытия деталей реализации от пользователя, предоставляя ему только
функционал. Иными словами, пользователь будет владеть информацией о том, что
объект делает, а не как он это делает
 */

public class Main {

    public static void main(String[] args) {
        SportCar car = new SportCar("BMW", "X6 M", "Blue");
        System.out.println("Завершение работы...");
    }
}