package org.francodevs.mamiferos;

abstract public class Canino extends Mamifero {

    protected String color;
    protected double sizeColmillos;

    public Canino(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double sizeColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.sizeColmillos = sizeColmillos;
    }

    public String getColor() {
        return color;
    }

    public double getSizeColmillos() {
        return sizeColmillos;
    }

}
