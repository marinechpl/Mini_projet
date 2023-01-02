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

    int taille;
    int mines;
    int vie;
    int kit;

    public Partie(int taille, int mines, int kit) {
        Scanner sc = new Scanner(System.in);
        PlateauDeJeu plateau = new PlateauDeJeu(taille, mines, kit); //initialisation du plateau 

        plateau.placerMine(); // place les mines 
        plateau.placerChiffres();// place les chiffres
        plateau.placerKit(); // place les kit de déminage 
        kit = 0;
        this.vie = 3;

        System.out.print("Vous avez 3 chances ");
        plateau.afficherPlateau(); //affiche le plateau caché 

        while (plateau.gagné() != true && plateau.perdu(vie) != 0) { // tant que la partie n'est pas perdue ou gagnée 

            System.out.println("\nQue voulez-vous faire ? (Vous avez " + kit + " kits) \n 1.Jouer une case \n 2.Poser un drapeau \n 3.Utiliser un kit"); // proposition 
            int c = sc.nextInt(); // récupère le choix du joueur 

            switch (c) {
                case 1:// si il veut jouer une case
                {
                    System.out.println("Rentrez le numero de la ligne : ");
                    int ligne = sc.nextInt();
                    System.out.println("Rentrez le numero de la colonne : ");
                    int colonne = sc.nextInt(); // coordonnées de la case 

                    while (ligne > taille || colonne > taille) {
                        System.out.println("Veuillez entrer une coordonnee correct");
                        System.out.println("Rentrez le numero de la ligne : ");
                        ligne = sc.nextInt();
                        System.out.println("Rentrez le numero de la colonne : ");
                        colonne = sc.nextInt(); // coordonnées de la case 
                    }

                    kit = plateau.afficher_cases(ligne - 1, colonne - 1, kit); // affiche la case et celle autour si elles contiennent des 0 

                    if (plateau.perdu(vie) == 5) { // enlève un kit s'il était sur une bombe 
                        kit = kit - 1;
                    }

                    plateau.afficherPlateau(); // affiche le nouveau plateau 
                    System.out.println("\nIl vous reste " + plateau.perdu(vie) + " vies");
                    plateau.gagné(); // vérifie si la partie est gagnante ou pas ( utile -> while vérifie déjà ?) 
                    break;
                }

                case 2:// poser un drapeau
                {
                    System.out.println("Rentrez le numero de la ligne : ");
                    int ligne = sc.nextInt();
                    System.out.println("Rentrez le numero de la colonne : ");
                    int colonne = sc.nextInt(); // coordonnées 

                    plateau.poser_drap(ligne - 1, colonne - 1);
                    plateau.afficherPlateau();

                    System.out.println("Il vous reste " + plateau.perdu(vie) + " vies");
                    plateau.gagné(); // même démarche que pour le choix 1
                    break;
                }

                case 3: //utiliser un kit 
                    if (kit == 0) {
                        System.out.println("Vous n'avez pas de kit de Deminage");

                    } else {
                        kit = kit - 1;
                        System.out.println("Rentrez le numero de la ligne : ");
                        int ligne = sc.nextInt();
                        System.out.println("Rentrez le numero de la colonne : ");
                        int colonne = sc.nextInt(); // coordonnées

                        plateau.utiliser_kit(ligne, colonne); // utiliser le kit sur la case sélectionnée
                        plateau.afficherPlateau();
                        System.out.println("Il vous reste " + plateau.perdu(vie) + " vies");
                        plateau.gagné(); // même démarche que pour le choix 1
                    }
                    break;
                default:
                    break;
            }

        }
        if (plateau.perdu(vie) == 0) { // message de fin si partie gagnée ou perdue 
            System.out.println("Vous avez perdu");
        } else {
            System.out.println("Vous avez gagné");

        }
    }

}
