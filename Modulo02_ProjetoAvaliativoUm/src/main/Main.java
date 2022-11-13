package main;

import menus.MenuOpcoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

       MenuOpcoes.menu(entrada);

        entrada.close();
    }
}
