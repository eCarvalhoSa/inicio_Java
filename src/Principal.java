import br.com.alura.scrennmatch.calculo.CalculadoraDeTempo;
import br.com.alura.scrennmatch.calculo.FiltroRecomendacao;
import br.com.alura.scrennmatch.modelos.Episodio;
import br.com.alura.scrennmatch.modelos.Filme;
import br.com.alura.scrennmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso Chefão");
        meuFilme.setAnoDeLAncamento( 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração em Minutos " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de Avaliações" + meuFilme.getTotalAvaliacao());
        // System.out.println(meuFilme.totalAvaliacao);
        System.out.println(meuFilme.mediaAvaliacoes());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLAncamento( 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEspisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para Maratonar Lost " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLAncamento( 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro  = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacoes(300);
        filtro.filtra(episodio);

    }
}
