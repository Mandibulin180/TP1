package com.info.servicio.entrada.console;

import java.util.Scanner;

public class inputService {
    public static Scanner scanner;

    public static void createScanner(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
    }

    public static Scanner getScanner() {
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static void clasesScanner(){
        if(scanner != null){
            scanner.close();
        }
    }
}
