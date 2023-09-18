package main.java.exemplo;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    @Override
    public void ligar(String number) {
        System.out.println("Ligando para telefone " + number);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada telefônica...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
