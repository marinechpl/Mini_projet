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

    int longueur;
    int largeur;
    Cases[][] plateau;

    public PlateauDeJeu(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;

        plateau = new Cases[longueur][largeur];

        for (int i = 0; i < longueur; i++) {
            for (int j = 0; j < largeur; j++) {
                plateau[i][j] = new Cases();
            }
        }

    }

    public void placerMine() {
        Random c = new Random();
        for (int i = 0; i < 10; i ++){
            int ligne = c.nextInt(largeur);
            int colonne = c.nextInt(longueur);
            plateau[ligne][colonne].affecterMine();
        }
    }
    
    public void placerChiffres(){
        for (int i=1; i<longueur-1; i++){
            for (int j=1; j<largeur-1; j++){
                if (plateau[i][j].presenceMine()==true){
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
        for (int i = longueur - 1; i >= 0; i--) {
            System.out.print("\n");
            for (int j = 0; j < largeur; j++) {
                System.out.print(plateau[i][j]);
            }
        }
    }

}
