package view;



import model.Conta;


public class TesteConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta(1234, 5678, 1000, 500);

        System.out.println("Saldo inicial: " + minhaConta.getSaldo() + " e limite de:" + minhaConta.getLimite());
        minhaConta.deposita(200);
        System.out.println("Saldo após depósito: " + minhaConta.getSaldo());
        minhaConta.saca(1500);
        minhaConta.saca(2000);
        System.out.println("Saldo após saque: " + minhaConta.getSaldo());

    }
}
