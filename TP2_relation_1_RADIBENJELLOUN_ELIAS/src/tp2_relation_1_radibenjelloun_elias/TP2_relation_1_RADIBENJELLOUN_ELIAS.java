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
        bob.liste_voitures[0] = uneClio;
bob.nbVoitures = 1;
uneClio.proprietaire = bob;
bob.liste_voitures[1] = uneMicra;
bob.nbVoitures = 2;
uneMicra.proprietaire = bob;

reno.liste_voitures[0] = une2008;
reno.nbVoitures = 1;
une2008.proprietaire = reno;
System.out.println("La première voiture de Bob est : " + bob.liste_voitures[0]);
System.out.println("Propriétaire de la Micra : " + uneMicra.proprietaire);
bob.ajouter_voiture(uneClio);
bob.ajouter_voiture(uneMicra);
reno.ajouter_voiture(une2008);

// TODO code application logic here
    }
    
}
