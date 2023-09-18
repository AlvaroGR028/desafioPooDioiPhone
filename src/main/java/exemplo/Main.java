package main.java.exemplo;

public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusicalImpl();
        AparelhoTelefonico telefone = new AparelhoTelefonicoImpl();
        NavegadorInternet navegador = new NavegadorInternetImpl();

        reprodutor.selecionarMusica("Welcome to the Jungle");
        reprodutor.tocar();
        reprodutor.pausar();

        telefone.ligar("999999999");
        telefone.atender();
        telefone.iniciarCorreioVoz();

        navegador.adicionarNovaAba("https://www.NovaAba.com");
        navegador.exibirPagina("https://www.example.com");
        navegador.atualizarPagina();
    }
}
