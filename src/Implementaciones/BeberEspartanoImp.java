package Implementaciones;

import Interfaces.IBeber;

public class BeberEspartanoImp implements IBeber {
    @Override
    public void beber() {
        System.out.println("\033[35mEl espartano esta bebiendo... \u001B[0m");
    }
}
