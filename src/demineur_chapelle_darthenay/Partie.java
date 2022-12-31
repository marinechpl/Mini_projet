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
    int mines ; 
    

    public Partie(int lignes, int mines) {
        Scanner sc = new Scanner(System.in);
        PlateauDeJeu dessous = new PlateauDeJeu (lignes,mines);
        dessous.placerMine();
        dessous.placerChiffres();
        dessous.afficherPlateau();
        
        PlateauDeJeu affichage = new PlateauDeJeu (lignes, mines);
        affichage.afficherPlateau();
        
        System.out.println ("Rentrez le numero de la ligne : ");
        int ligne = sc.nextInt();
        System.out.println ("Rentrez le numero de la colonne : ");
        int colonne = sc.nextInt(); 
        
        boolean rep = dessous.verifMines(ligne-1, colonne-1);
        if (rep==true){
            System.out.println ("il y avait une mine, vous avez perdu");
        } else if (rep==false){
            while (dessous.verifChiffres(ligne, colonne)==false){
                
            }
        }
        
    }
    
    
    
}
