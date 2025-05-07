import br.com.alura.aplicacaodemusica.metodos.Audio;
import br.com.alura.aplicacaodemusica.metodos.Musica;
import br.com.alura.aplicacaodemusica.metodos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Audio audio = new Audio();
        Musica musica = new Musica();
        Podcast podcast = new Podcast();

        // AUDIO e MUSICA

        System.out.println("Música\n");

        audio.setTitulo("Taylor");
        audio.setDuracao(2.03);
        audio.setCurtidas(100);
        audio.setTotalDeReproducao(1.307_000);
        musica.setArtista("Veigh");

        System.out.println("Música: " + audio.getTitulo());
        System.out.println("Artista: " + musica.getArtista());
        System.out.println("Duração: " + audio.getDuracao() + "min");
        System.out.println("Curtidas: " + audio.getCurtidas() + " mil");
        System.out.println("Total de Reprodução: " + audio.getTotalDeReproducao() + " milhões");

        audio.favoritar();

        // AUDIO E PODCAST

        System.out.println("\nPodcast\n");

        audio.setTitulo("VEIGH - Podpah #553");
        podcast.setApresentador("Igão e Mítico");
        podcast.setCanal("PodPah");
        audio.setDuracao(2.21);
        audio.setCurtidas(106);
        audio.setTotalDeReproducao(2.945_000);
        podcast.setConvidado("Thiago Veigh");

        System.out.println("Episódio: " + audio.getTitulo());
        System.out.println("Apresentadores: " + podcast.getApresentador());
        System.out.println("Convidado: " + podcast.getConvidado());
        System.out.println("Canal: " + podcast.getCanal());
        System.out.println("Duração: " + audio.getDuracao() + " horas");
        System.out.println("Curtidas: " + audio.getCurtidas() + " mil");
        System.out.println("Total de Reprodução: " + audio.getTotalDeReproducao() + " milhões");

        audio.favoritar();

    }
}
