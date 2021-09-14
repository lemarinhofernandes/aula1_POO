package model_aula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Contato pessoa1 = new Contato();
        Telefone[] telP1 = new Telefone(2);
        Endereco endP1 = new Endereco();

        pessoa1.setNome("joao");
        pessoa1.setEmail("a@gmail.com");
        telP1[0].setDdd("061");
        telP1[0].setNumero("87546654");
        telP1[0].setTipo("celular");
        telP1[1].setDdd("062");
        telP1[1].setNumero("45645645");
        telP1[1].setTipo("fixo");

        endP1.setUf("DF");
        endP1.setBairro("Taguatinga");
        endP1.setCidade("Bras�lia");
        endP1.setCep("");
        /*System.out.println("Digite seu nome: ");
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
        endP1.setCep(s.nextLine());*/
        for(int i=0;i<2;i++) {
        pessoa1.setTelefone(telP1[i]);
        }
        endP1.
    }
}
