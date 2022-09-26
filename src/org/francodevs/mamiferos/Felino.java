package org.francodevs.mamiferos;

abstract public class Felino extends Mamifero {

    protected double sizeGarras;
    protected int velocidad;

    public Felino(String habitat, double altura, double largo, double peso, String nombreCientifico, double sizeGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.sizeGarras = sizeGarras;
        this.velocidad = velocidad;
    }

    public double getSizeGarras() {
        return sizeGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

}
