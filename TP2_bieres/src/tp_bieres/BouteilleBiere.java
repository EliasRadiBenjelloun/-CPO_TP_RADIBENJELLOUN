/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
package tp_bieres;

/**
 *
 * @author eradi
 */
 
public class BouteilleBiere {
    
    String nom;
    double degreAlcool;
    String brasserie;
    boolean nonOuverte;
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    nonOuverte = true; // la bouteille est fermée lorsqu'on la crée
}
    @Override
public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés) - Ouverte ? ";
    
    if (nonOuverte == false) {
        chaine_a_retourner += "oui";
    } else {
        chaine_a_retourner += "non";
    }
    
    return chaine_a_retourner;
}

public boolean Decapsuler() {
    if (nonOuverte == true) {
        nonOuverte = false; // on ouvre la bouteille
        System.out.println("La bière a été décapsulée !");
        return true;
    } else {
        System.out.println("Erreur : bière déjà ouverte !");
        return false;
    }
    
}


    // Méthode pour afficher les infos de la bouteille
    public void lireEtiquette() { 
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés)");
        System.out.println("Brasserie : " + brasserie);
    }
}
    

    

