import Clases.*;
import Implementaciones.*;
import Interfaces.IHabilidadEspecial;
import com.sun.security.jgss.GSSUtil;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Humano>vikingos= new ArrayList<Humano>();
        ArrayList<Humano>espartanos= new ArrayList<Humano>();


        Humano valentina = new Vikingo("Valentina", 18, 60, new OrinarVikingoImp(), new BeberVikingoImp(), new HabilidadEspecialVikingo(), 1);
        vikingos.add(valentina);
        Humano mirta = new Vikingo("Mirta", 58, 65, new OrinarVikingoImp(), new BeberVikingoImp(),new HabilidadEspecialVikingo(), 0);
        vikingos.add(mirta);

        Humano kevin = new Espartano("Kevin", 20, 70, new OrinarEspartanoImp(), new BeberEspartanoImp(),new HabilidadEspecialEspartano(), 2);
        espartanos.add(kevin);
        Humano luis = new Espartano("Luis", 61, 82, new OrinarEspartanoImp(), new BeberEspartanoImp(),new HabilidadEspecialEspartano(), 25);
        espartanos.add(luis);

        Humano ganador = competir(mirta, luis);
        Humano hugo = new DueñoTaberna("Hugo", 76, 150, new OrinarEspartanoImp(), new BeberVikingoImp(), new HabilidadEspecialDueño(),9,6);

        System.out.println("\n\n----------------------------------------------------------------");
        System.out.println("El dueño del bar ha desafiado al ganador a una pelea mas! EL GANADOR VUELVE A SU ESTADO ORIGINAL");
        ganador.setBebidaEnCuerpo(0);

        Humano nuevoGanador = competir(hugo, ganador);



    }


    public static Humano competir(Humano persona1,Humano persona2) {
        Humano ganador = null;

        //Habilidades especiales
        System.out.println("El combate esta por empezar \nActivando  Habilidades especiales ");

        persona1.habilidadEspecial();
        persona2.habilidadEspecial();

        int limite1 = persona1.getLimite();
        int limite2 = persona2.getLimite();

        int rondas = limite1 + limite2;
        boolean seguir = true;
        int i = 0;
        System.out.println("\n\n\n-----------Empieza el Combate de " + rondas + " rondas -----------");

        while (i <= rondas && seguir) {
            System.out.println("--> RONDA " + (i + 1) + " <--");
            persona1.beber();
            persona1.setBebidaEnCuerpo(persona1.getBebidaEnCuerpo() + 1);
            limite1--;

            persona2.beber();
            persona2.setBebidaEnCuerpo(persona1.getBebidaEnCuerpo() + 1);
            limite2--;

            // Cuando llegan al limite van a Orinar
            if (limite1 == 0) {
                persona1.orinar();
                seguir = false;
            }
            if (limite2 == 0) {
                persona2.orinar();
                seguir = false;
            }
            i++;
        }
        System.out.println(limite1);
        System.out.println(limite2);

        //verifico quien gano
        if (limite1 == 0 && limite2 > 0) {
            ganador = persona2;
        }
        if (limite2 == 0 && limite1 > 0) {
            ganador = persona1;
        }
        if (limite2 == 0 && limite1 == 0) {
            if (persona1 instanceof Vikingo) {
                System.out.println("\033[32mEMPATE ,por llevar sangre Vikinga y porque la taberna fue construida por Vikingos ...  ");
                ganador = persona1;
            }
            if (persona1 instanceof Espartano) {
                System.out.println("\033[32mEMPATE ,por llevar sangre Espartana y porque la taberna fue construida por Espartanos ...  ");
                ganador = persona1;
            }
            if (persona1 instanceof DueñoTaberna) {
                System.out.println("\033[32mEMPATE ,por ser el dueño pero buena persona, cede la victoria a su contrincante ...  ");
                ganador = persona2;
            }
        }
        System.out.println("\033[32mThe WINNER is " + ganador.getNombre() + " con " + ganador.getBebidaEnCuerpo() + " de alcohol en sangre!!!!!!!! \u001B[0m");
        return ganador;
    }

}

