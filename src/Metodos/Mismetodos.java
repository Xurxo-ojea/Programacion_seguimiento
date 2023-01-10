package Metodos;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public  class Mismetodos {



    public static boolean espar (int n){
        return n % 2 == 0;
    }
    public static boolean espositivo(int n){return n > 0;}
    public static int pedirNumero()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca numero");
        String n= br.readLine();
        return Integer.parseInt(n);
    }

    public static void responder(String reps) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Desea repetir la operacion");

        reps = br.readLine();
        if ((reps != "S") || reps!="s"){

        }

    }



    public static boolean repetirproceso()throws IOException {
        boolean repetir = true;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean repetirpregunta=false;
        do {

        System.out.println("\nDesea repetir la operacion");
        String resp = br.readLine();
        switch (resp) {
            case "s":

            case "S":
                repetir = true;
                repetirpregunta=false;
                break;
            case "n":

            case "N":
                repetir = false;
                repetirpregunta=false;
                break;
            default:
                repetirpregunta=true;
                System.err.println("Debe de introducir un  valor valido");

        }
        }while (repetirpregunta);
        return repetir;
    }

public static String Imprime(String frase){
        System.out.print(frase);

    return frase;
}




}