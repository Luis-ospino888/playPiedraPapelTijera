package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bloque 1: recibir datos del usuario
        Scanner lea=new Scanner(System.in); // ingreso por teclado
        String nombreJugador;
        String opcionJugador;
        String opcionPC;
        final String nombrePC="Rolando";

        boolean bandera=false;

        //Interfaz de bienvenida

        System.out.println("\n************************          *         ************************");
        System.out.println("************************ SCISSORS PAPER GAME ***********************");
        System.out.println("************************          *         ************************\n");

        System.out.print("Digita tu Username: ");
        nombreJugador= lea.nextLine();
        System.out.print("Juega, escribe tu opción de juego (Piedra, Papel, Tijera): ");
        opcionJugador= lea.nextLine().toLowerCase();

        // Bloque 2: clasificar y validar datos ingresados (Clasificar = if, validar = if, comparar = if)
        // Bloque 3: Crear bandera

        if (opcionJugador.equals("piedra") || opcionJugador.equals("papel") || opcionJugador.equals("tijera")){
            bandera=true;
        }else{
            bandera=false;
        }

        // Bloque 4: Implementar ciclo (3 repeticiones)
        int contador=0;
        while(contador<3 && bandera==true){
            contador+=1;

            // Bloque 5: Generando la opción aleatoria del PC

            Random aleatoria=new Random();
            int numeroAleatorio= aleatoria.nextInt(3);
           // System.out.println(numeroAleatorio);

            if (numeroAleatorio==0){
               opcionPC="piedra";
            } else if (numeroAleatorio==1) {
                opcionPC="papel";
            }else {
                opcionPC="tijera";
            }
            System.out.println("El usuario elige: "+opcionJugador);
            System.out.println("El computador elige: "+opcionPC);
            System.out.println("----------------------");
            // Bloque 6: Elegir ganador
            if (opcionJugador.equals("piedra") && opcionPC.equals("piedra")){
                System.out.println("EMPATE");
            } else if (opcionJugador.equals("piedra") && opcionPC.equals("papel")) {
                System.out.println("GANÓ "+nombrePC);
            }else if (opcionJugador.equals("piedra") && opcionPC.equals("tijera")) {
                System.out.println("GANÓ "+nombreJugador);
            }else if (opcionJugador.equals("papel") && opcionPC.equals("piedra")) {
                System.out.println("GANÓ "+nombreJugador);
            }else if (opcionJugador.equals("papel") && opcionPC.equals("papel")) {
                System.out.println("EMPATE");
            }else if (opcionJugador.equals("papel") && opcionPC.equals("tijera")) {
                System.out.println("GANÓ "+nombrePC);
            }else if (opcionJugador.equals("tijera") && opcionPC.equals("piedra")) {
                System.out.println("GANÓ "+nombrePC);
            }else if (opcionJugador.equals("tijera") && opcionPC.equals("papel")) {
                System.out.println("GANÓ "+nombreJugador);
            }else if (opcionJugador.equals("tijera") && opcionPC.equals("tijera")) {
                System.out.println("EMPATE");
            }else {
                System.out.println("uppss");
            }
        }


    }

    }
