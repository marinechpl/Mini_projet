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

    Cases[][] plateau;
    int nb_mines;

    // constructeur du plateau de jeu 
    public PlateauDeJeu(int taille, int nb_mines) {
        this.taille = taille;
        this.nb_mines = nb_mines;

        plateau = new Cases[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                plateau[i][j] = new Cases();
            }
        }

    }
    
    // place les mines au hasard 

    public void placerMine() {
        Random c = new Random();
        for (int i = 0; i < nb_mines; i++) {
            int ligne = c.nextInt(taille);
            int colonne = c.nextInt(taille);
            while (plateau[ligne][colonne].presenceMine() == true) {
                ligne = c.nextInt(taille);
                colonne = c.nextInt(taille);
            }
            plateau[ligne][colonne].affecterMine();
        }
    }

    // placement des chiffres autour des bombes 
    public void placerChiffres() {
        int nb;
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
        for (int i = taille - 1; i < taille; i++) {
            for (int j = taille - 1; j < taille; j++) {
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
            for (int j = taille - 1; j < taille; j++) {
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
        for (int i = taille - 1; i < taille; i++) {
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
            for (int j = 1; j < taille - 1; j++) {
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
        for (int i = taille - 1; i < taille; i++) {
            for (int j = 1; j < taille - 1; j++) {
                nb = 0;
                if (plateau[i][j + 1].presenceMine() == true) {
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
        for (int j = taille - 1; j < taille; j++) {
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
//reste de la grille 
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

    
    // vérifie si la partie est gagné : s'il ne reste que les cases contenant des bombes couvertes 
    public boolean gagné() {
        int cases_c = 0;
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (plateau[i][j].case_decouv() == false) {
                    cases_c = cases_c + 1;
                }
            }
        }
        if (cases_c != nb_mines) {
            return false;
        } else {
            return true;
        }
    }
    
    //vérifie si la partie est perdue : clique sur une bombe 

    public boolean perdu() {
        boolean partie = false;
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (plateau[i][j].presenceMine() == true && plateau[i][j].case_decouv() == true) {
                    partie = true;
                }
            }
        }
        return partie;
    }
    
    public void poser_drap(int x, int y){
        plateau[x][y].poserDrapeau();
    }
    
    

// affiche les cases contenant les 0 et s'arrête au niveau des chiffres : algorithme de FloodFill
    public void afficher_cases(int x, int y) {
        if ((x < 0 || x > taille || y < 0 || y > taille) || plateau[x][y].case_decouv() == true) {
            System.out.println ("Entrez un numero de case valide ou un numero de case non decouverte");
            return;
        }
        if (x >= 0 && x <= taille-1 && y >= 0 && y <= taille-1 && plateau[x][y].chiffre!=0)  {
            plateau[x][y].decouvrirCase();
        }
        if (x >= 0 && x <=taille-1 && y >= 0 && y <= taille-1 && plateau[x][y].case_decouv() == false){
            plateau[x][y].decouvrirCase();
            afficher_cases(x-1, y);
            afficher_cases(x+1, y);
            afficher_cases(x, y+1);
            afficher_cases(x, y-1);
        }
    }

    // affiche le plateau 
    public void afficherPlateau() {
        for (int i = taille - 1; i >= 0; i--) {
            System.out.print("\n");
            for (int j = 0; j < taille; j++) {
                if (plateau[i][j].case_decouv() == true) {
                    System.out.print(plateau[i][j]);
                }else if ( plateau[i][j].pres_drapeau()== true){
                    System.out.print(" D ");
                }
                else {
                    System.out.print(" X ");
                }
            }
        }
    }
    

}
