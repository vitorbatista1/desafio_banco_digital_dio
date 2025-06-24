package model;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
        this.limiteChequeEspecial = saldo;
    }

    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public boolean sacar(double valor) {
        if (valor <= this.getSaldo() + this.limiteChequeEspecial) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }

    public void imprimirExtrato() {
        super.imprimirExtrato();
        System.out.println("Limite de cheque especial: " + this.limiteChequeEspecial);
    }
}
