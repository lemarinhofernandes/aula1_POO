
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Filme novo = new Filme();
        Scanner scan = new Scanner(System.in);
        Scanner scanString = new Scanner(System.in.toString());
        int opcao;
        do{
            menu();
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Titulo: ");
                    novo.setTitulo(scan.next());
                    System.out.println("Ano: ");
                    novo.setAno(scan.nextInt());
                    System.out.println("Genero: ");
                    novo.setGenero(scan.next());
                    System.out.println("Preço: ");
                    novo.setPreco(scan.nextDouble());
                    Acervo.adicionar(novo);
                    break;
                case 2:
                    Acervo.listar();
                    break;
            }
        }while (opcao != 0);
    }

    private static void menu() {
        System.out.println("1 - adiciona");
        System.out.println("2 - lista");
        System.out.println("3 - altera");
        System.out.println("4 - remove");
        System.out.println("0 - sai");
        System.out.println("Escolha: ");
    }
}
