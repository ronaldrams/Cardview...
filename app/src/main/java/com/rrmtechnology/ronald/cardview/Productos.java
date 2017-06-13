package com.rrmtechnology.ronald.cardview;

/**
 * Created by ronald on 28/05/2017.
 */
public class Productos {

    private int imagen;
    private String nombre;

    public Productos (int imagen , String nombre){
        this.imagen=imagen;
        this.nombre=nombre;

    }

    public int getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
