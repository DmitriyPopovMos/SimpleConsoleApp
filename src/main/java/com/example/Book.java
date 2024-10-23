package com.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class Book {

    public void fileWrite(LinkedHashMap<String, Contacts> map) throws IOException {
        FileWriter fw = new FileWriter("src/main/resources/MyFile.txt");
        fw.write(map.values().toString());
        fw.close();
    }

    public void fileRead() throws IOException {
        FileReader fr = new FileReader("src/main/resources/MyFile.txt");
        Scanner in = new Scanner(fr);
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
        fr.close();
    }
}
