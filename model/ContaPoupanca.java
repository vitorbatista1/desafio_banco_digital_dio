package model;

public class ContaPoupanca extends Conta {
    private double rendimentoMensal;

    public ContaPoupanca(String numero, double saldo, Cliente titular, double taxaRendimento) {
        super(numero, saldo, titular);
        this.rendimentoMensal = taxaRendimento;
    }

    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public boolean sacar(double valor) {
        if (valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }

    public void aplicarRendimento() {
        double valorTotalComRendimento = this.getSaldo() + ((this.rendimentoMensal / 100) * this.getSaldo());
        this.setSaldo(valorTotalComRendimento);
    }

    public void imprimirExtrato() {
        super.imprimirExtrato();
        System.out.println("Taxa de rendimento mensal: " + this.rendimentoMensal);
    }
}
