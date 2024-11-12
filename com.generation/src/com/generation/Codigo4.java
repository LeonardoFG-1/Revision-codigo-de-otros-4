// Este programa simula el juego de "Piedra, Papel o Tijeras" entre dos jugadores.
// Se pide a cada jugador que ingrese su elección, y el programa determina el ganador 
// o si hubo un empate basado en las reglas del juego.

package com.generation;

import java.util.Scanner;

public class Codigo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar entrada del jugador 1
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para evitar problemas de comparación

        // Solicitar entrada del jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = scanner.nextLine().toLowerCase();

        // Comparar las elecciones de ambos jugadores
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int ganador = 2; // Asumir que el jugador 2 gana por defecto

            // Evaluar la elección del jugador 1 y comparar con la elección del jugador 2
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        ganador = 1;
                    }
                    break;

                case "papel":
                    if (j2.equals("piedra")) {
                        ganador = 1;
                    }
                    break;

                case "tijeras":
                    if (j2.equals("papel")) {
                        ganador = 1;
                    }
                    break;

                default:
                    System.out.println("Entrada no válida de " + j1);
                    return;
            }

            System.out.println("Gana el jugador " + ganador);
        }

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}