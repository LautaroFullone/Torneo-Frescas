package Clases;
import Interfaces.IOrinar;
import Interfaces.IBeber;

public abstract class Humano {
    private String nombre;
    private int edad;
    private int peso;
    private IBeber beber;
    private IOrinar orinar;

    public Humano(){

    }

    public Humano(String nombre, int edad, int peso, IOrinar orinar, IBeber beber) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.orinar = orinar;
        this.beber = beber;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public IBeber getBeber() {
        return beber;
    }

    public void setBeber(IBeber beber) {
        this.beber = beber;
    }

    public IOrinar getOrinar() {
        return orinar;
    }

    public void setOrinar(IOrinar orinar) {
        this.orinar = orinar;
    }

    @Override
    public String toString() {
        return "Humano{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", beber=" + beber +
                ", orinar=" + orinar +
                '}';
    }
}
