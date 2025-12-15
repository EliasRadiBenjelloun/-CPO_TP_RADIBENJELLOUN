/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_radi;

/**
 *
 * @author eradi
 */
public class Convertisseur { 
     private int nbConversions;

    // Constructeur (sans paramètres)
    public Convertisseur() {
        nbConversions = 0;
    }

    // Conversion Celsius -> Fahrenheit
    public double celsiusVersFahrenheit(double tempC) {
        nbConversions++;
        return tempC * 9.0 / 5.0 + 32.0;
    }

    // Conversion Fahrenheit -> Celsius
    public double fahrenheitVersCelsius(double tempF) {
        nbConversions++;
        return (tempF - 32.0) * 5.0 / 9.0;
    }

    // Méthode toString pour afficher le nombre de conversions réalisées
    @Override
    public String toString() {
        return "nb de conversions = " + nbConversions;
    }
    
    
}
