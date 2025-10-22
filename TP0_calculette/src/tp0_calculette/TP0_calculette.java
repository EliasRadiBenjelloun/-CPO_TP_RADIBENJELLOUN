/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author eradi
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("""
                           Please enter the operator: 
                          1) add 
                          2) substract 
                          3) multiply 
                          4) divide 
                          5) modulo""") ; 
       Scanner sc = new Scanner(System.in); 
System.out.println("entrer l'opérateur :");  
        int op = sc.nextInt();
        
        Scanner sc = new Scanner(System.in); 
System.out.println("Afficher le résultat :");  
resultat=sc.nextInt();
    }
    
}
