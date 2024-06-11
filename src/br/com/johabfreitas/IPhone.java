package br.com.johabfreitas;

public class IPhone implements AparelhoTelefonico, NavegadorInternet{

    @Override
    public void ligar() {
        System.out.println("Aparelho ligado");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo Caixa Postal");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Abrindo o navegador na URL: https://dio.me");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba aberta em: https://google.com");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página... F5\nPágina atualizada");
    }

}
