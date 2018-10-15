/************************************************************************
 * Project Type : Java Console Application                              *
 * Project Name : KR_Patterns                                           *
 * File Name    : ElementFromPersonAdapter.java                         *
 * Language     : Java                                                  *
 * Programmer   : Максимов Н.Д                                          *
 * Created      : 23/05/18                                              *
 * Last Revision: 23/05/18                                              *
 * Comment      : Паттерны ООП : Адаптер                                *
 *                Адаптер для класса Person                             *
 ***********************************************************************/

package ru.hldn.kr_patterns.data;

import ru.hldn.kr_patterns.subjects.Person;

/*
Адаптер для класса Person
Выполнен методом композиции, поэтому реализуем интерфейс Element
*/
public class ElementFromPersonAdapter implements Element{
    
    //Поле содержит экземпляр класса Person
    Person person;

    //Конструктор класса
    public ElementFromPersonAdapter(Person p) {
        person = p;
    }//ElementFromPersonAdapter(Person p)

    //Определяем методы интерфейса Element
    
    @Override
    public String getName() {
        return person.getPersonName();
    }//getName()

    @Override
    public String getDescription() {
        return "Возраст: " + person.getAge() + "; Карма: " + person.getKarma();
    }//getDescription()
    
}//ElementFromPersonAdapter

/******************** End Of ElementFromPersonAdapter.java File ********************/
