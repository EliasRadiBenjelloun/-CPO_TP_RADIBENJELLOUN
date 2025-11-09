/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_radi;

/**
 *
 * @author eradi
 */
public class TP2_convertisseurObjet_Radi {

    
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Convertisseur convertisseur = new Convertisseur();
        System.out.println(convertisseur);// Premier convertisseur
        Convertisseur conv1 = new Convertisseur();
        conv1.celsiusVersFahrenheit(10);
        conv1.fahrenheitVersCelsius(50);
        conv1.celsiusVersFahrenheit(25);

        // Deuxième convertisseur
        Convertisseur conv2 = new Convertisseur();
        conv2.fahrenheitVersCelsius(122);
        conv2.fahrenheitVersCelsius(77);

        // Affichage du nombre de conversions effectuées par chaque objet
        System.out.println("Convertisseur 1 : " + conv1);
        System.out.println("Convertisseur 2 : " + conv2);

        // TODO code application logic here
    }
    
}
