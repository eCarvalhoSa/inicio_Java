import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao programa PAR ou IMPAR");
        System.out.println("Digite um numero e eu direi se é PAR ou IMPAR");


        System.out.println("DIgite um numero : ");

        Scanner tec = new Scanner(System.in);
        double num = tec.nextDouble();

        if( num % 2 == 0 ){
            System.out.println("O numero DIgitado " + num + "é PAR");
        } else {
            System.out.println("O numero DIgitado " + num + "é IMPAR");
        }

        System.out.println("Programa finalizado");
    }
}
