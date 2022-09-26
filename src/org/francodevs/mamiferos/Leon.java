package org.francodevs.mamiferos;

public class Leon extends Felino{

    private int numeroManada;
    private double potenciaRugido;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double sizeGarras, int velocidad, int numeroManada, double potenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, sizeGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugido = potenciaRugido;
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    public double getPotenciaRugido() {
        return potenciaRugido;
    }

    @Override
    public String comer() {
        return "El " + this.nombreCientifico + " (León) se alimenta junto a la manada formada por " + this.numeroManada + " individuos";
    }

    @Override
    public String dormir() {
        return "El habitat natural donde el león se siente mas seguro al dormir es " + this.habitat;
    }

    @Override
    public String correr() {
        return "El leon puede correr con una velocidad de " + this.velocidad + "km/h";
    }

    @Override
    public String comunicarse() {
        return "La potencia de rugido del Leon es: " + this.potenciaRugido + "db";
    }
}
