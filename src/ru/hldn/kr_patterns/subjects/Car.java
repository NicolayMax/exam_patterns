/************************************************************************
 * Project Type : Java Console Application                              *
 * Project Name : KR_Patterns                                           *
 * File Name    : Car.java                                              *
 * Language     : Java                                                  *
 * Programmer   : Максимов Н.Д                                          *
 * Created      : 23/05/18                                              *
 * Last Revision: 23/05/18                                              *
 * Comment      : Паттерны ООП : Адаптер                                *
 *                Класс, описывающий автомобиль                         *
 ***********************************************************************/

package ru.hldn.kr_patterns.subjects;

/*
Класс, описывающий характеристики автомобиля
*/
public class Car {
    
    //Поля класса
    float engineVolume;
    int horsePow;
    String name;
    
    //Конструктор по умолчанию
    public Car() {
        engineVolume = 0;
        horsePow = 0;
        name = "Неизвестно";
    }//Car()
    
    //Конктруктор класса
    public Car(float engVol, int hp, String nm) {
        engineVolume = engVol;
        horsePow = hp;
        name = nm;
    }//Car(float engVol, int hp, String nm)
    
    //Метод, возвращающий название авто
    public String getCarName() {
        return name;
    }//getCarName()
    
    //Метод, возвращающий мощность двигателя
    public int getHP() {
        return horsePow;
    }//getHP()
    
    //Метод, возвращающий объем двигателя
    public float getEV() {
        return engineVolume;
    }//getEV()
    
    //Ехать
    public void drive() {
        System.out.println("Я еду");
    }//drive()
    
    //Разбится
    public void crash() {
        System.out.println("Я разбилась");
    }//crash()
    
    //Сигналить
    public void beep() {
        System.out.println("Я снигналю");
    }//beep()
    
}//class Car

/******************** End Of Car.java File ********************/