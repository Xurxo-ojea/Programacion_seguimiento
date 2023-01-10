package Dados;

import Metodos.Mismetodos;

import java.io.IOException;

public class TiradadeTresdados {
    public static void main(String[] args) throws IOException {

        int dado1,dado2,dado3;
        do {
            dado1 = (int) Math.floor(Math.random() * 6 + 1);
            dado2 = (int) Math.floor(Math.random() * 6 + 1);
            dado3 = (int) Math.floor(Math.random() * 6 + 1);
            Mismetodos.Imprime("\nDado1->" + dado1 + " \nDado2->" + dado2 + "\nDado3->" + dado3);
            Mismetodos.Imprime("\nLa suma de los tres dados es de " + (dado3 + dado1 + dado2));

        }while (Mismetodos.repetirproceso());


        Mismetodos.Imprime("Gracias por participar y vuelve pronto");
    }
}
