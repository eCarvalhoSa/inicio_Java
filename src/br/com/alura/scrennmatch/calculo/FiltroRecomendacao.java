package br.com.alura.scrennmatch.calculo;

public class FiltroRecomendacao {

    private String recomendacao;

    public void filtra(Classificavel classificavel){

        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os Preferidos do momento");
        }else if (classificavel.getClassificacao() >= 2){
            System.out.println("É muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua Lista para assistir mais tarde");
        } 


    }


}
