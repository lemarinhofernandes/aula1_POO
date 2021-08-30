package com.company.models;

import java.util.Scanner;

public class Main {
    Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
    Cliente dudu = new Cliente("Luís Eduardo Marinho Fernandes", "05857177103", "developer");
    Conta contaDudu = new Conta(118478,03667);
    contaDudu.setTitular(dudu);
    Cliente zezinho = new Cliente("Zezinho", "132456841", "memeiro");
    Conta contazezinho = new Conta(4145412, 31325);
    contazezinho.setTitular(zezinho);
    }
}
