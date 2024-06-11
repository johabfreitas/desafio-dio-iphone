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

    public GeneroMusical getGenero(){
        return genero;
    }

    //Setters
    public void setMusica(String musica){
        this.musica = musica;
    }

    public void setArtista(String artista){
        this.artista = artista;
    }

    public void setGenero(GeneroMusical genero){
        this.genero = genero;
    }

}
