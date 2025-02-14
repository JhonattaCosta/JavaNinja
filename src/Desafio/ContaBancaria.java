package Desafio;

public abstract class ContaBancaria implements Conta {
    double valor;
    double saldo;

    @Override
    public void consultarsaldo() {
        System.out.println("Seu saldo é: " + saldo);
    }

    @Override
    public double depositar() {
        return valor + saldo;
    }

    @Override
    public double sacar() {
        return  saldo - valor;
    }
}
