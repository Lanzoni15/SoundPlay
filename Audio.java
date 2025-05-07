package br.com.alura.aplicacaodemusica.metodos;

public class Audio {

    private String titulo;
    private double duracao;
    private double totalDeReproducao;
    private int curtidas;
    private int classificacao;

    public void reproduzir() {
        totalDeReproducao++;
    }

    public void curtir() {
        curtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public void setTotalDeReproducao(double totalDeReproducao) {
        this.totalDeReproducao = totalDeReproducao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public void favoritar() {
        if (getCurtidas() > 100 || getTotalDeReproducao() >= 100_000) {
            System.out.println("Adicionado em favoritas");
        } else {
            System.out.println("Recomendado para você");
        }
    }


}
