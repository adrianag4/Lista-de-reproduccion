/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class ListaReproduccion {

    List<Musica> listaMusica;
    String nombreLista;

    /**
     * Constructor donde se inicializan las variables de la clase
     *
     * @param nombreLista nombre de la lista creada
     */
    public ListaReproduccion(String nombreLista) {
        this.nombreLista = nombreLista;
        this.listaMusica = new ArrayList<>(); 
    }

    /**
     * Metodo para mostrar una lista de musica especifica
     *
     * @return lista de musica requerida
     */
    public List<Musica> getListaMusica() {
        return listaMusica;
    }

    /**
     * Metodo para guardar una lista de musica
     *
     * @param listaMusica lista de musica que se desea guardar
     */
    public void setListaMusica(List<Musica> listaMusica) {
        this.listaMusica = listaMusica;
    }

    /**
     * Metodo para mostrar el nombre de la lista guardada
     *
     * @return nombre de la lista seleccionada
     */
    public String getNombreLista() {
        return nombreLista;
    }

    /**
     * Metodo para guardar el nombre de una lista
     *
     * @param nombreLista nombre de la lista a guardar
     */
    public void setNombreLista(String nombreLista) {
        this.nombreLista = nombreLista;
    }

}
