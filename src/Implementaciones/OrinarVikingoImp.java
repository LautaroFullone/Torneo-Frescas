package Implementaciones;

import Interfaces.IOrinar;

public class OrinarVikingoImp implements IOrinar {
    @Override
    public void orinar() {
        System.out.println("\n"+"\033[33mEl vikingo se fue a regar un arbol! \u001B[0m");
    }
}
