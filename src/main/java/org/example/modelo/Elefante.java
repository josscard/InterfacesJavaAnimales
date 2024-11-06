package org.example.modelo;

import org.example.NadarAble;
import org.example.RespirarAble;
import org.example.TerrestreAble;

public class Elefante implements RespirarAble, NadarAble, TerrestreAble {
    @Override
    public void nadar() {
        System.out.println("El elefante esta nadando en el rio");
    }

    @Override
    public void respirar() {
        System.out.println("El elefante esta respirando");
    }

    @Override
    public void desplazar() {
        System.out.println("El elefante se esta desplazando");

    }

    //Accion propia del elefante
    public void aplastar(){
        System.out.println("El elefante esta aplastando");
    }
}
