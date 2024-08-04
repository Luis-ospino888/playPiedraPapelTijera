package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bloque 1: recibir datos del usuario
        Scanner lea=new Scanner(System.in);
        String nombreJugador;
        String opcionJugador;
        String opcionPC;
        final String nombrePC="PCplayer";
        int contador=0;
        int n; // iteraciones del juego para limitar las veces que quiere jugar el usuario ante la PC
        boolean bandera=true; // se cambia la bandera a true para hacer logica inversa
                            // debido a que necesitamos validar dentro del while, y poder entrar al while sin perder la condición de la bandera
                            // para los demás ciclos; esto nos favorece porque la condicion del while es un && and.
        int contadorUser=0;
        int contadorPC=0;
        int contadorEmpate=0;

        System.out.println("\n************************          *         ************************");
        System.out.println("************************ SCISSORS PAPER GAME ***********************");
        System.out.println("************************          *         ************************\n");

        System.out.print("Digita tu Username: ");
        nombreJugador= lea.nextLine();
       System.out.print(nombreJugador+", ¿Cuantas veces deseas jugar?: ");
       n = lea.nextInt(); // asignamos las veces que quiere jugar el usuario a la variable i
                                     // que posteriormente se usará en el while para limitar los ciclos
       lea.nextLine();
        // Bloque 4: Implementar ciclo (3 repeticiones)

        while(contador<n && bandera==true){
            contador+=1;
                System.out.print("Elige (Piedra, papel o tijera) opción " + contador + ": ");
                opcionJugador = lea.nextLine().toLowerCase();
               // lea.nextLine();
                //System.out.println(opcionJugador);
                    // validamos nuevamente cada opción de acuerdo a la sintaxis del jugdor:
                    if (opcionJugador.equals("piedra") || opcionJugador.equals("papel") || opcionJugador.equals("tijera")){
                     bandera=true;
                    }else{
                      bandera=false;
                     }

                     // Bloque 5: Generando la opción aleatoria del PC

                        Random aleatoria=new Random();
                         int numeroAleatorio= aleatoria.nextInt(3);
                            //System.out.println(numeroAleatorio);

                    if (numeroAleatorio==0){
                    opcionPC="piedra";
                    } else if (numeroAleatorio==1) {
                    opcionPC="papel";
                    }else {
                     opcionPC="tijera";
                    }
            System.out.println("----------------------");
            System.out.println(nombreJugador+" elegiste: "+opcionJugador);
            System.out.println(nombrePC+" eligió: "+opcionPC);
            System.out.println("----------------------");

            // Bloque 6: Elegir ganador

            if (opcionJugador.equals("piedra") && opcionPC.equals("piedra")){
                System.out.println("EMPATE\n");
                contadorEmpate++;
            } else if (opcionJugador.equals("piedra") && opcionPC.equals("papel")) {
                System.out.println("GANÓ "+nombrePC+"\n");
                contadorPC++;
            }else if (opcionJugador.equals("piedra") && opcionPC.equals("tijera")) {
                System.out.println("GANÓ "+nombreJugador+"\n");
                contadorUser++;
            }else if (opcionJugador.equals("papel") && opcionPC.equals("piedra")) {
                System.out.println("GANÓ "+nombreJugador+"\n");
                contadorUser++;
            }else if (opcionJugador.equals("papel") && opcionPC.equals("papel")) {
                System.out.println("EMPATE\n");
                contadorEmpate++;
            }else if (opcionJugador.equals("papel") && opcionPC.equals("tijera")) {
                System.out.println("GANÓ "+nombrePC+"\n");
                contadorPC++;
            }else if (opcionJugador.equals("tijera") && opcionPC.equals("piedra")) {
                System.out.println("GANÓ "+nombrePC+"\n");
                contadorPC++;
            }else if (opcionJugador.equals("tijera") && opcionPC.equals("papel")) {
                System.out.println("GANÓ "+nombreJugador+"\n");
                contadorUser++;
            }else if (opcionJugador.equals("tijera") && opcionPC.equals("tijera")) {
                System.out.println("EMPATE\n");
                contadorEmpate++;
            }else {
                System.out.println("UPPSSS DIGITE UNA OPCIÓN CORRECTA");
            }
        }

        System.out.println(nombreJugador+" usted ganó --> "+contadorUser+" veces");
        System.out.println(nombrePC+" ganó --> "+contadorPC+" veces");
        System.out.println("Hubo --> "+contadorEmpate+" empates");
    }

    }
