package Clases;

import Implementaciones.BeberEspartanoImp;
import Implementaciones.BeberVikingoImp;
import Implementaciones.OrinarEspartanoImp;
import Implementaciones.OrinarVikingoImp;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Humano>vikingos= new ArrayList<Humano>();
        ArrayList<Humano>espartanos= new ArrayList<Humano>();

        Humano valentina = new Vikingo("Valentina", 18, 60, new OrinarVikingoImp(), new BeberVikingoImp(), 1);
        Humano mirta = new Vikingo("Mirta", 58, 65, new OrinarVikingoImp(), new BeberVikingoImp(), 0);

        vikingos.add(valentina);
        vikingos.add(mirta);

        Humano kevin = new Espartano("Kevin", 20, 70, new OrinarEspartanoImp(), new BeberEspartanoImp(), 2);
        Humano luis = new Espartano("Luis", 61, 82, new OrinarEspartanoImp(), new BeberEspartanoImp(), 15);

        espartanos.add(kevin);
        espartanos.add(luis);
    }
}
