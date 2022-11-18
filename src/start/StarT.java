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
        //ini digunakan untuk menentukan batasan baris//
       for (int vertikal=1; vertikal<=3;vertikal++)
       {//ini untuk menentukan batasan kolom//
           for (int horizontal =1; horizontal<=3; horizontal++)
           {//agar horisontal akan berada pada posisi ke ketiga atau dibagian bawah//
               if (vertikal !=3)
               {//untuk mentuksn posisi vertikal kosong yaitu hanyak akan terisi pada bagian tengah//
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
