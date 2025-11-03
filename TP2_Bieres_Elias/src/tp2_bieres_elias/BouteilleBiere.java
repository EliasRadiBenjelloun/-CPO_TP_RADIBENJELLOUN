/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_elias;

/**
 *
 * @author eradi
 */
public class BouteilleBiere {
  String nom;
  double degreAlcool;
  String brasserie;
  boolean ouverte;
  public void lireEtiquette() { 
System.out.println("Bouteille de " + nom +" (" + degreAlcool + 
" degres) \nBrasserie : " + brasserie ) ;
BouteilleBiere uneBiere = new BouteilleBiere();
uneBiere.nom = "Cuvée des trolls"; 
uneBiere.degreAlcool = 7.0 ;
uneBiere.lireEtiquette();
uneBiere.brasserie="Dubuisson";
uneBiere.nonouvert=False;
}
  
}

