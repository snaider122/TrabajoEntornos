
package com.mycompany.java_github;

public class Ej_C51_Piramide_asteriscos {

    public static void main(String[] args) {
        
            int altura=10;
            int i=0,j=0,k=0;
            
            for (i=0;i<altura;i++) {
                for (j=0;j<altura-i;j++) {
                    System.out.print(" ");
                }
                for (k=0;k<=(2*i);k++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
    }    
}
