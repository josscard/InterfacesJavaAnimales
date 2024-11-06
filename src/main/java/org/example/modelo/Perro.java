package org.example.modelo;

import org.example.NadarAble;
import org.example.OlfatearAble;
import org.example.RespirarAble;
import org.example.TerrestreAble;

public class Perro implements TerrestreAble, NadarAble, RespirarAble, OlfatearAble {
    @Override
    public void nadar() {
        System.out.println("El perro esta nadando");
    }

    @Override
    public void respirar() {
        System.out.println("El perro esta respirando");

    }

    @Override
    public void desplazar() {
        System.out.println("El perro se esta desplazando");

    }

    @Override
    public void olfatear() {
        System.out.println("El perro esta olfateando");
    }

    //Accion propia del perro
    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }
}
