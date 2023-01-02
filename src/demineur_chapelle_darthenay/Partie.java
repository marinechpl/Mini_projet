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
        PlateauDeJeu plateau = new PlateauDeJeu(lignes, mines); //initialisation du plateau 
        plateau.placerMine(); // place les mines 
        plateau.placerChiffres();// place les chiffres
        plateau.afficherPlateau(); //affiche le plateau caché 

        while (plateau.gagné() != true && plateau.perdu() == false) { // tant que la partie n'est pas perdue ou gagnée 

            System.out.println (" Que voulez-vous faire ? \n 1.Jouer une case \n 2.Poser un drapeau" ); // proposition 
            int c = sc.nextInt(); // récupère le choix du joueur 
            if (c==1){ // si il veut jouer une case 
                System.out.println("Rentrez le numero de la ligne : ");
                int ligne = sc.nextInt();
                System.out.println("Rentrez le numero de la colonne : ");
                int colonne = sc.nextInt(); // coordonées de la case 

                plateau.afficher_cases(ligne-1, colonne-1); // affiche la case et celle du tour si elles contiennent des 0 
                plateau.afficherPlateau(); // affiche le nouveau plateau 
                plateau.gagné(); // vérifie si la partie est gagnante ou pas ( utile -> while vérifie déjà ?) 
                
            }else if (c==2){ // poser un drapeau 
                System.out.println("Rentrez le numero de la ligne : ");
                int ligne = sc.nextInt();
                System.out.println("Rentrez le numero de la colonne : ");
                int colonne = sc.nextInt(); // coordonnées 

                plateau.poser_drap(ligne-1, colonne-1); 
                plateau.afficherPlateau();
                plateau.gagné(); // même démarche que pour le choix 1
            }
                
           
                
           
        }
        if (plateau.perdu() == true) { // message de fin si partie gagnée ou perdue 
            System.out.println("Vous avez perdu");
        } else {
            System.out.println("Vous avez gagné");
            
        }
    }

}
