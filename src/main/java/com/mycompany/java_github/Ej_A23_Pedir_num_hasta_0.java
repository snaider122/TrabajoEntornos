
package com.mycompany.java_github;

import java.util.Scanner;

public class Ej_A23_Pedir_num_hasta_0 {


    public static void main(String[] args) {
        
        Scanner k=new Scanner(System.in);
        
        int f;
        int contador=0;
        
        do {
            System.out.println("Por favor introduzca un número se lo ruego señor amen");
            f=k.nextInt();
            contador++;
        } while (f!=0);
        System.out.println("Se han introducido "+contador+" números");
    }
    
}
