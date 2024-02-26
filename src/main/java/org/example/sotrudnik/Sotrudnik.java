package org.example.sotrudnik;
/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
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

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Sotrudnik {
    private static int id = 1;
    private int tabel = 0;
    private final String number;
    private final String name;
    private final int experience;

    public Sotrudnik(String number, String name, int experience) {
        tabel = id++;
        this.number = number;
        this.name = name;
        this.experience = experience;
    }
}
