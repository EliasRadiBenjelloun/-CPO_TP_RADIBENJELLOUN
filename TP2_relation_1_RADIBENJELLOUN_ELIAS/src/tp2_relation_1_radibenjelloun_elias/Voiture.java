/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_radibenjelloun_elias;

/**
 *
 * @author eradi
 */
public class Voiture {
    String modele;
    String marque;
    int puissance;
    Personne proprietaire; 

    public Voiture(String unModele, String uneMarque, int unePuissance) {
        modele = unModele;
        marque = uneMarque;
        puissance = unePuissance;
        proprietaire = null; 
    }

    @Override
    public String toString() {
        return modele + " " + marque + " (" + puissance + "CV)";
    }
    
}
