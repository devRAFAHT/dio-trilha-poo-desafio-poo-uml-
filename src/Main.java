import entities.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Musica.mp3");
        iphone.reproduzir();
        iphone.pausar();
        System.out.println();

        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println();

        iphone.exibirPagina("www.example.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println();

    }
}