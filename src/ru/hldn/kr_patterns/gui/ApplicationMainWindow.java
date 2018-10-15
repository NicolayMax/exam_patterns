/************************************************************************
 * Project Type : Java Console Application                              *
 * Project Name : KR_Patterns                                           *
 * File Name    : ApplicationMainWindow.java                            *
 * Language     : Java                                                  *
 * Programmer   : Максимов Н.Д                                          *
 * Created      : 23/05/18                                              *
 * Last Revision: 23/05/18                                              *
 * Comment      : Паттерны ООП : Адаптер                                *
 *                Главное окно программы                                *
 ***********************************************************************/

package ru.hldn.kr_patterns.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import ru.hldn.kr_patterns.data.Databank;
import ru.hldn.kr_patterns.data.Element;

/*
Класс, иницилизирующий главное окно программы в параллельном потоке.
Реализуем интерфейс Runnable
*/
public class ApplicationMainWindow implements Runnable{

    //Данные таблицы
    Databank tableData;
    
    //Элементы интерфейса
    JFrame mainFrame;
    JPanel mainPanel;
    JButton exitButton;
    JTable dataTable;
    JScrollPane scrollPane;
    
    //Конструктор
    public ApplicationMainWindow() {   
        //Создаем окно
        mainFrame = new JFrame("Таблицы");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.getContentPane().setLayout(new FlowLayout());
        
        //Создаем панель
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        //Создаем таблицу и связываем с графическим интерфейсом
        tableData = new Databank();
        dataTable = new JTable(tableData.getModel());
        scrollPane = new JScrollPane(dataTable);
        dataTable.setPreferredScrollableViewportSize(new Dimension(500, 200));
        
        //Создаем кнопку выхода из приложения
        exitButton = new JButton("Закрыть");
        exitButton.addActionListener(new ActionListener()
            {
                //Выход из приложения
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }//actionPerformed(ActionEvent e)
                
            });
        
        //Добавляем все элементы на окно
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(exitButton, BorderLayout.SOUTH);
        mainFrame.add(mainPanel);
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
    }//ApplicationMainWindow()
    
    //Добавление данных в таблицу
    public void addData(Element el) {
        tableData.addElement(el);
    }//addData(Element el)
    
    //Определяем метод запуска потока
    @Override
    public void run() {
        //Показываем окно
        mainFrame.setVisible(true);
    }//run()
    
}//class ApplicationMainWindow

/******************** End Of ApplicationMainWindow.java File ********************/