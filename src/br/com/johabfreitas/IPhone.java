package br.com.johabfreitas;

public class IPhone extends Musica implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    // Implementando a interface AparelhoTelefonico
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

    // Implementando a interface Navegador Internet
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

    // Implementando a interface ReprodutorMusical
    @Override
    public void musicaEscolhida(String musica, String artista, GeneroMusical genero) {
        System.out.println(String.format("Música: %s\nArtista: %s\nGênero: %s", musica, artista, genero));
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música >>");
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada...");
    }

    @Override
    public void selecionarMusica() {
       System.out.println("Música escolhida");
    }

    

}
