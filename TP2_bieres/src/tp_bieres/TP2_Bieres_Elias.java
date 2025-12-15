/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_bieres;

/**
 *
 * @author eradi
 */
public class TP2_Bieres_Elias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des Trolls", 7.0, "Dubuisson");
     System.out.println(uneBiere);
    
    uneBiere.Decapsuler();
     System.out.println(uneBiere);
    
        
       BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
     System.out.println(deuxiemeBiere);deuxiemeBiere.Decapsuler();
    
    
     System.out.println(uneBiere);
    
// TODO code application logic here

    }
    
}
