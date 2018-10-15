/************************************************************************
 * Project Type : Java Console Application                              *
 * Project Name : KR_Patterns                                           *
 * File Name    : ElementFromCarAdapter.java                            *
 * Language     : Java                                                  *
 * Programmer   : Максимов Н.Д                                          *
 * Created      : 23/05/18                                              *
 * Last Revision: 23/05/18                                              *
 * Comment      : Паттерны ООП : Адаптер                                *
 *                Адаптер для класса Car                                *
 ***********************************************************************/

package ru.hldn.kr_patterns.data;

import ru.hldn.kr_patterns.subjects.Car;

/*
Адаптер для класса Car
Выполнен методом наследования, поэтому наследуем Car и реализуем интерфейс Element
*/
public class ElementFromCarAdapter extends Car implements Element {

    //Необходимо определить конструкторы как у родительского класса
    
    public ElementFromCarAdapter() {
        super();
    }//ElementFromCarAdapter()
    
    public ElementFromCarAdapter(float engVol, int hp, String nm) {
        super(engVol, hp, nm);
    }//ElementFromCarAdapter(float engVol, int hp, String nm)
    
    //Реализуем методы интерфейса Element
    
    @Override
    public String getName() {
        return getCarName();
    }//getName()

    @Override
    public String getDescription() {
        return "Объем двигателя: " + getEV() + "; Мощность:" + getHP() + " л.с.";
    }//getDescription()
    
}//class ElementFromCarAdapter

/******************** End Of ElementFromCarAdapter.java File ********************/