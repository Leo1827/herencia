package animals;
// clase base o superclase
public class Animal {

    private String nombre;

    public Animal(String name) {
        this.nombre = name;
    }

    public void hacerSonido(){
        System.out.println(this.nombre + " hace un sonido.");
    }

    public void mostrarNombre(){
        System.out.println("El nombre del animal es: " + this.nombre);
    }

    public void moverse(){
        System.out.println("El animal se está moviendo.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }
}
