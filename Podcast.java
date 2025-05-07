package br.com.alura.aplicacaodemusica.metodos;

public class Podcast extends Audio {

    private String apresentador;
    private String descricao;
    private int numeroDeEpisodeos;
    private String canal;
    private String convidado;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeroDeEpisodeos() {
        return numeroDeEpisodeos;
    }

    public void setNumeroDeEpisodeos(int numeroDeEpisodeos) {
        this.numeroDeEpisodeos = numeroDeEpisodeos;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }
}
