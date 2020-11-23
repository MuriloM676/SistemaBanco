public class ContaCorrente {

    private double saldo;
    public int conta;

    public void sacar(double valor){
        if (this.saldo > valor){
            this.saldo -= valor;
            this.juro();
        } else{
            System.out.println("ALERTA !!!! Não possui saldo disponível em conta corrente. Seu saldo disponível é de: R$" + this.saldo);
        }
    }
    
    public void zerarConta(String senha){
        if (senha == "123"){
            this.saldo -= this.saldo;
            System.out.println("Conta Zerada");
            System.out.println("Saldo dispoível em conta corrente é de: R$:" + this.saldo);
        } else {
            System.out.println("SENHA INCORRETA!");
        }
    }

    public void sacar(double valor, String senha){
        if (senha == "123"){
            if (this.saldo > valor){
                this.saldo -= valor;
            } else{
                System.out.println("ALERTA !!!! Não possui saldo disponível em conta corrente. Seu saldo disponível é de: R$" + this.saldo);
            }
        } else {
            System.out.println("ERRO AO SACAR, SENHA INCORRETA!!");
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        if (valor >= 500){
            bonus();
        }
    }

    public String verSaldo(){
        jurosVer();
        System.out.println("===== SALDO DISPONÍVEL EM CONTA CORRENTE =====");
        System.out.println("Sua conta corrente tem um saldo dê R$ " + this.saldo);
        System.out.println("R$ 1.00 é cobrado de juros pra ver o saldo.");
        System.out.println("R$ 4.00 são cobrados de juros de saque");
        System.out.println("Depósitos acima de R$ 500,00 ganharão R$ 10,00 de bônus.");
        System.out.println("===========================================");
		return null;
    }

    public String verSaldo(String senha){
        if (senha == "123"){
            System.out.println("===== SALDO DISPONÍVEL EM CONTA CORRENTE =====");
            System.out.println("Sua conta corrente tem um saldo dê R$ " + this.saldo);
            System.out.println("Ao usar a senha, não será cobrado juros.");
            System.out.println("Depósitos acima de R$ 500,00 ganharão R$ 10,00 de bônus.");
            System.out.println("===========================================");
        } else {
            System.out.println("ERRO AO VER SALDO, SENHA INCORRETA!!");
        }
        return senha;
    }

    private void juro(){
        this.saldo -= 4;
    }

    private void jurosVer(){
        this.saldo -= 1;
    }

    private void bonus(){
        this.saldo += 10;
    }
}