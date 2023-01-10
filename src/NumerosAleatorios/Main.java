package NumerosAleatorios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Metodos.Mismetodos;
import java.util.Random;
public class Main {

    public static void main(String[] args) throws IOException {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        /*for(int i=0 ;i<=20; i++){

            int valorEntero = (int) Math.floor(Math.random()*(10+1));
            System.out.print("\n"+valorEntero);

        }*/

            aleatorios();













    }

    public static void aleatorios() {
        int valorentero = 0;
        int numeromayor = 100, numeromenor =199 ,suma=0;
        for (int i = 0; i <= 50; i++) {

            valorentero = (int) Math.floor(Math.random() * (199 - 100 + 1) + 100);
            if (valorentero > numeromayor) {
                numeromayor = valorentero;
            } else if (valorentero < numeromenor) {
                numeromenor = valorentero;

            }
            System.out.print(" "+valorentero);
            suma+=valorentero;

        }

        Mismetodos.Imprime("\nel numero mayor es " +numeromayor);
        Mismetodos.Imprime("\nel numero menor es " +numeromenor);
        Mismetodos.Imprime("\nla media es de " +((suma/50)));
    }


    }


