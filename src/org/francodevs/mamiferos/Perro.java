package org.francodevs.mamiferos;

public class Perro extends Canino{

    private int fuerzaMordida;

    public Perro(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double sizeColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, sizeColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "Se alimenta con una fuerza en sus dientes de " + this.fuerzaMordida + "psi";
    }

    @Override
    public String dormir() {
        return "El perro de " + this.peso + "kg duerme 9hs por día";
    }

    @Override
    public String correr() {
        return "La velocidad del " + this.nombreCientifico + " es en promedio es de 48km/h";
    }

    @Override
    public String comunicarse() {
        return "Se comunica a través de gruñidos";
    }

}
