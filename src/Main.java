
import humanos.Empleado;
import parqueadero.Carro;
import parqueadero.Moto;

public class Main {
    public static void main(String[] args){
        Carro car = new Carro("Mazda", 4);
        Moto mot = new Moto("NKD");

        car.acelerar(50); // metodo heredado
        car.abrirMaletero(); // metodo propio
        mot.acelerar(35); // metodo heredado
        mot.hacerCaballito(); // metodo propio
        mot.frenar(); // metodo heredado
    }
}
