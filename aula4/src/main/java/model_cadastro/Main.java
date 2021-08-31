package model_cadastro;

public class Main {
    public static void main(String[] args) {
        Emprego emprego1 = new Emprego(
                "Desenvolvedor",
                "2 anos",
                3000.00
        );
        Endereco endereco1 = new Endereco(
                "15466897",
                "Samambaia",
                "Brasília",
                "DF"
        );
        Telefone tel1 = new Telefone(
                "061",
                "845127787",
                "Celular"
                );
        Cadastro pessoa1 = new Cadastro(
                "Jose",
                25,
                "jose@gmail.com",
                emprego1,
                tel1,
                endereco1
        );
        pessoa1.apresenta();
    }
}
