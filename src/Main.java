import animals.Animal;
import animals.Gato;
import animals.Perro;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal("Drome");
        Perro perro = new Perro("TObi", "Labrador");
        Gato gato = new Gato("Salome", "Amarillo");

        animal.hacerSonido();
        animal.mostrarNombre();
        perro.hacerSonido();
        gato.hacerSonido();
    }
}
