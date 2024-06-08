package NavegadorInternet;

public class Internet implements NavegadorInternet{
    String url;
    String titulo;

    @Override
    public void exibirPagina(String url) {
        url = "www.google.com";
        System.out.println("Exibindo pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }
}
