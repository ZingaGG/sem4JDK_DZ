package org.example;

import org.example.Directory.Directory;
import org.example.sotrudnik.Sotrudnik;

import java.util.ArrayList;
/*Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавление нового сотрудника в справочник
*/
public class Main {
    public static void main(String[] args) {
        Sotrudnik sotrudnik1 = new Sotrudnik("12", "Vanya", 1);
        Sotrudnik sotrudnik2 = new Sotrudnik("34", "Ira", 2);
        Sotrudnik sotrudnik3 = new Sotrudnik("56", "Anna", 3);
        Sotrudnik sotrudnik4 = new Sotrudnik("78", "Sveta", 4);
        Sotrudnik sotrudnik5 = new Sotrudnik("89", "Ira", 2);
        Sotrudnik sotrudnik6 = new Sotrudnik("123", "Ksenia", 5);

        ArrayList<Sotrudnik> sotrudniks = new ArrayList<>();
        sotrudniks.add(sotrudnik1);
        sotrudniks.add(sotrudnik2);
        sotrudniks.add(sotrudnik3);
        sotrudniks.add(sotrudnik4);
        sotrudniks.add(sotrudnik5);

        Directory directory = new Directory(sotrudniks);
        // Ищет по стажу
        System.out.println(directory.findByExperience(2));
        // Ищет по имени номера телефонов
        System.out.println(directory.findPhone("Ira"));
        // Ищет по id (Tabel)
        System.out.println(directory.findByTabel(3));
        // Показывает добавление (add)
        directory.addSotrudnik(sotrudnik6);
        System.out.println(directory.findByTabel(6));
    }
}