package br.com.alura.scrennmatch.calculo;

import br.com.alura.scrennmatch.modelos.Filme;
import br.com.alura.scrennmatch.modelos.Serie;
import br.com.alura.scrennmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }
// Removidos para ajuste de design bonito e leve do codigo

    public void inclui (Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
