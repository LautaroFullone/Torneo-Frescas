package Implementaciones;

import Clases.Humano;
import Clases.Vikingo;

public class HabilidadEspecialVikingo {

    public void activarHabilidadEspecial(Vikingo vikingo) {

        int limit = vikingo.getLimite();
        int level_bebedor = vikingo.getBebedorProfesional();

        if (level_bebedor <= 0 || limit < 5){
            vikingo.setLimite(limit + (level_bebedor+8)*3);
        }else {
            vikingo.setLimite(limit*2);
        }

        System.out.println("Tolerancia extra  limite  de \033[34m"+vikingo.getNombre() +"\u001B[0m aumenta "+ limit +" --> \033[31m " + vikingo.getLimite() +"\u001B[0m");
    }
}
