/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_chapelle_darthenay;

/**
 *
 * @author 33769
 */
public class Cases {
    boolean mines;
    int chiffre;
    boolean pres_chiff;
    boolean cases;
    boolean drapeau=false ;
    
    
    public Cases() {
    }
    
    // vérifie la presence de Mines 
    public boolean presenceMine(){
        if (mines==true){
            return true;
        }else {
            return false;
        }
    }
    
    // retourne la valeur de la case 
    public int valeur (){
        return this.chiffre;
    }
      
    // place une mine 
    public boolean affecterMine(){
        this.mines = true;
        return mines;
    }
    
    //place un chiffre
    public boolean pres_chiffre(){
        this.pres_chiff=true;
        return pres_chiff;
    }
    
    //place un chiffre 
    public int affecterChiffre(int c){
        this.chiffre =c;
        return chiffre;
    }
    
    //découvre une case 
    public boolean decouvrirCase(){
        cases=true;
        return cases;
    }
    
    //vérifie si une case est découverte ou non 
    public boolean case_decouv(){
        if (cases==true){
            return true;}
        else {
            return false;
        }
    }
   
    //vérifie la présence d'un drapeau 
    public boolean pres_drapeau(){
        if (this.drapeau==true){
            return true;
        }else { 
            return false; 
        }
    }
    
    //pose un drapeau 
    public boolean poserDrapeau (){
        this.drapeau = true ; 
        return drapeau;
    }
    
    @Override
    public String toString() {
        if (this.presenceMine()==true){
            return " B ";}
        else if (pres_chiff==true){
            return (" " + chiffre+" ") ;}
        else if (pres_drapeau()==true){
            return(" D ");
        }
        else {
            return " " + 0 + " ";
        }
            
    }
     
   
}
