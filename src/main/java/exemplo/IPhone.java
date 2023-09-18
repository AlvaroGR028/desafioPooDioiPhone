package main.java.exemplo;

// Implementação dos métodos das interfaces ReprodutorMusical, AparelhoTelefonico e NavegadorInternet
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    @Override
    public void ligar(String number) {
        System.out.println("Ligando o telefone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada telefônica...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da web: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba com página da web: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web...");
    }
}


