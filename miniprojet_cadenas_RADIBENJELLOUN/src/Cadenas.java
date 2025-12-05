
import java.util.ArrayList;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eradi
 */
public class Cadenas {
    private int[] combinaisonSecrete;
    private int nbTentativesMax;
    private int tentativeCourante;
    private ArrayList<int[]> historique;
public Cadenas(int nbTentativesMax) {
        this.nbTentativesMax = nbTentativesMax;
        this.tentativeCourante = 0;
        this.historique = new ArrayList<>();
        genererCombinaison();
    }
 private void genererCombinaison() {
        combinaisonSecrete = new int[4];
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            combinaisonSecrete[i] = r.nextInt(10); // chiffres 0 à 9
        }
   public Resultat verifier(int[] proposition) {
        tentativeCourante++;
        historique.add(proposition);

        int exact = 0;
        int tropHaut = 0;
        int tropBas = 0;

        for (int i = 0; i < 4; i++) {
            if (proposition[i] == combinaisonSecrete[i]) {
                exact++;
            } else if (proposition[i] > combinaisonSecrete[i]) {
                tropHaut++;
            } else {
                tropBas++;
            }
        }

        return new Resultat(exact, tropHaut, tropBas);
    }

    public boolean estGagne(Resultat r) {
        return r.getExact() == 4;
    }

    public boolean estPerdu() {
        return tentativeCourante >= nbTentativesMax;
    }

    
}
