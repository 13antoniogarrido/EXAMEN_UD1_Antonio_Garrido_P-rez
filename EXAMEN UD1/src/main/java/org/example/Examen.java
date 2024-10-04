package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {
    public void ejercicio1(){
        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;


            }

    public void ejercicio2(){
        Scanner entrada = new Scanner(System.in);

        int numero = 0;

        boolean error=true;

        while (error==true){

            try {
                System.out.println("introduce un numero...");
                numero = entrada.nextInt();
                error=false;
                if (numero<0){
                    System.out.println("el valor absoluto es "+ ( numero = numero * (-1)));
                } else {
                    System.out.println("el valor absoluto es "+ numero);
                }
            }catch (InputMismatchException er){
                System.out.println("error, introduce un valor valido");
                entrada.nextLine();










}
        }
    }
    }


