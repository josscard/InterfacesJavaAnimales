package org.example;

import org.example.modelo.*;

public class Main {
    public static void main(String[] args) {
        Pato donald = new Pato();
        Culebra piton = new Culebra();
        Elefante dumbo = new Elefante();
        Perro douglas = new Perro();
        Pez nemo = new Pez();

        //Acciones del pato donald
        desplazarse(donald);
        nadando(donald);
        respirando(donald);
        volando(donald);

        donald.graznar();

        System.out.println("************************************************");

        //Acciones de la serpiente piton
        desplazarse(piton);
        nadando(piton);
        respirando(piton);

        piton.picar();

        System.out.println("************************************************");

        //Acciones de dumbo el elefante

        desplazarse(dumbo);
        nadando(dumbo);
        respirando(dumbo);

        dumbo.aplastar();

        System.out.println("************************************************");

        //Acciones de douglas el perro

        desplazarse(douglas);
        nadando(douglas);
        respirando(douglas);
        olfateando(douglas);

        douglas.ladrar();

        System.out.println("************************************************");

        //Acciones del pez nemo

        desplazarse(nemo);
        nadando(nemo);
        respirando(nemo);

        nemo.flotar();






    }

    public static void desplazarse(TerrestreAble terrestreAble ) {
        terrestreAble.desplazar();

    }

    //metodos estaticos
    public static void nadando(NadarAble nadarAble) {
        nadarAble.nadar();
    }
    public static void respirando(RespirarAble respirarAble) {
        respirarAble.respirar();
    }
    public static void volando(VolarAble volarAble) {
        volarAble.volar();
    }
    public static void olfateando(OlfatearAble olfatearAble) {
        olfatearAble.olfatear();
    }
}