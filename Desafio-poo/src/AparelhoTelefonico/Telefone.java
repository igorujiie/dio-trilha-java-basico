package AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{
    @Override
    public void ligar(String numero) {
        numero = "999999999";
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
