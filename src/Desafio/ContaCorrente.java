package Desafio;

public class ContaCorrente extends ContaBancaria{

    @Override
    public double depositar() {
        return saldo + (valor * 0.99) ;
    }


}
