package Implementaciones;

import Clases.DueñoTaberna;
import Clases.Humano;
import Clases.Vikingo;
import Interfaces.IHabilidadEspecial;

public class HabilidadEspecialDueño implements IHabilidadEspecial {
    @Override
    public void activarHabilidadEspecial(Humano humano) {
        if (humano instanceof DueñoTaberna) {
            DueñoTaberna dueño = (DueñoTaberna) humano;

            int limit = dueño.getLimite();
            int level_bebedor = dueño.getBebedorProfesional();
            int tolerancia = dueño.getToleranciaExtra();


            if (level_bebedor <= 0 || level_bebedor < 5 && tolerancia >= 5) {
                dueño.setLimite(limit + (level_bebedor + 8) * 3);
                dueño.setLimite(limit + tolerancia);
            } else {
                dueño.setLimite(limit * 2);
                dueño.setLimite(limit * tolerancia);
            }

            System.out.println("El nivel de bebedor de \033[34m" + dueño.getNombre() + "\u001B[0m aumenta de " + limit + " a \033[31m " + dueño.getLimite() + "\u001B[0m");
        } else
            System.out.println("ERROR EN " + getClass());


    }
}
