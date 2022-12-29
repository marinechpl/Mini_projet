/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demineur_chapelle_darthenay;

/**
 *
 * @author 33769
 */
public class Demineur_CHAPELLE_DARTHENAY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PlateauDeJeu essai = new PlateauDeJeu(15);
        essai.placerMine();
        essai.placerChiffres();
        essai.afficherPlateau();
        
        //System.out.println(essai);
    }
    
}
