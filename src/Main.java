
import humanos.Empleado;

public class Main {
    public static void main(String[] args){
        Empleado emple = new Empleado(
                1,
                "212",
                "Mileer",
                "Leon",
                "Calle 7",
                "234564",
                12,
                "Desarrollador",
                5.1);
        emple.getNum_legajo();
        System.out.println("Numero de legajo es: " + emple.getNum_legajo());
        emple.getNombre();

    }
}
