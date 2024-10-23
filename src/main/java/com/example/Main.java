package com.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.zip.CheckedInputStream;


public class Main {
    public static void main(String[] args) throws IOException {

        /* 1. Добавление контактов:
              - Приложение позволяет пользователю добавлять новые контакты.
              - Для каждого контакта имеется возможность сохранять следующую информацию:
                - Имя
                - Фамилия
                - Номер пропуска (Уникальное поле, String, длина поля 8 символов, разрешенные символы: 0-9A-F. Пример строки: "00F1C313") */

        /* Номер пропуска для нового Контакта генерируется автоматически, его надо добавить в Конструктор */
//        PassNumberGenerator passNum = new PassNumberGenerator();
//        System.out.println(passNum.setPassNumber().replace(",", "").replace(" ", ""));

        /* Создаём новые Контакты */
        LinkedHashMap<String, Contacts> map = new LinkedHashMap<>();
        Contacts cont1 = new Contacts("Ivan", "Petrov", "8A804730");           /* При попытке ввести некорректный Номер пропуска появляется предупреждение об ошибке (Exception) */
        Contacts cont2 = new Contacts("Oleg", "Ivanov", "32595A35");
        Contacts cont3 = new Contacts("Sergey", "Sidorov", "A328290C");


        /* Добавляем Контакты в список */
        map.put(cont1.getPassNumber(), cont1);
        map.put(cont2.getPassNumber(), cont2);
        map.put(cont3.getPassNumber(), cont3);



        /* 2. Просмотр контактов:
              - Отобразить список всех добавленных контактов с их информацией. */
//        System.out.println("Cписок контактов: ");
//        map.forEach((k, v) -> System.out.println(v));


        /*    - Отобразить только номера пропусков */
//        map.forEach((k, v) -> System.out.println("Номер пропуска: " + k));


        /* 3. Поиск контактов:
              - Реализована возможность поиска контактов по номеру пропуска. */
//        System.out.println(map.get("8A804730"));


        /* 4. Удаление контактов:
              - Предоставлена возможность удаления контакта по его уникальному идентификатору. */
//        System.out.println(map.remove("8A804730"));
//        System.out.println("Cписок контактов после удаления: ");
//        map.forEach((k, v) -> System.out.println(v));


        /* 6. Сохранение данных:
              - Реализовано Сохранение данных контактов в файл и (чтение сохранённых данных из файла). */

        Book book = new Book();
//        book.fileWrite(map);                /* записывает данные в файл */
//        book.fileRead();                    /* читает данные из файла */
    }
}
