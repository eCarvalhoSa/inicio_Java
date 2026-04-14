import java.util.Scanner;
import java.lang.String;


public class Main {
    public static void main(String[] args) {

        System.out.println("Crie um programa que realize a média de duas notas decimais e exiba o resultado.");

        System.out.print("Digite a Primeira nota :");
        Scanner input = new Scanner(System.in);
        double n1 = input.nextDouble();
        System.out.print("Digite a Segunda nota :");
        new Scanner(System.in);
        double n2 = input.nextDouble();

        double media =  (n1 + n2) / 2;
        System.out.println("A media é : " + (int) media);




    }
}