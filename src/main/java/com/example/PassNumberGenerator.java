package com.example;

import java.util.Arrays;
import java.util.Random;

public class PassNumberGenerator {

    public String setPassNumber() {
        String chars = "ABCDEF0123456789";             // Номер пропуска (Уникальное поле, String, длина поля 8 символов, разрешенные символы: 0-9A-F. Пример строки: "00F1C313")

        Random random = new Random();
        int len = 8;
        char[] pass = new char[len];

        for (int i = 0; i < len; i++) {
            pass[i] = chars.charAt(random.nextInt(chars.length()));
        }
        System.out.print("Номер пропуска при добавлении нового Контакта: ");
        return Arrays.toString(pass);
    }
}
