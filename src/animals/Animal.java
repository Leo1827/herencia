package animals;
// clase base o superclase
public class Animal {

    private String nombre;

    public Animal(String name) {
        this.nombre = name;
    }

    public void hacerSonido(){
        System.out.println(this.nombre + "Hace un sonido.");
    }

    public void mostrarNombre(){
        System.out.println("El nombre del animal es: " + this.nombre);
    }

    public void moverse(){
        System.out.println("El animal se está moviendo.");
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }
}
