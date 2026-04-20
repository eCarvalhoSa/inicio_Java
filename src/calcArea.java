

/* Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo".
 Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
 */

import java.util.Scanner;

public class calcArea {
    public static void main(String[] args) {

        System.out.println("""
                Bem vindo ao Programa!
                Nesse programa realizamos o calculo da area
                Esse programa oferece duas opçõeses de calculo
                Sendo elas um quadrado ou um circulo
                para iniciar selecione uma opção 
                [1 ] Quadrado
                [2]  Circulo """);

        System.out.println("Selecione uma opção : ");
        Scanner tec = new Scanner(System.in);
        double num = tec.nextDouble();


        if  (num == 1){
            System.out.println("Digite o valor do quadrado: ");
            double q1 = tec.nextDouble();

            double qA = q1 * q1;

            System.out.println("O valor da area do quadrado é :"+qA );

        }else if  (num == 2){
            System.out.println("Digite o diametro circulo: ");
            double c1 = tec.nextDouble();
            double raio = c1 / 2 ;
            double cA = 3.14 * (raio*raio);
            System.out.println("A area do circulo é : " + cA);
        }







    }
}
