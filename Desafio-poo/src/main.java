import Iphone.Iphone;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();

        System.out.println("Desbloqueando Iphone");
        System.out.println("Abrindo Menu Principal");
        System.out.println();
        System.out.println();

        System.out.println("Digite o numero de telefone: ");
        String numero = scanner.nextLine();
        iphone.ligar(numero);
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println();

        System.out.println("Digite a url: ");
        String url = scanner.nextLine();
        iphone.exibirPagina(url);
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println();


        System.out.println("Digite o nome da música: ");
        String musica = scanner.nextLine();
        iphone.selecionarMusica(musica);
        iphone.tocar();
        iphone.pausar();

        System.out.println();
        System.out.println("Bloqueando Iphone");
    }
}
