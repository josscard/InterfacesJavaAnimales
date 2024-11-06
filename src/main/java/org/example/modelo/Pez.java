package org.example.modelo;

import org.example.NadarAble;
import org.example.RespirarAble;
import org.example.TerrestreAble;

public class Pez implements RespirarAble, NadarAble, TerrestreAble {


    @Override
    public void nadar() {
        System.out.println("El pez esta nadando");
    }

    @Override
    public void respirar() {
        System.out.println("El pez esta respirando");

    }

    @Override
    public void desplazar() {
        System.out.println("El pez se esta desplazando");

    }

    //Accion propia del pez
    public void flotar(){
        System.out.println("El pez esta flotando");
    }
}
