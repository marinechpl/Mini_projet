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
    boolean un ;
    boolean deux;
    boolean trois;

    public Cases() {
    }
    
    public boolean presenceMine(){
        if (mines==true){
            return true;
        }else {
            return false;
        }
    }
    
    public boolean presence_1(){
        if (un == true){
            return true ;
        }else{
            return false;
        }
    }
    
    public boolean presence_2(){
        if (deux == true){
            return true ;
        }else{
            return false;
        }
    }
    
    public boolean presence_3(){
        if (trois == true){
            return true ;
        }else{
            return false;
        }
    }
    
    public boolean affecter_1(){
        this.un = true;
        return un;
    }
    
    public boolean affecter_2(){
        this.deux = true;
        return deux;
    }
    
    public boolean affecter_3(){
        this.trois = true;
        return trois;
    }
       
    public boolean affecterMine(){
        this.mines = true;
        return mines;
    }

    @Override
    public String toString() {
        if (this.presenceMine()==true){
            return " X ";
        }else if (this.presence_1()==true){
            return " 1 ";
        }else if (this.presence_2()==true){
            return " 2 ";
        }else if (this.presence_3()==true){
            return " 3 ";
        }else {
            return " O ";
        }
            
    }
   
}
