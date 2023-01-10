package JuegoPiedraPapelaTijera;

import Metodos.Mismetodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class PiedraPapelTijera {
    public static void main(String[] args)throws IOException {
        PiedraPapelTijera p = new PiedraPapelTijera();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int tiradapc = (int) Math.floor(Math.random() * 3 + 1);
        String tiradajugador;

        do{
            Mismetodos.Imprime("Introduce piedra papel tijera\n Piedra(1)\n Papel(2)\n Tijera(3)");
            tiradajugador =br.readLine();
        }while(Integer.valueOf(tiradajugador) !=1 && Integer.valueOf(tiradajugador) !=2 && Integer.valueOf(tiradajugador) !=3);
        int tj=Integer.parseInt(tiradajugador);
            p.Tirada(tj);










    }
    public  void Tirada(int n ){
        String resultado;
        switch (n){
            case 1->{
                resultado="piedra";
                Mismetodos.Imprime("Has escogido piedra");}
            case 2->
            {resultado="papel";
                Mismetodos.Imprime("Has escogido papel");}
            case 3->{
                resultado="tijera";
                Mismetodos.Imprime("Has escojido tijera");}

                default->{
                System.err.print("Introduzca un valor valido");}
        }
    }

}
