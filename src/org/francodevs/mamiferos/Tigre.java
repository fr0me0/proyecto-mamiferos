package org.francodevs.mamiferos;

public class Tigre extends Mamifero {

    private String especieTigre;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El " + this.especieTigre + " se alimenta de animales de hasta 1 tonelada";
    }

    @Override
    public String dormir() {
        return "Su habitat natural para dormir es " + this.habitat;
    }

    @Override
    public String correr() {
        return "A pesar de su peso de " + this.peso + " puede correr a 65km/h";
    }

    @Override
    public String comunicarse() {
        return "Utiliza ronroneo para comunicarse";
    }
}
