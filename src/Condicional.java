import java.util.Objects;

public class Condicional {

    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";


         if (anoDeLancamento >= 2022){
            System.out.println("Novos no catalogo");
        } else {
            System.out.println("Filme Retro");
        }
        if (incluidoNoPlano == true && tipoPlano.equals("normal")) {
            System.out.println("Acesso liberado");
        } else {
            System.out.println("Acesso negado");
        }


    }
}
