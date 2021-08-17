package com.mycompany.cadastropessoas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa dudu = new Pessoa();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        dudu.setNome(scan.nextLine());
        System.out.println("Nome: "+dudu.getNome());
    }
}
