package Tragaperras;

import Metodos.Mismetodos;

import java.io.IOException;

public class tragaperras {
    public static void main(String[] args) throws IOException {
        int numero;





        do{


                int caso1 = 0, caso2 = 0, caso3 = 0, caso4 = 0, caso5 = 0;
                for (int i = 1; i <= 3; i++) {

                    numero = (int) Math.floor(Math.random() * 4);
                    switch (numero) {
                        case 0 -> {
                            Mismetodos.Imprime("<--> ");
                            caso1++;
                        }
                        case 1 -> {
                            Mismetodos.Imprime("<XD> ");
                            caso2++;
                        }
                        case 2 -> {
                            Mismetodos.Imprime("<=D-> ");
                            caso3++;
                        }
                        case 3 -> {
                            Mismetodos.Imprime("<(|)> ");
                            caso4++;
                        }
                        case 4 -> {
                            Mismetodos.Imprime("<(.)(.))> ");
                            caso5++;
                        }
                    }
                }
                if (caso1 == 3 || caso2 == 3 || caso3 == 3 || caso4 == 3 || caso5 == 3) {
                    Mismetodos.Imprime("\nEnhorabuena has ganado 10 monedas");
                } else if (caso1 == 2 || caso2 == 2 || caso3 == 2 || caso4 == 2 || caso5 == 2) {
                    Mismetodos.Imprime("\nEnhorabuena recuperas la moneda");
                } else if (caso1 == 1 || caso2 == 1 || caso3 == 1 || caso4 == 1 || caso5 == 1) {
                    Mismetodos.Imprime("\nLo siento has perdiddo");
                }

        }while(Mismetodos.repetirproceso());


        Mismetodos.Imprime("Gracias por participar");





    }
}