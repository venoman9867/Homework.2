package com.company;
/*
Класс Phone.
        а) Создайте класс Phone, который содержит переменные number, model и weight.
        б) Создайте три экземпляра этого класса.
        в) Выведите на консоль значения их переменных.
        г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
        д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
        е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
        ж) Добавить конструктор без параметров.
        з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
        и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
        к) Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
*/
public class Main {
    public static void main(String[] args) {
	Phone Iphone=new Phone(987654321,"Iphone X",3.5);
	Phone Anroid=new Phone(123456789,"Galaxy Note",4.7);
	Phone Xaomi=new Phone(987612345,"Red",2.3);
	System.out.println(Iphone.toString());
	System.out.println(Anroid.toString());
	System.out.println(Xaomi.toString());
	Iphone.receiveCall("Tanya");
	Anroid.receiveCall("Bob");
	Xaomi.receiveCall("Alex");
	System.out.println("Здесь начинается задача под буквой и: ");
	Iphone.receiveCall("Tanya",987654321);
	Anroid.receiveCall("Bob",123456789);
	Xaomi.receiveCall("Tanya",987612345);
	Iphone.sendMessage("Bob",123456789);
    }
}
