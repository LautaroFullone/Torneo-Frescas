import Clases.Espartano;
import Clases.Humano;
import Clases.Vikingo;
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
        luis.beber();
        espartanos.add(kevin);
        espartanos.add(luis);

    }
}

    public static Humano competir(Humano persona1,Humano persona2){
        Humano ganador=null ;

        //Habilidades especiales
        System.out.println("El combate esta por empezar \nActivando  Habilidades especiales ");
persona1 = new Vikingo();
        persona1.activarHabilidadEspecial();
        persona2.activarHabilidadEspecial();

        int limiteV = v.getLimiteV();
        int limiteE = e.getLimiteE();
        int rondas = limiteV + limiteE;

        System.out.println("\n\n\n-----------Empieza el Combate de " + rondas +" rondas -----------");
        for (int i =0 ; i <  rondas; i++){


            System.out.println("--> RONDA "+(i+1)+" <--");
            vik.beber();
            limiteV--;

            esp.beber();
            limiteE--;

            // Cuando llegan al limite van a Orinar
            if(limiteV == 0){
                v.orinar();
            }
            if(limiteE == 0){
                e.orinar();
            }
            //verifico quien gano
            if (limiteV == 0 && limiteE >0){
                rondas = i+1;
                ganador = e;
                break;
            }
            if(limiteE == 0 && limiteV >0){
                rondas = i+1;
                ganador= v;
                break;
            }
            if(limiteE ==0 && limiteV==0 ){
                System.out.println("\033[32m EMPATE ,por llevar sangre Vikinga y porque la taberna fue construida por Vikingos ...  ");
                rondas = i+1;
                ganador= v;
                break;
            }
        }
        System.out.println("\033[32m Ganador "+ ganador.getNombre() + " el "+  ganador.getClass().getSimpleName() + " \u001B[0m");
        System.out.println("Total de rondas -> "+rondas);
        System.out.println("-----------Termina el  Combate -----------");


        return ganador;

    }