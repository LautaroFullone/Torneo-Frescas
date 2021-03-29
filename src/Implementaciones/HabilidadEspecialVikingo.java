package Implementaciones;

import Clases.Humano;
import Clases.Vikingo;
import Interfaces.IHabilidadEspecial;

public class HabilidadEspecialVikingo implements IHabilidadEspecial {

    public void activarHabilidadEspecial(Humano humano) {
        if (humano instanceof Vikingo) {
            Vikingo vikingo = (Vikingo) humano;

            int limit = vikingo.getLimite();
            int level_bebedor = vikingo.getBebedorProfesional();

            if (level_bebedor <= 0 || level_bebedor < 5) {
                vikingo.setLimite(limit + (level_bebedor + 8) * 3);
            } else {
                vikingo.setLimite(limit * 2);
            }

            System.out.println("El nivel de bebedor de \033[34m" + vikingo.getNombre() + "\u001B[0m aumenta de " + limit + " a \033[31m " + vikingo.getLimite() + "\u001B[0m");
        } else
            System.out.println("ERROR EN " + getClass());


    }
}
