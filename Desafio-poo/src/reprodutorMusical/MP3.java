package ReprodutorMusical;

public class MP3 implements ReprodutorMusical{
    String titulo;
    String artista;
    String genero;
    String duracao;


    @Override
    public void tocar() {
        System.out.println("tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        musica = "Beatles - Hey Jude";
        System.out.println("Selecionando Musica: " + musica);

    }
}
