package org.francodevs.mamiferos;

public class EjemploMamiferos {

    public static void main(String[] args) {

        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero leon = new Leon(
                "Sabana Africana",
                1.2,
                1.8,
                190.55,
                "Panthera leo",
                0.20,
                80,
                6,
                114
        );

        Mamifero lobo = new Lobo(
                "Alto ártico",
                0.80,
                1.6,
                45,
                "Canis lupus",
                "Gris oscuro",
                0.04,
                6,
                "Lobo gris"
        );

        Mamifero tigre = new Tigre(
                "Sabana africana",
                1.10,
                3.9,
                300,
                "Panthera tigris",
                "Tigre de Amur"
        );

        Mamifero guepardo = new Guepardo(
                "Sabana africana",
                0.94,
                1.5,
                72,
                "Acinonyx jubatus",
                0.25,
                130
        );

        Mamifero perroAfricano = new Perro(
                "África subsahariana",
                0.90,
                1.41,
                30,
                "Lycaon pictus",
                "Marron y negro",
                0.05,
                328
        );

        mamiferos[0] = leon;
        mamiferos[1] = lobo;
        mamiferos[2] = tigre;
        mamiferos[3] = guepardo;
        mamiferos[4] = perroAfricano;

        for (Mamifero animal : mamiferos) {

            System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println("Altura: " + animal.getAltura());
            System.out.println("Largo: " + animal.getLargo());
            System.out.println("Peso: " + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Colmillos: " + ((Canino) animal).getSizeColmillos());
                System.out.println("Color: " + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie Lobo: " + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Número Integrantes: " + ((Lobo) animal).getNumeroCamada());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida kg: " + ((Perro) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño Garras: " + ((Felino) animal).getSizeGarras());
                System.out.println("Velocidad: " + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia Rugido: " + ((Leon) animal).getPotenciaRugido());
                    System.out.println("Número Integrantes: " + ((Leon) animal).getNumeroManada());
                }
                if (animal instanceof Tigre) {
                    System.out.println("especie Tigre: " + ((Tigre) animal).getEspecieTigre());
                }
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }

    }

}
