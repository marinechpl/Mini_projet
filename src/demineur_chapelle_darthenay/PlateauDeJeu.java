package demineur_chapelle_darthenay;

import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 33769
 */
public class PlateauDeJeu {

    int taille;
    int nb;
    Cases[][] plateau;

    public PlateauDeJeu(int taille) {
        this.taille = taille;

        plateau = new Cases[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                plateau[i][j] = new Cases();
            }
        }

    }

    public void placerMine() {
        Random c = new Random();
        for (int i = 0; i < 10; i++) {
            int ligne = c.nextInt(taille);
            int colonne = c.nextInt(taille);
            plateau[ligne][colonne].affecterMine();
        }
    }

    public void placerChiffres() {
        //for (int i = 0; i < taille; i++) {
        //for (int j = 0; j < taille; j++) {

// coin (0;0)
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                nb = 0;
                if (plateau[i + 1][j].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i][j + 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i + 1][j + 1].presenceMine() == true) {
                    nb += 1;
                }
                plateau[i][j].affecterChiffre(nb);
                plateau[i][j].pres_chiffre();
            }
        }

// coin (taille;taille)
        for (int i = taille-1; i < taille; i++) {
            for (int j = taille-1; j < taille; j++) {
                nb = 0;
                if (plateau[i - 1][j].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i][j - 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i - 1][j - 1].presenceMine() == true) {
                    nb += 1;
                }
                plateau[i][j].affecterChiffre(nb);
                plateau[i][j].pres_chiffre();
            }
        }
//coin (0;taille)                
        for (int i = 0; i < 1; i++) {
            for (int j = taille-1; j < taille; j++) {
                nb = 0;
                if (plateau[i + 1][j].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i][j - 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i + 1][j - 1].presenceMine() == true) {
                    nb += 1;
                }
                plateau[i][j].affecterChiffre(nb);
                plateau[i][j].pres_chiffre();
            }
        }
//coin (taille;0)
        for (int i = taille-1; i < taille; i++) {
            for (int j = 0; j < 1; j++) {
                nb = 0;
                if (plateau[i][j + 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i - 1][j].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i - 1][j + 1].presenceMine() == true) {
                    nb += 1;
                }
                plateau[i][j].affecterChiffre(nb);
                plateau[i][j].pres_chiffre();

            }
        }
        
//première ligne i=0
        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < taille-1; j++) {
                nb = 0;
                if (plateau[i + 1][j].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i][j + 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i][j - 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i + 1][j + 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i + 1][j - 1].presenceMine() == true) {
                    nb += 1;
                }
                plateau[i][j].affecterChiffre(nb);
                plateau[i][j].pres_chiffre();

            }
        }
// dernière ligne i = taille 
        for (int i = taille-1; i<taille; i++) {
            for (int j = 1; j < taille-1; j++) {
                nb = 0;
                if (plateau[i][j+1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i - 1][j].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i][j - 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i - 1][j - 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i - 1][j + 1].presenceMine() == true) {
                    nb += 1;
                }
                plateau[i][j].affecterChiffre(nb);
                plateau[i][j].pres_chiffre();

            }
        }
        //premiere colonne j=0
        for (int j = 0; j < 1; j++) {
            for (int i = 1; i < taille - 1; i++) {
                nb = 0;
                if (plateau[i + 1][j].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i][j + 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i - 1][j].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i + 1][j + 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i - 1][j + 1].presenceMine() == true) {
                    nb += 1;
                }
                plateau[i][j].affecterChiffre(nb);
                plateau[i][j].pres_chiffre();

            }
        }
        //Dernière colonne j=taille 
        for (int j = taille-1; j < taille; j++) {
            for (int i = 1; i < taille - 1; i++) {
                nb = 0;
                if (plateau[i + 1][j].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i - 1][j].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i][j - 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i - 1][j - 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i + 1][j - 1].presenceMine() == true) {
                    nb += 1;
                }
                plateau[i][j].affecterChiffre(nb);
                plateau[i][j].pres_chiffre();

            }
        }

        for (int i = 1; i < taille - 1; i++) {
            for (int j = 1; j < taille - 1; j++) {
                nb = 0;
                if (plateau[i + 1][j].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i][j + 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i - 1][j].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i][j - 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i + 1][j + 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i - 1][j - 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i + 1][j - 1].presenceMine() == true) {
                    nb += 1;
                }
                if (plateau[i - 1][j + 1].presenceMine() == true) {
                    nb += 1;
                }
                plateau[i][j].affecterChiffre(nb);
                plateau[i][j].pres_chiffre();
            }
        }

    }

    public void afficherPlateau() {
        for (int i = taille - 1; i >= 0; i--) {
            System.out.print("\n");
            for (int j = 0; j < taille; j++) {
                System.out.print(plateau[i][j]);
            }
        }
    }

}
