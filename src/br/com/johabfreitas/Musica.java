package br.com.johabfreitas;

public class Musica {

    String musica;
    String artista;
    GeneroMusical genero;

    //Getters
    public String getMusica(){
        return musica;
    }

    public String getArtista(){
        return artista;
    }

    //Setters
    public void setMusica(String musica){
        this.musica = musica;
    }

    public void setArtista(String artista){
        this.artista = artista;
    }

    public void musicaEscolhida(){
        System.out.println("Musica Escolhida: " + this.musica);
        System.out.println("Artista: " + this.artista);
        System.out.println("Gênero: " + this.genero);
    }

}
