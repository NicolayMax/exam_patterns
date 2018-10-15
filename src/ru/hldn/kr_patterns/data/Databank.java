/************************************************************************
 * Project Type : Java Console Application                              *
 * Project Name : KR_Patterns                                           *
 * File Name    : Databank.java                                         *
 * Language     : Java                                                  *
 * Programmer   : Максимов Н.Д                                          *
 * Created      : 23/05/18                                              *
 * Last Revision: 23/05/18                                              *
 * Comment      : Паттерны ООП : Адаптер                                *
 *                Класс, содержащий методы для работы с таблицей        *
 ***********************************************************************/

package ru.hldn.kr_patterns.data;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

/*
Класс, содержащий модель таблицы и методы для работы с ней
*/
public class Databank {
    
    DefaultTableModel model;//Модель таблицы
    
    //Конструктор по умолчанию
    public Databank() {
        //Создаем модель и добавляем колонки
        model = new DefaultTableModel();
        model.addColumn("Название");
        model.addColumn("Описание");
    }//Databank()
    
    //Метод для добавления элементов
    public void addElement(Element el) {
        //Считываем данные и добавляем в модель
        String[] newElement = {el.getName(), el.getDescription()};
        model.addRow(newElement);
    }//addElement(Element el)
    
    //Метод, возвращающий модель
    public DefaultTableModel getModel() {
        return model;
    }//getModel()
            
}//class Databank

/******************** End Of Databank.java File ********************/