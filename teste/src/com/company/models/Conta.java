package com.company.models;

public class Conta {
    private double saldo;
    private Cliente titular;
    private int numero;
    private int agencia;
    private static int total=0;

    public Conta(int numero, int agencia) {
        Conta.total++;
        System.out.println("O total de contas é: " + Conta.total);
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 100;
        System.out.println("Agencia: " + agencia + " Numero: " + numero + " Saldo: " + saldo);
    }
    public void deposita(double deposito){
        this.saldo += deposito;
    }
    public boolean saca(double saque){
        if(this.saldo>=saque){
            this.saldo-=saque;
            return true;
        } else {
            return false;
        }
    }
    public boolean transfere(double valor, Conta destino){
        if(this.saldo>=valor){
            this.saldo-=valor;
            destino.saldo+=valor;
            return true;
        } else
            return false;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public boolean setNumero(int numero) {
        if(numero<=0)
            return false;
        else {
            this.numero = numero;
            return true;
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public boolean setAgencia(int agencia) {
        if(agencia<=0)
            return false;
        else {
            this.agencia = agencia;
            return true;
        }
    }

    public static int getTotal() {
        return total;
    }

    public double getSaldo() {
        return saldo;
    }
}
