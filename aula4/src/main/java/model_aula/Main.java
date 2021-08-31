package model_aula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Contato pessoa1 = new Contato();
        Telefone telP1 = new Telefone();
        Endereco endP1 = new Endereco();

        System.out.println("Digite seu nome: ");
        pessoa1.setNome(s.nextLine());
        System.out.println("Digite seu e-mail: ");
        pessoa1.setEmail(s.nextLine());
        System.out.println("Digite seu DDD:");
        telP1.setDdd(s.nextLine());
        System.out.println("Digite seu número:");
        telP1.setNumero(s.nextLine());
        System.out.println("Digite o tipo:");
        telP1.setTipo(s.nextLine());
        System.out.println("Digite a UF:");
        endP1.setUf(s.nextLine());
        System.out.println("Digite o nome da Rua:");
        endP1.setBairro(s.nextLine());
        System.out.println("Digite o nome da Cidade:");
        endP1.setCidade(s.nextLine());
        System.out.println("Digite o CEP:");
        endP1.setCep(s.nextLine());

        pessoa1.setTelefone(telP1);
        pessoa1.setEdereco(endP1);
        pessoa1.contatoCriado();
    }
}
