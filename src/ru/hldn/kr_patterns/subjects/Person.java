/************************************************************************
 * Project Type : Java Console Application                              *
 * Project Name : KR_Patterns                                           *
 * File Name    : Person.java                                           *
 * Language     : Java                                                  *
 * Programmer   : Максимов Н.Д                                          *
 * Created      : 23/05/18                                              *
 * Last Revision: 23/05/18                                              *
 * Comment      : Паттерны ООП : Адаптер                                *
 *                Класс, описывающий человека                           *
 ***********************************************************************/

package ru.hldn.kr_patterns.subjects;

/*
Класс, описывающий человека
*/
public class Person {
    
    //Поля класса
    String name;
    int age;
    int karma;
    
    //Конструктор по умолчанию
    public Person(){
        name = "Аноним";
        age = 0;
        karma = 0;
    }//Person()
    
    //Консткрутор класса
    public Person(String nm, int ag, int km){
        name = nm;
        age = ag;
        karma = km;
    }//Person(String nm, int ag, int km)
    
    //Метод, возвращающий имя
    public String getPersonName() {
        return name;
    }//getPersonName()

    //Метод, возвращающий возраст
    public int getAge() {
        return age;
    }//getAge()

    //Метод, возвращающий количество кармы
    public int getKarma() {
        return karma;
    }//getKarma()
    
    //Есть
    public void eat(){
        System.out.println("Я ем");
    }//eat()
    
    //Спать
    public void sleep(){
        System.out.println("Не мешайте, я сплю");
    }//sleep()
    
    //Сказать имя
    public void sayName(){
        System.out.println("Меня зовут" + name);
    }//sayName()
    
}//class Person

/******************** End Of Person.java File ********************/
