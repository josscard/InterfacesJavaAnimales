package org.example.modelo;

import org.example.NadarAble;
import org.example.RespirarAble;
import org.example.TerrestreAble;

public class Culebra implements RespirarAble, NadarAble, TerrestreAble {
    @Override
    public void nadar() {
        System.out.println("La culebra esta nadando");
    }

    @Override
    public void respirar() {
        System.out.println("La culebra esta respirando");

    }

    @Override
    public void desplazar() {
        System.out.println("La culebra se esta desplazando");
    }

    // Accion propia de la culebra
    public void picar(){
        System.out.println("La culebra esta picando");
    }
}
