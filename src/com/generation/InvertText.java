package com.generation;

import java.util.Scanner;

public class InvertText {
    public static void main(String[] args) {
        // Se utiliza Scan para obtener un input por parte del usuario
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a word or sentence : ");

        String originWord = myScan.nextLine();
        myScan.close();
        // Ahora convertimos el string normal a un array de caracteres
        char[] charArray = originWord.toCharArray();
        StringBuilder str = new StringBuilder();
        // Iteramos de forma inversa para inprimir la palabra al reves
        for (int i = charArray.length - 1; i >= 0; i--) {
            str.append(charArray[i]);
        }

        System.out.println(str);
    }
}
