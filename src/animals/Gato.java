package animals;
// Clase hija (Subclase)
public class Gato extends Animal {
    private String color;

    public Gato(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void hacerSonido(){
        System.out.println(getNombre() + " esta maullando. Miauuuu");
    }

    public void mostrarColor(){
        System.out.println(getNombre() + "tiene un pelaje de color " + color);
    }
}
