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
        for (int i = 0; i < 10; i ++){
            int ligne = c.nextInt(taille);
            int colonne = c.nextInt(taille);
            plateau[ligne][colonne].affecterMine();
        }
    }
    
    public void placerChiffres(){           
        for (int i=0; i<taille-1; i++){
            for (int j=0; j<taille-1; j++){
                if (j==0 && plateau[i][j].presenceMine()==true){
                    plateau[i+1][j].affecter_1();
                    plateau[i][j+1].affecter_1();
                    plateau[i-1][j].affecter_1();
                    plateau[i+1][j+1].affecter_1();
                    plateau[i-1][j+1].affecter_1();
                }
                else if (j==taille-1 && plateau[i][j].presenceMine()==true){
                    plateau[i+1][j].affecter_1();
                    plateau[i-1][j].affecter_1();
                    plateau[i][j-1].affecter_1();
                    plateau[i-1][j-1].affecter_1();
                    plateau[i+1][j-1].affecter_1();
                }
                else if (i==0 && plateau[i][j].presenceMine()==true){
                    plateau[i+1][j].affecter_1();
                    plateau[i][j+1].affecter_1();
                    plateau[i][j-1].affecter_1();
                    plateau[i+1][j+1].affecter_1();
                    plateau[i+1][j-1].affecter_1();
                }
                else if (plateau[i][j].presenceMine()==true){
                    plateau[i+1][j].affecter_1();
                    plateau[i][j+1].affecter_1();
                    plateau[i-1][j].affecter_1();
                    plateau[i][j-1].affecter_1();
                    plateau[i+1][j+1].affecter_1();
                    plateau[i-1][j-1].affecter_1();
                    plateau[i+1][j-1].affecter_1();
                    plateau[i-1][j+1].affecter_1();
                }
            }
        }
    }

    public void afficherPlateau() {
        for (int i = taille-1; i >= 0; i--) {
            System.out.print("\n");
            for (int j = 0; j < taille; j++) {
                System.out.print(plateau[i][j]);
            }
        }
    }

}
