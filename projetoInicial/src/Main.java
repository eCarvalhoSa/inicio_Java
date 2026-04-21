
import java.util.Scanner;

class BAnco {
    static void main() {

        System.out.println("************************************");
        System.out.println("             SEJA BEM VINDO          ");
        System.out.println("**************************************");
        System.out.println("                CLIENTE           ");
        System.out.println("Eduardo Carvalho Silva");
        System.out.println("Tipo de Conta :  Corrente");
        System.out.println(" Saldo Atual R$ 2500.00");

        System.out.println("""
                     Operações disponiveis : 
                    
                    1 - Consultar Saldos
                    2 - Receber Valor 
                    3 - Transferir Valor
                    4 - Sair
                    
                    Digita a opção desejada :  """);

        Scanner tec = new Scanner(System.in);



        int nselect = 0;
        while (nselect != 4) {

            System.out.println("""
                     Operações disponiveis : 
                    
                    1 - Consultar Saldos
                    2 - Receber Valor 
                    3 - Transferir Valor
                    4 - Sair
                    
                    Digita a opção desejada :  """);


            nselect = tec.nextInt();

            if (nselect == 1) {
                System.out.println(" Saldo de R$ 2500.00");

            } else if (nselect == 2) {
                System.out.println("DIgite o Valor Desejado : ");
                double adicao = tec.nextDouble();
                double novoSaldo = adicao + 2500.00;
                System.out.println(" Novo saldo R$ " + novoSaldo);

            } else if (nselect == 3) {
                System.out.println("DIgite o Valor do Saque : ");
                double subtracao = tec.nextDouble();
                double saldosub = subtracao - 2500.00;
                System.out.println(" Saldo de R$ " + saldosub);

            } else if (nselect == 4) {

                System.out.println("Programa Finalizado");
            } else if (nselect > 4) {
                System.out.println("Operação invalida ");
            }


        }

    }

}