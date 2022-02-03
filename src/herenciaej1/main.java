


package herenciaej1;


import Animal.Animal;
import ClaseCaballo.Caballo;
import ClaseGato.Gato;
import ClasePerro.Perro;


public class main {

    
    public static void main(String[] args) {
      Animal p1 = new Perro("Blacky","dogui", 15,"Dogo");
       
       p1.alimentarse();
       Perro p2 = new Perro("Teddy","croquetas",10, "chihuahua");
       p2.alimentarse();
       
       Animal g1= new Gato("Pelusa","galletas",15,"siames");
       g1.alimentarse();
       Animal c1= new Caballo("Tornado","pasto",13,"queseyo");
       c1.alimentarse();
    }

}
