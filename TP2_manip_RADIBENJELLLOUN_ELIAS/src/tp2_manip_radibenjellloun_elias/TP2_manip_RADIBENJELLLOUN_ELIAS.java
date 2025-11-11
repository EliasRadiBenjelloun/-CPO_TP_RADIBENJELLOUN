/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_radibenjellloun_elias;

/**
 *
 * @author eradi
 */
public class TP2_manip_RADIBENJELLLOUN_ELIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
Tartiflette assiette2 = new Tartiflette(600);
Tartiflette assiette3 = assiette2;
// reponse a la quetion 4: on a crée deux objets assiette 1 et assiette 2 
Tartiflette temp = assiette1;
assiette1 = assiette2;
assiette2 = temp;
System.out.println("nb de calories de Assiette 2 : " + 
assiette2.nbCalories) ; 
System.out.println("nb de calories de Assiette 3 : " + 
assiette3.nbCalories) ; 
//reponse a la question 6: assiete 1 est une tartiflette on ne peux pas la mettre dans une variable de type Moussaka 
Moussaka[] tab = new Moussaka[10];

for (int i = 0; i < 10; i++) {
    tab[i] = new Moussaka(100 + i * 10);
}








        // TODO code application logic here
    }
    
}
