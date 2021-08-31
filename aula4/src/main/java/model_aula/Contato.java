package model_aula;

public class Contato {
    private String nome;
    private String email;
    private Telefone telefone;
    private Endereco edereco;

    public Endereco getEdereco() {
        return edereco;
    }

    public void setEdereco(Endereco edereco) {
        this.edereco = edereco;
    }

    public Contato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public void contatoCriado(){
        System.out.println("---CONTATO---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone.getTipo() + " - " + this.telefone.getDdd() + " " + this.telefone.getNumero());
        System.out.println(
                "Endereço: " +
                        this.edereco.getUf() + ", " +
                        this.edereco.getCidade() + ", " +
                        this.edereco.getBairro() + ", " +
                        this.edereco.getCep()
        );
    }
}
