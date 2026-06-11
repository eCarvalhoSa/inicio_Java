package br.com.alura.scrennmatch.modelos;

import br.com.alura.scrennmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) mediaAvaliacoes() / 2 ;
    }
}

