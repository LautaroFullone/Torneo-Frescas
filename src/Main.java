import Clases.*;
import Implementaciones.*;
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

    }


    public static Humano competir(Humano persona1,Humano persona2){
        Humano ganador=null ;

        //Habilidades especiales
        System.out.println("El combate esta por empezar \nActivando  Habilidades especiales ");

        persona1.habilidadEspecial();
        persona2.habilidadEspecial();

        int limite1 = persona1.getLimite();
        int limite2 = persona2.getLimite();

        int rondas = limite1 +limite2;
        boolean seguir = true; int i=0;
        System.out.println("\n\n\n-----------Empieza el Combate de " + rondas +" rondas -----------");

      while (i <= rondas && seguir ){
            System.out.println("--> RONDA " + (i+1) + " <--");
            persona1.beber();
            limite1--;

            persona2.beber();
            limite2--;

            // Cuando llegan al limite van a Orinar
            if(limite1 == 0){
                persona1.orinar();
                seguir = false;
            }
            if(limite2 == 0){
                persona2.orinar();
                seguir = false;
            }
            i++;
        }
        //verifico quien gano
        if (limite1==0 && limite2>0){
            ganador = persona2;
        }
        if(limite2==0 && limite1>0){
            ganador= persona1;
        }
        if(limite2==0 && limite1==0 ) {
            if (persona1 instanceof Vikingo)
                System.out.println("\033[32mEMPATE ,por llevar sangre Vikinga y porque la taberna fue construida por Vikingos ...  ");
            if (persona1 instanceof Espartano)
                System.out.println("\033[32mEMPATE ,por llevar sangre Espartana y porque la taberna fue construida por Espartanos ...  ");

            ganador = persona1;
        }

        System.out.println("\033[32mThe WINNER is "+ ganador.getNombre()+ "!!!!!!!! \u001B[0m");
        return ganador;
    }
}

