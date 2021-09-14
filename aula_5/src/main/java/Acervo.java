import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Acervo {

    private static final List<Filme> listaFilmes = new ArrayList<Filme>();
    private static final List<Filme> novaListaFilmes = new ArrayList<Filme>();

    public static List<Filme> getListaFilmes() {
        return listaFilmes;
    }

    public static List<Filme> getNovaListaFilmes() {
        return novaListaFilmes;
    }

    public static void adicionar(Filme f) {
        listaFilmes.add(f);
    }

    public static boolean remover(String titulo) {
        for (Filme f : listaFilmes) {
            if (f.getTitulo().equalsIgnoreCase(titulo)) {
                listaFilmes.remove(f);
                return true;
            }
        }
        return false;
    }

    public static boolean alterar(String titulo) {
        Scanner scanString = new Scanner(System.in);
        String novoTitulo;
        for (Filme f : listaFilmes) {
            if (f.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Digite o novo titulo: ");
                novoTitulo = scanString.nextLine();
                f.setTitulo(novoTitulo);
                return true;
            }
        }
        return false;
    }

    public static void listar() {
        int i =1;
        for (Filme f: listaFilmes) {
            System.out.println("FILME N. " + (i++));
            f.imprimirFilme();
        }
    }

    public static void listarLista(List<Filme> im) {
        int i =1;
        for (Filme f: im) {
            System.out.println("FILME N. " + (i++));
            f.imprimirFilme();
        }
    }
}
