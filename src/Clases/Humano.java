package Clases;
import Interfaces.IHabilidadEspecial;
import Interfaces.IOrinar;
import Interfaces.IBeber;

import java.util.Random;

public abstract class Humano {
    private String nombre;
    private int edad;
    private int peso;
    private IBeber beber;
    private IOrinar orinar;
    private IHabilidadEspecial habilidadEspecial;
    protected int limite;
    private int bebidaEnCuerpo;


    public Humano(){

    }

    public Humano(String nombre, int edad, int peso, IOrinar orinar, IBeber beber, IHabilidadEspecial habilidadEspecial) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.orinar = orinar;
        this.beber = beber;
        this.habilidadEspecial = habilidadEspecial;
        this.limite = new Random().nextInt(15-1)+1;
        this.bebidaEnCuerpo=0;
    }



    public void habilidadEspecial() {
        habilidadEspecial.activarHabilidadEspecial(this);
    }

    public void beber(){
        beber.beber();
    }
    public void orinar(){
        orinar.orinar();
    }

    public int getBebidaEnCuerpo() {
        return bebidaEnCuerpo;
    }

    public void setBebidaEnCuerpo(int bebidaEnCuerpo) {
        this.bebidaEnCuerpo = bebidaEnCuerpo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
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
