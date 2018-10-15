/************************************************************************
 * Project Type : Java Console Application                              *
 * Project Name : KR_Patterns                                           *
 * File Name    : Main.java                                             *
 * Language     : Java                                                  *
 * Programmer   : Максимов Н.Д                                          *
 * Created      : 23/05/18                                              *
 * Last Revision: 23/05/18                                              *
 * Comment      : Паттерны ООП : Адаптер                                *
 *                Главный класс                                         *
 ***********************************************************************/

package ru.hldn.kr_patterns;

import ru.hldn.kr_patterns.data.ElementFromCarAdapter;
import ru.hldn.kr_patterns.data.ElementFromPersonAdapter;
import ru.hldn.kr_patterns.gui.ApplicationMainWindow;
import ru.hldn.kr_patterns.subjects.Person;

public class Main {

    /**
     * Точка входа в приложение
     */
    public static void main(String[] args) {
        //Создаем окно
        ApplicationMainWindow mainWindow = new ApplicationMainWindow();
        //Запускаем в параллельном потоке
        mainWindow.run();
        
        //Добавляем элементы определенные через наследование
        mainWindow.addData(new ElementFromCarAdapter(2.4f, 95, "ГАЗ-24 \"Волга\""));
        mainWindow.addData(new ElementFromCarAdapter(2.9f, 20, "Ford Model T"));
        
        //Добавляем элементы определенные через композицию
        mainWindow.addData(new ElementFromPersonAdapter(new Person("Иван", 3, 10)));
        mainWindow.addData(new ElementFromPersonAdapter(new Person("Евгений", 70, -5)));
    }//main()
    
}//class Main

/******************** End Of Main.java File ********************/