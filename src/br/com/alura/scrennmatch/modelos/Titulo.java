package br.com.alura.scrennmatch.modelos;

public class Titulo {

    private String nome;
    private int  anoDeLAncamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacao;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLAncamento() {
        return anoDeLAncamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLAncamento(int anoDeLAncamento) {
        this.anoDeLAncamento = anoDeLAncamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do br.com.alura.scrennmatch.modelos.Filme :" + nome);
        System.out.println("Ano de Lançamento" + anoDeLAncamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacao ++;
    }

    public double mediaAvaliacoes(){
        return somaDasAvaliacoes / totalAvaliacao;
    }

}
