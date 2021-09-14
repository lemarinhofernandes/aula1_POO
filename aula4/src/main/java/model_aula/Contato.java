package model_aula;

public class Contato {
    private String nome;
    private String email;
    private Telefone[] telefones;
    private Endereco endereco;

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

    public Telefone[] getTelefones() {
        return telefones;
    }

    public void setTelefones(Telefone[] telefones) {
        this.telefones = telefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void contatoCriado(){
        System.out.println("---CONTATO---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        for(int i=0;i<2;i++) {
        	telefones[i].imprimirTelefone();
        };
        endereco.imprimirEndereco();
        
        
    }
}
