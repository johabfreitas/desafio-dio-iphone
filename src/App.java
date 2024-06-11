import br.com.johabfreitas.GeneroMusical;
import br.com.johabfreitas.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        
       IPhone iphone = new IPhone();

       System.out.println("==== Ligando o aparelho! ====");
       iphone.ligar();
       iphone.atender();
       iphone.iniciarCorreioVoz();
       System.out.println("-----------------------");
       System.out.println();

       System.out.println("@@@@ Navegando na Internet @@@@");
       iphone.exibirPagina();
       iphone.adicionarNovaAba();
       iphone.atualizarPagina();
       System.out.println("-----------------------");
       System.out.println();

       System.out.println("§&§&§ Reproduzindo uma Música §&§&§");
       iphone.selecionarMusica();
       iphone.musicaEscolhida("Índios",  "Legião Urbana", GeneroMusical.ROCK);
       iphone.tocar();
       iphone.pausar();
    }
}
