package Implementaciones;

import Interfaces.IOrinar;

public class OrinarVikingoImp implements IOrinar {
    @Override
    public void orinar() {
        System.out.println("El vikingo se fue a regar un arbol! \n");
    }
}
