package Clases;
import Interfaces.IHabilidadEspecial;
import Interfaces.IOrinar;
import Interfaces.IBeber;

public class Espartano extends Humano{
    private int toleranciaExtra;

    public Espartano(String nombre, int edad, int peso, IOrinar orinar, IBeber beber, IHabilidadEspecial habilidad, int toleranciaExtra) {
        super(nombre, edad, peso, orinar, beber, habilidad);
        this.toleranciaExtra = toleranciaExtra;
    }

    public int getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(Integer toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }

    public void activarHabilidadEspecial() {

        int oldLimit = this.limite;

        if(this.toleranciaExtra >= 5){
            this.limite += this.toleranciaExtra;
        }else if(this.toleranciaExtra <= 0) {
            this.limite ++;
        }else {
            this.limite *= this.toleranciaExtra;
        }
        System.out.println("Tolerancia extra: limite \033[34m"+this.getNombre() +"\u001B[0m aumenta "+oldLimit + " --> \033[31m " + this.limite +"\u001B[0m");
    }

    @Override
    public String toString() {
        return super.toString()+ "Espartano{" +
                "toleranciaExtra=" + toleranciaExtra +
                '}';
    }
}
