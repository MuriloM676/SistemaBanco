public class Main{
    public static void main(String[] args) {

        ContaCorrente a = new ContaCorrente();
        a.depositar(100);
        a.sacar(50); // R$ 4,00 São cobrados de juros por saque.
        a.verSaldo(); // R$ 1,00 São cobrados para ver o saldo.
        // Saldo Final : R$ 45,00

        ContaPoupanca b = new ContaPoupanca();
        b.depositar(100); 
        b.sacar(50); // R$ 9,00 São cobrados de juros por saque.
        b.verSaldo(); // R$ 1,00 São cobrados para ver o saldo.
        // Saldo Final : R$ 40,00

        ContaCorrente c = new ContaCorrente();
        c.depositar(500); // Depósitos acima de R$ 500,00 ganharão R$ 10,00 de bônus.
        // Saldo Final : R$ 510,00

        ContaPoupanca d = new ContaPoupanca();
        d.depositar(100); 
        d.sacar(50, "123"); // Não será cobrados juros nessa operação.
        d.verSaldo("123"); // Não será cobrados juros nessa operação.
        // Saldo Final : R$ 50,00

    }
}