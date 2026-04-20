import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

 // Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

        System.out.println("Bem vindo ao identificador de positivo e negativo");
        System.out.println("Para iniciarmos Digite um numero :");

        Scanner tec = new Scanner(System.in);
        double num = tec.nextDouble();


        if (num >= 1 ){
            System.out.println("Esse numero é positivo");
        } else {
            System.out.println("Esse numero é negativo");
        }







    }
}
