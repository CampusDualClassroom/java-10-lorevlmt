package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {

        //contador para el color azul
        int colorAzul = 0;

        do {

            /*//////////////////////////////////////////////////
            ->DUDA: ¿¿Sería más correcto:

            String color = getBall();

            (como me indicas en teams) y luego utilizar color en el if??
            //////////////////////////////////////////////////*/

            System.out.println("La bola es de color: " + getBall());
            if (getBall().equalsIgnoreCase("azul")) {
                colorAzul++;
            }
        } while (colorAzul < 2);

    }

    // Un metodo que devuelva una cadena de texto con el color de una pelota (en minúscula). Dicho color se escogerá de
    // manera aleatoria. Se empleará el metodo randomWithRange(int min, int max) para escoger un número aleatorio, que
    // lo asociaremos al valor de un color de la siguiente manera:
    // 1 → rojo
    // 2 → azul
    // 3 → verde
    public static String getBall() {

        int colorBola = randomWithRange(1, 4);

        switch (colorBola) {
            case 1: {
                return "rojo";
            }
            case 2: {
                return "azul";
            }
            case 3: {
                return "verde";
            }
            default:
                throw new IllegalArgumentException("Unexpected value: " + colorBola);
        }

        //->DUDA: ¿En este caso no es necesario break porque utilizamos return en lugar de System.out.println()??
    }

    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min,max);
    }
}