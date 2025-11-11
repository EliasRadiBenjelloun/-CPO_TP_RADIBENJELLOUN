/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_radibenjelloun_elias;

/**
 *
 * @author eradi
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures; // tableau de voitures

    public Personne(String unNom, String unPrenom) {
        nom = unNom;
        prenom = unPrenom;
        liste_voitures = new Voiture[3]; // max 3 voitures
        nbVoitures = 0;
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }
    
}
