package parqueadero;

public class Vehiculo {

    protected String marca;
    protected int velocidad;

    public Vehiculo(String marca){
        this.marca = marca;
        this.velocidad = 0;
    }

    public void acelerar(int incremento){
        velocidad += incremento;
        System.out.println("Velocidad actual: " + velocidad + " km/h");
    }

    public void frenar(){
        velocidad = 0;
        System.out.println("EL vehiculo se detuvo");
    }
}
