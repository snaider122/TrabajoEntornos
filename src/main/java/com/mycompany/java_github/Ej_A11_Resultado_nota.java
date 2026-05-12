
package com.mycompany.java_github;

import java.util.Scanner;

public class Ej_A11_Resultado_nota {

    public static void main(String[] args) {
        
        int nota;
        Scanner yuju=new Scanner(System.in);
        
        do {
            System.out.println("Cuanto te mide la tula bro?: ");
            nota=yuju.nextInt();

            if (nota>=0 && nota<=4) {
                System.out.println("Insuficiente");
            } else if (nota==5) {
                System.out.println("Suficiente");
            } else if (nota==6) {
                System.out.println("Bien");
            } else if (nota>=7 && nota<=8) {
                System.out.println("Notable");
            } else if (nota>=9 && nota<=10) {
                System.out.println("sobre saliente");
            } else {
                System.out.println("Tu nota no es válida");
            }
        } while (nota<0 || nota>10);
        }
    
}
