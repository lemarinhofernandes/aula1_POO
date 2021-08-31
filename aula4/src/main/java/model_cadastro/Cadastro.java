package model_cadastro;

public class Cadastro {
    private String nome;
    private int idade;
    private String email;
    private Emprego emprego;
    private Telefone telefone;
    private Endereco endereco;

    public Cadastro(String nome, int idade, String email, Emprego emprego, Telefone telefone, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.emprego = emprego;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Emprego getEmprego() {
        return emprego;
    }

    public void setEmprego(Emprego emprego) {
        this.emprego = emprego;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void apresenta(){
        System.out.println("---CADASTRO---");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("E-mail: " + this.getEmail());
        System.out.println(
                "Emprego: " +
                        this.emprego.getCargo() + " por " +
                        this.emprego.getTempoDeTrabalho() + " recebendo R$" +
                        this.emprego.getSalario()
        );
        System.out.println(
                "Endereço: " +
                        this.endereco.getCidade() + " - " +
                        this.endereco.getUf() + ", " +
                        this.endereco.getBairro() + "\nCEP: " +
                        this.endereco.getCep()
        );
        System.out.println(
                "Telefone: " +
                        this.telefone.getTipo() + " - " +
                        this.telefone.getDdd() + " " +
                        this.telefone.getNumero()
        );
    }
}
