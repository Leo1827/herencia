package parqueadero;

public class Carro extends Vehiculo {
    private int puertas;

    public Carro(String marca, int puertas){
        super(marca);
        this.puertas = puertas;
    }

    public void abrirMaletero() {
        System.out.println("Maletero abierto");
    }


}
