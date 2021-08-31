package model_cadastro;

public class Emprego {
    private String cargo;
    private String tempoDeTrabalho;
    private double salario;

    public Emprego(String cargo, String tempoDeTrabalho, double salario) {
        this.cargo = cargo;
        this.tempoDeTrabalho = tempoDeTrabalho;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTempoDeTrabalho() {
        return tempoDeTrabalho;
    }

    public void setTempoDeTrabalho(String tempoDeTrabalho) {
        this.tempoDeTrabalho = tempoDeTrabalho;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
