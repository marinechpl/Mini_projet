/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_chapelle_darthenay;

import java.util.Scanner;

/**
 *
 * @author 33769
 */
public class Partie {

    int lignes;
    int mines;

    public Partie(int lignes, int mines) {
        Scanner sc = new Scanner(System.in);
        PlateauDeJeu plateau = new PlateauDeJeu(lignes, mines);
        plateau.placerMine();
        plateau.placerChiffres();
        plateau.afficherPlateau();

        while (plateau.gagné() != true && plateau.perdu() == false) {

            //PlateauDeJeu affichage = new PlateauDeJeu (lignes, mines);
            //affichage.afficherPlateau();
            System.out.println("Rentrez le numero de la ligne : ");
            int ligne = sc.nextInt();
            System.out.println("Rentrez le numero de la colonne : ");
            int colonne = sc.nextInt();
            
            
            
            

            //dessous.afficher_cases(ligne, colonne);
            //dessous.afficherPlateau();
        }
    }

}
