/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viceprvocisel;

/**
 *
 * @author Venda
 */
public class VicePrvocisel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Pole k uložení prvočísel
        
        long [] prvocisla = new long [20]; 
        
        prvocisla[0] = 2;       //Uvádí první prvočíslo
        prvocisla[1] = 3;       //a druhé
        
        //Počítá dosud nalezená prvočísla což je také indexem pole
        
        int pocet = 2 ;
        
        long cislo = 5 ;        //Další celé číslo k otestování
        
            vnejsi:
            for( ;pocet < prvocisla.length; cislo += 2) {
        
            //Maximálně dělitelem, který musí být otestován
            // long je druhá odmocnina z čísla
            
            long limit = (long)Math.ceil(Math.sqrt((double)cislo));
            
            // Dělí všemi prvočísly , které jsme našli do limitu
            
            for (int i = 1; i < pocet && prvocisla[i] <=limit; i ++){
                
                // Je to přesný dělitel?
                
                if(cislo % prvocisla[i] == 0){
                
                    continue vnejsi;    //Ano zkus další číslo.
                    
                }
                
            }
            
            prvocisla[pocet++] = cislo ;    //Jedno jsme našli!
            
        }
        
        for (int i = 0 ; i < prvocisla.length ; i ++){
        
            //Výstup všech prvočísel 
            
            System.out.println(prvocisla[i]);
            
        }
            
    }
    
}
