/************************************************************************
 * Project Type : Java Console Application                              *
 * Project Name : KR_Patterns                                           *
 * File Name    : Element.java                                          *
 * Language     : Java                                                  *
 * Programmer   : Максимов Н.Д                                          *
 * Created      : 23/05/18                                              *
 * Last Revision: 23/05/18                                              *
 * Comment      : Паттерны ООП : Адаптер                                *
 *                Интерфейс, описывающий элемент таблицы                *
 ***********************************************************************/

package ru.hldn.kr_patterns.data;

/*
Интерфейс, описывающий элемент таблицы
*/
public interface Element {
    
    //Геттеры для названия и описания
    public String getName();
    public String getDescription();
    
}//class Element

/******************** End Of Element.java File ********************/
