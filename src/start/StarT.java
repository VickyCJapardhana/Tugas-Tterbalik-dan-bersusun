/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

/**
 *
 * @author ASUS TUF
 */
public class StarT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Star model");
       for (int vertikal=1; vertikal<=3;vertikal++)
       {
           for (int horizontal =1; horizontal<=3; horizontal++)
           {
               if (vertikal !=3)
               {
               if (horizontal==1||horizontal==3)
               {System.out.print(" ");}
               else 
               {System.out.print("*");}
               }
               else 
               {
                   System.out.print("*");
               }
           }System.out.println("");
       } 
    
    }}
