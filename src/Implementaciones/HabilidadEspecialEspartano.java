package Implementaciones;

import Clases.Espartano;
import Clases.Humano;
import Clases.Vikingo;
import Interfaces.IHabilidadEspecial;

public class HabilidadEspecialEspartano implements IHabilidadEspecial {

    @Override
    public void activarHabilidadEspecial(Humano humano) {
        if (humano instanceof Espartano) {
            Espartano espartano = (Espartano) humano;

            int limit = espartano.getLimite();
            int tolerancia = espartano.getToleranciaExtra();

            if (tolerancia >= 5) {
                espartano.setLimite(limit + tolerancia);
            } else if (tolerancia <= 0) {
                espartano.setLimite(limit++);
            } else {
                espartano.setLimite(limit * tolerancia);

            }
            System.out.println("La tolerancia extra de \033[34m" + espartano.getNombre() + "\u001B[0m aumenta de " + limit + " a \033[31m " + espartano.getLimite() + "\u001B[0m");
        }
    }
}
