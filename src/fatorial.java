import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao programa ");
        System.out.println("Calculandor de Fatorial");
        System.out.println("Digite um numero e será exibido o fatorial do mesmo");
        System.out.println("Para iniciar Digite um numero :");


        Scanner tec = new Scanner(System.in);

        int num = tec.nextInt();

        int fatorial = 1;

        for  (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial do numero digitado é : " + fatorial  );
    }
}
