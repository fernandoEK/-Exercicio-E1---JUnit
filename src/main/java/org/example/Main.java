package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();

        Ttwitting ttwitting = new Ttwitting();
        System.out.println(ttwitting.classificarMensagem(texto));

        scanner.close();
    }
}