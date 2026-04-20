
import java.util.Scanner;

public class compararNum {
    public static void main(String[] args) {
/*Compare os números e imprima uma mensagem
 indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.*/

        System.out.println("Bem vindo ao comparador de numeros !! ");
        System.out.println("Digite dois  numeros inteiros e compare");

        System.out.println("Digite o primeiro numero : ");
        Scanner tec = new Scanner(System.in);
        int n1 = tec.nextInt();
        System.out.println("Digite o segundo numero : ");
        int n2 = tec.nextInt();

        if( n1 == n2){
            System.out.println("OS valores são Iguais"+ n1 + "," + n2);
        } else if( n1 < n2){
            System.out.println("O Segundo valor é maior" + n1+ "," + n2);
        } else if (n1 > n2) {
            System.out.println("O primeiro valor é maior " + n1+ "," + n2);

        }

    }
}
