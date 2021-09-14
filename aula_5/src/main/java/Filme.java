public class Filme {
    private String titulo;
    private int ano;
    private String genero;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimirFilme() {
        System.out.println("titulo: " + this.titulo);
        System.out.println("ano: " + this.ano);
        System.out.println("genero: " + this.genero);
        System.out.println("preco: " + this.preco);
    }
}
