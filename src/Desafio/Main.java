package Desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaCorrente.saldo = 1000;
        contaPoupanca.saldo = 1000;

        boolean rep = true;

        while(rep){
            boolean rep2 = true;
            boolean rep3 = true;


            System.out.println("------------------------");
            System.out.println("Escolha uma opção");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.println("3 - sair");
            System.out.println("------------------------");

            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao){

                case 1:

                    while (rep2){

                        System.out.println("------------------------");
                        System.out.println("Escolha uma opção");
                        System.out.println("1 - Ver Saldo");
                        System.out.println("2 - Depositar");
                        System.out.println("3 - Sacar");
                        System.out.println("4 - Sair");
                        System.out.println("------------------------");

                        int escolha = entrada.nextInt();

                        switch (escolha){
                            case 1:
                                contaCorrente.consultarsaldo();
                                break;
                            case 2:
                                System.out.println("Qual valor deseja depositar ?");
                                contaCorrente.valor = entrada.nextDouble();
                                contaCorrente.saldo = contaCorrente.depositar();
                                break;
                            case 3:
                                System.out.println("Qual valor deseja sacar ?");
                                contaCorrente.valor = entrada.nextDouble();
                                if (contaCorrente.valor > contaCorrente.saldo){
                                    System.out.println("Valor é maior que o saldo tente novamente");
                                }else{
                                    contaCorrente.saldo = contaCorrente.sacar();
                                }
                                break;
                            case 4:
                                rep2 = false;
                                break;
                            default:
                                System.out.println("A opção digitada é invalida tente novamente");
                                break;
                        }
                    }
                    break;
                case 2:

                    while (rep3){
                        System.out.println("------------------------");
                        System.out.println("Escolha uma opção");
                        System.out.println("1 - Ver Saldo");
                        System.out.println("2 - Depositar");
                        System.out.println("3 - Sacar");
                        System.out.println("4 - Sair");
                        System.out.println("------------------------");
                        int opcao1 = entrada.nextInt();
                        entrada.nextLine();

                        switch (opcao1){
                            case 1:
                                System.out.println("seu saldo é: " + contaPoupanca.saldo);
                                break;
                            case 2:
                                System.out.println("Qual valor deseja despositar ?");
                                contaPoupanca.valor = entrada.nextDouble();
                                contaPoupanca.saldo = contaPoupanca.depositar();
                                break;
                            case 3:
                                System.out.println("Qual valor deseja Sacar ?");
                                contaPoupanca.valor = entrada.nextDouble();
                                if(contaPoupanca.valor > contaPoupanca.saldo){
                                    System.out.println("O valor é maior que o saldo tente novamente");
                                }else{
                                    contaPoupanca.saldo = contaPoupanca.sacar();
                                }
                                break;
                            case 4:
                                rep3 = false;
                                break;
                            default:
                                System.out.println("Opção invalida digite novamente");
                                break;

                        }
                    }
                    break;

                case 3:
                    rep =false;
                    break;
                default:
                    System.out.println("Opção invalida escolha novamente");
                    break;

            }
        }










    entrada.close();
    }
}
