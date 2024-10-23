package com.example;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contacts {

        private String name;
        private String surname;
        private String passNumber;

    public Contacts(String name, String surname, String passNumber) {
        this.name = name;
        this.surname = surname;

        Pattern pattern = Pattern.compile("^[0-9A-F]+$");
        Matcher matcher = pattern.matcher(passNumber);
        if (matcher.find() && passNumber.length() == 8) {
            this.passNumber = passNumber;
//            System.out.println("Test Ok: " + passNumber);
        }
        else {
            System.err.println("Exception: Не верно указан Номер пропуска: " + passNumber + "\nПроверьте правильность ввода. " +
                    "Длина поля должна быть 8 символов, разрешенные символы: 0-9A-F. Пример: \"00F1C313\"");
        }
    }

    public String getPassNumber() {
        return passNumber;
    }

    @Override
    public String toString() {
        return "Contact{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", PassNumber='" + passNumber + '\'' + '}' + "\n";
    }
}
