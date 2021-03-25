package Implementaciones;

import Interfaces.IBeber;

public class BeberVikingoImp implements IBeber
{
    @Override
    public void beber() {
        System.out.println("\033[34mEl vikingo esta bebiendo...\u001B[0m");
    }
}
