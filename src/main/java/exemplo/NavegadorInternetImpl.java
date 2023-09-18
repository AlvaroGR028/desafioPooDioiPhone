package main.java.exemplo;

public class NavegadorInternetImpl implements NavegadorInternet {


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

