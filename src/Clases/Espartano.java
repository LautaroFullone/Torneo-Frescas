package Clases;
import Interfaces.IOrinar;
import Interfaces.IBeber;

public class Espartano extends Humano{
    private int toleranciaExtra;

    public Espartano(String nombre, int edad, int peso, IOrinar orinar, IBeber beber, int toleranciaExtra) {
        super(nombre, edad, peso, orinar, beber);
        this.toleranciaExtra = toleranciaExtra;
    }

    public int getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(Integer toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }

    @Override
    public String toString() {
        return super.toString()+ "Espartano{" +
                "toleranciaExtra=" + toleranciaExtra +
                '}';
    }
}
