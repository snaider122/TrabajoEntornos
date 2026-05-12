
package com.mycompany.java_github;

import java.util.Scanner;

public class Ej_A13_Num_dia_semana {


    public static void main(String[] args) {
        
        Scanner estatic=new Scanner(System.in);
        
        System.out.println("Introduzca el número del día de la semana (del 1 al 7)");
        int dia=estatic.nextInt();
        
        if (dia>=1 && dia<=5) {
            System.out.println("El día es laborable");
        } else if (dia>=6 && dia<=7) {
            System.out.println("¡Por fin es finde!");
        } else {
            System.out.println("No es un día válido");
        }
    }
    
}
    
    

