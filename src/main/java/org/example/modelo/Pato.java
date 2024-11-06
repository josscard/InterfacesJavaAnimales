package org.example.modelo;

import org.example.NadarAble;
import org.example.RespirarAble;
import org.example.TerrestreAble;
import org.example.VolarAble;

public class Pato implements VolarAble, RespirarAble, NadarAble, TerrestreAble {
    @Override
    public void volar() {
        System.out.println("El pato esta volando muy alto");
    }

    @Override
    public void respirar() {
        System.out.println("El pato esta respirando");
    }

    @Override
    public void desplazar() {
        System.out.println("El pato se esta desplazando rapidamente");

    }

    @Override
    public void nadar() {
        System.out.println("El pato esta nadando en el rio");

    }

        //Accion propia del pato
    public void graznar(){
        System.out.println("El pato esta graznando");
    }
}
