import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        Cliente cliente1 = new Cliente("Vitor Batista", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Silva", "987.654.321-00");
        ContaCorrente contaCorrente1 = new ContaCorrente("12345-6", 500, cliente1);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca("98765-4", 2000.0, cliente2, 0.5);
        contaCorrente1.depositar(1000.0);
        contaPoupanca1.depositar(2000.0);
        contaCorrente1.sacar(1200.0);
        contaPoupanca1.aplicarRendimento();
        contaCorrente1.transferir(100.0, contaPoupanca1);
        System.out.println("----Extrato Conta Corrente----");
        contaCorrente1.imprimirExtrato();
        System.out.println("------------------------");
        System.out.println("----Extrato Conta Poupanca----");
        contaPoupanca1.imprimirExtrato();
    }
}