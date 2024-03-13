/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LajkóGergő(SZOFT_202
 */
public class TombokMegjelenitese {
    public static void main(String[] args) {
     TombokMegjelenitese();
      
    }
    
    private static void TombokMegjelenitese(){
      char [] tomb= TombLetrehozas();
      EgysorKiir(tomb);
      System.out.println("");
      MatrixKiir(tomb);
    }
                
    private static char[] TombLetrehozas(){
        char [] karakterek = {'a','b','c','d','e','f','g'};
        return karakterek;
    }
   
    private static void EgysorKiir(char[] tomb){
        for (int i = 0; i < tomb.length; i++) {
            System.out.print(tomb[i]+",");
        }
           
    }
    
    private static void MatrixKiir(char[] tomb){
        for (int i = 0; i < tomb.length; i++) {
            if (tomb[i])
         System.out.println("");
        }
    }


    
}
