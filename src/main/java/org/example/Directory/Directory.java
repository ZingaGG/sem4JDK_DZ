package org.example.Directory;

import lombok.ToString;
import org.example.sotrudnik.Sotrudnik;

import java.util.ArrayList;
import java.util.List;

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
@ToString
public class Directory{
    private List<Sotrudnik> sotrudniks;
    public Directory(ArrayList<Sotrudnik> sotrudniks){
        this.sotrudniks = sotrudniks;
    }

    public List<Sotrudnik> findByExperience(int exp) {
        return sotrudniks.stream().filter(e -> e.getExperience() == exp).toList();
    }

    public Sotrudnik findByTabel(int tabel) {
        return sotrudniks.stream().filter(e -> e.getTabel() == tabel).findFirst().orElse(null);
    }

    public List<String> findPhone(String name) {
        return sotrudniks.stream().filter(e -> e.getName().equals(name)).map(Sotrudnik::getNumber).toList();
    }

    public void addSotrudnik(Sotrudnik sotrudnik) {
        sotrudniks.add(sotrudnik);
    }
}
