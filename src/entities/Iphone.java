package entities;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página de endereço: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado");
    }

    @Override
    public void proxima() {
        System.out.println("Reproduzindo próxima");
    }

    @Override
    public void anterior() {
        System.out.println("Reproduzindo anterior");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println(musica + " selecionada");
    }
}
