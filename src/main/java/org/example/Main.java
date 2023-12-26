package org.example;

public class Main {
    public static void main(String[] args) {

        // 1. Что такое SQLite?
        // 2. Напишите запрос для отображения имен(first_name, last_name), используя псевдонимы «Имя»,«Фамилия».(Пример таблицы см.таблица1)
        // 3. Напишите запрос и получите все имена из таблицы сотрудников в верхнем регистре (Пример таблицы см.таблица1)
        // 4. Напишите запрос и получите все id сотрудников (Пример таблицы см.таблица1)
        // 5. Напишите запрос, чтобы получить первые 3 символа имени из таблицы сотрудников (Пример таблицы см.таблица1)
        // 6. Напишите запрос, что бы выбрать первые 5 записей из таблицы

        //1. SQLite — это встраиваемая кроссплатформенная База Данных

        Select app = new Select();
        LimitGetBase limitGetBase = new LimitGetBase();

        //2. app.selectFirstNameAndLastName();
        //3. app.selectNameToUpperCase();
        //4. app.selectAll();
        //5. app.selectFirstTrySymbolsName();
        //6. limitGetBase.selectAll();

    }
}
