//1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
//Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá
//mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
//una clase Main que realice lo siguiente:


package ClaseCaballo;

import Animal.Animal;


public class Caballo extends Animal {

    public Caballo() {
        super();
    }

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String toString() {
        return "Caballo{" +super.toString()+ '}';
    }

    
    
    @Override
    public void alimentarse() {
       System.out.println("El "+ getClass().getSimpleName()+ " " + getNombre() + " se alimenta de " + alimento);
    }

}
