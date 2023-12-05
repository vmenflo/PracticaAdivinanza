/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adivinaadivinanza;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author victor
 * 
 * Adivinia adivinanza. Vamos a jugar a acertar un número pensado por la 
 * máquina entre 100 y 200. Hay 4 intentos para adiviniarlo. Si se acierta, 
 * mostrar mensaje informando, en caso contrario se debe ayudar al jugador 
 * indicando si el número pensado es mayor o menor al que ha puesto. 
 * Una vez finalizada la partida, se debe preguntar si quiere jugar otra vez
 * 
 */
public class AdivinaAdivinanza {

    public static void main(String[] args) {
       
        // Creamos el objeto random
        
        Random random = new Random();
        
        Scanner teclado = new Scanner (System.in);
        
        // Numero pensado por la maquina
        
        int numeroAleatorio = random.nextInt(100,201);;
        final int INTENTOS = 4;
        int numeroJugador;
        String otraOportunidad = "SI";
        
        String bienvenida = """
                            
                            Bienvenido a Adivina adivinanza, en este juego
                            cuentas con 4 intentos para acertar que número
                            tengo en mente entre 100 y 200 .. listo?? 
                            Empecemos =D
                            
                            """;
        
        System.out.println(bienvenida);
        
       while(otraOportunidad.equalsIgnoreCase("SI")){
        
        for (int i = 1; i<=INTENTOS; i++ ) {
           
            System.out.println("¿En que número estoy pensando?");
            numeroJugador = teclado.nextInt();
            
            if (numeroAleatorio == numeroJugador){
                System.out.println("Increbile! Has Acertado");
                break;}  
            else {
            boolean masGrande = (numeroAleatorio > numeroJugador)?  true : false;
                if (masGrande) {
                    System.out.println("El numero que estoy pensando"
                            + " es mas grande");
                }else { System.out.println("El numero que estoy pensando "
                        + "es mas pequeño");}
            }
        }
        
        System.out.println("El numero que habia pensado es : " + numeroAleatorio );
        
           System.out.println("¿Quieres volver a jugar de nuevo? SI/NO");
           
           teclado.nextLine();
           otraOportunidad = teclado.nextLine();
           
          
       }
       
        System.out.println("Gracias por jugar");
    }

   
}
