package org.francodevs.mamiferos;

public class Lobo extends Canino{

    private int numeroCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double sizeColmillos, int numeroCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, sizeColmillos);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumeroCamada() {
        return numeroCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "Los lobos de camada " + this.numeroCamada + " comen junto sus otros compañeros";
    }

    @Override
    public String dormir() {
        return "El " + this.nombreCientifico + " duerme 10hs por dia";
    }

    @Override
    public String correr() {
        return "El " + this.especieLobo + " corre al sentirse amenazado";
    }

    @Override
    public String comunicarse() {
        return "La camada " + this.numeroCamada + " se comunica a través de gruñidos agudos";
    }
}
