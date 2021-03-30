package Clases;

import Implementaciones.BeberVikingoImp;
import Implementaciones.HabilidadEspecialDueño;
import Implementaciones.OrinarEspartanoImp;
import Interfaces.IBeber;
import Interfaces.IHabilidadEspecial;
import Interfaces.IOrinar;

public class DueñoTaberna extends Humano{
    private int bebedorProfesional;
    private int toleranciaExtra;


    public DueñoTaberna(String nombre, int edad, int peso, IOrinar orinar, IBeber beber, IHabilidadEspecial habilidadEspecial, int bebedorProfesional, int toleranciaExtra) {
        super(nombre, edad, peso, orinar, beber, habilidadEspecial);
        this.bebedorProfesional = bebedorProfesional;
        this.toleranciaExtra = toleranciaExtra;
    }

    public int getBebedorProfesional() {
        return bebedorProfesional;
    }

    public void setBebedorProfesional(int bebedorProfesional) {
        this.bebedorProfesional = bebedorProfesional;
    }

    public int getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(int toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }
}
