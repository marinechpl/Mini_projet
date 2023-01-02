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
public class Jeu {

    Partie jeu;

    public Jeu() {
        System.out.println("Vous avez plusieurs jeux possibles : \n 1. Facile : Plateau 5x5 avec 10 Mines et 3 Kits "
                + "\n 2. Moyen : Plateau 10x10 avec 15 Mines et 4 Kits" + "\n 3. Difficile : Plateau 20x20 avec 25 Mines et 7 Kits "
                + "\n 4. Personnalise" + "\nQuel niveau voulez-vous ?");
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        switch (c) {
            case 1: {
                Partie jeu1 = new Partie(5, 10, 3);
            }
            case 2: {
                Partie jeu1 = new Partie(10, 15, 4);
            }
            case 3: {
                Partie jeu1 = new Partie(20, 25, 7);
            }
            case 4: {
                int mines;
                int taille;
                int kits;
                System.out.println("Entrez une taille de tableau (1 chiffre)");
                taille = sc.nextInt();
                System.out.println("Entrez le nombre de mines");
                mines = sc.nextInt();
                System.out.println("Entrez un nombre de kits");
                kits = sc.nextInt();
                Partie jeu1 = new Partie(taille, mines, kits);
            }
            default: {
                System.out.println("Refaite un choix valable");
                c = sc.nextInt();
                switch (c) {
                    case 1: {
                        Partie jeu1 = new Partie(5, 10, 3);
                    }
                    case 2: {
                        Partie jeu1 = new Partie(10, 15, 4);
                    }
                    case 3: {
                        Partie jeu1 = new Partie(20, 25, 7);
                    }
                    case 4: {
                        int mines;
                        int taille;
                        int kits;
                        System.out.println("Entrez une taille de tableau (1 chiffre)");
                        taille = sc.nextInt();
                        System.out.println("Entrez le nombre de mines");
                        mines = sc.nextInt();
                        System.out.println("Entrez un nombre de kits");
                        kits = sc.nextInt();
                        Partie essai = new Partie(taille, mines, kits);
                    }
                }

                System.out.println("\nVoulez vous rejouer ? \n1.Oh oui avec grand plaisir \n2. Non, c'etait vraiment nul");
                c = sc.nextInt();
                switch (c) {
                    case 1: {
                        Jeu jeu1 = new Jeu();
                    }
                    case 2: {
                        break;
                    }
                }
            }

        }
    }}
