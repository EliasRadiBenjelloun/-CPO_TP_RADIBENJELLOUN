/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eradi
 */
public class Resultat {
private int exact;
    private int tropHaut;
    private int tropBas;

    public Resultat(int exact, int tropHaut, int tropBas) {
        this.exact = exact;
        this.tropHaut = tropHaut;
        this.tropBas = tropBas;
    }
        public int getExact() { return exact; }
    public int getTropHaut() { return tropHaut; }
    public int getTropBas() { return tropBas; }
}
