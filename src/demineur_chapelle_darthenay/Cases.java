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

    public Cases() {
    }
    
    public boolean presenceMine(){
        if (mines==true){
            return true;
        }else {
            return false;
        }
    }
    
       
    public boolean affecterMine(){
        this.mines = true;
        return mines;
    }
    
    public boolean pres_chiffre(){
        this.pres_chiff=true;
        return pres_chiff;
    }
    
    public int affecterChiffre(int c){
        this.chiffre =c;
        return chiffre;
    }
    
    
    
    

    @Override
    public String toString() {
        if (this.presenceMine()==true){
            return " X ";}
        else if (pres_chiff==true){
            return (" " + chiffre+" ") ;
        }
        else {
            return " O ";
        }
            
    }
     
   
}
