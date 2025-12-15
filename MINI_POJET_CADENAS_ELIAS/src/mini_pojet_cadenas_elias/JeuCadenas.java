/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mini_pojet_cadenas_elias;

/**
 *
 * @author eradi
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class JeuCadenas {
  private List<Integer> combinaisonSecrete;  
    private int nbEssais;                      
    private boolean gagne;                    
    private int[] chiffres;
private static final int MAX_TENTATIVES = 10;
    public JeuCadenas() {
        reinitialiser();
    }
    

 
    public void genererCombinaison() {
        combinaisonSecrete = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            combinaisonSecrete.add(rand.nextInt(10)); // chiffre entre 0 et 9
        }
    }

    public int[] testerCombinaison(List<Integer> tentative) {
 if (nbEssais >= MAX_TENTATIVES) {
        return new int[] {0, 0, 0};}
        int bons = 0;
        int tropBas = 0;
        int tropHauts = 0;

        for (int i = 0; i < 4; i++) {
            int joueur = tentative.get(i);
            int secret = combinaisonSecrete.get(i);

            if (joueur == secret) {
                bons++;
            } else if (joueur < secret) {
                tropBas++;
            } else {
                tropHauts++;
            }
        }

        nbEssais++;

        if (bons == 4) {
            gagne = true;
        }

        return new int[] { bons, tropBas, tropHauts };
    }

  
    public void reinitialiser() {
        nbEssais = 0;
        gagne = false;
        genererCombinaison();
    }

    public int getNbEssais() {
        return nbEssais;
    }

    public boolean isGagne() {
        return gagne;
    }

    public List<Integer> getCombinaisonSecrete() {
        return combinaisonSecrete;
    }  
    public int getChiffre(int index){
        return this.chiffres[index];}
   public void setChiffre(int index, int valeur){
     
        this.chiffres[index]=valeur;}
   public int getMaxTentatives() {
    return MAX_TENTATIVES;
}
public boolean isTermine() {
    return gagne || nbEssais >= MAX_TENTATIVES;
}

   
}

