package model;

public abstract class Conta {
    private String numero;
    private double saldo;
    private Cliente titular;

    public Conta(String numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public abstract void depositar(double valor);
    public abstract boolean sacar(double valor);

    public boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)){
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }


    public void imprimirExtrato() {
        System.out.println("Extrato da conta: " + this.numero);
        System.out.println("Extrato da titular: " + this.titular.getNome());
        System.out.println("Saldo da conta: " + this.saldo);
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void aplicarRendimento() {
    }
}
