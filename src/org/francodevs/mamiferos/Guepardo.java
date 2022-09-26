package org.francodevs.mamiferos;

public class Guepardo extends Felino {

    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, double sizeGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, sizeGarras, velocidad);
    }

    @Override
    public String comer() {
        return "Los " + this.nombreCientifico + " se alimentan de presas medianas";
    }

    @Override
    public String dormir() {
        return "El guepardo de " + this.peso + "kg duerme mas de 14 hs por día";
    }

    @Override
    public String correr() {
        return "Su velocidad es de 80 a 130km/h";
    }

    @Override
    public String comunicarse() {
        return "La comunicación consta de gruñidos, chirridos agudos, ronroneos, balidos y silbidos";
    }

}
