import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao programa de execução da tabuada");
        System.out.println("Digite um numero : ");

        Scanner tec = new Scanner(System.in);
        int tab = tec.nextInt();

        int calcTab = tab;
        int contador = 0;
        int resultado = 0;

        for (contador = 1; contador <= 10; contador++) {
                        resultado =  calcTab * contador;
            System.out.println(calcTab + "X"+ contador  + " = " + resultado);
        }
        System.out.println("Programa finalizado.");
    }

}