package Loteia;

import Metodos.Mismetodos;

import java.io.IOException;

public class Primitiva {
    public static void main(String[] args) throws IOException {
        int[] NunmeoLot;
        NunmeoLot =new int[6];
        int numero,reintegro;

        for(int i=0;i<6;i++){

                numero = (int) Math.floor(Math.random() * 49 + 1);
                boolean repetido=false;
                for(int u=0;u<6;u++){
                   if(NunmeoLot[u]==numero){
                       repetido=true;
                   }
                   if(!repetido){
                    NunmeoLot[i]=numero;

                   }

                }

                Mismetodos.Imprime("El numero " + ((i)+1) + " es " + numero + "\n");

        }
        Mismetodos.Imprime("El reintegro es " +(reintegro=(int) Math.floor(Math.random() * 10)));
    }
}





