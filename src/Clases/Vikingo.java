package Clases;
import Interfaces.IHabilidadEspecial;
import Interfaces.IOrinar;
import Interfaces.IBeber;

public class Vikingo extends Humano{
    private int bebedorProfesional;

    public Vikingo(String nombre, int edad, int peso, IOrinar orinar, IBeber beber, IHabilidadEspecial habilidad, int bebedorProfesional) {
        super(nombre, edad, peso, orinar, beber, habilidad);
        this.bebedorProfesional = bebedorProfesional;
    }

    public int getBebedorProfesional() {
        return bebedorProfesional;
    }

    public void setBebedorProfesional(int bebedorProfesional) {
        this.bebedorProfesional = bebedorProfesional;
    }

    @Override
    public String toString() {
        return super.toString()+ "Vikingo{" +
                "bebedorProfesional=" + bebedorProfesional +
                '}';
    }



}
