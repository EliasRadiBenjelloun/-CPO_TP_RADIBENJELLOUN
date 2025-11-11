/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_radibenjelloun_elias;

/**
 *
 * @author eradi
 */
public class TP2_relation_1_RADIBENJELLOUN_ELIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        Personne bob = new Personne("Sixkiller", "Bobby");
        Personne reno = new Personne("Raines", "Reno");

        System.out.println("liste des voitures disponibles :\n" 
            + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);  
        // TODO code application logic here
    }
    
}
