package animals;
// Clase hija (Subclase)
public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, String raza){
        super(nombre);
        this.raza = raza;
    }

    // Sobreescribir un metodo de la superclase
    @Override
    public void hacerSonido(){
        System.out.println(getNombre() + " está ladrando Guau!!!!");
    }

    public void mostrarRaza(){
        System.out.println(getNombre() + " es de la raza " + this.raza);
    }


}
