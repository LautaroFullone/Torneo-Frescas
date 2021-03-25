package Implementaciones;

import Interfaces.IOrinar;

public class OrinarEspartanoImp implements IOrinar {
    @Override
    public void orinar() {
        System.out.println("\033[33mEl espartano se fue a regar un arbol! \u001B[0m");    }
}
