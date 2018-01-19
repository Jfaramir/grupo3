/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo3;

/**
 *
 * @author xp
 */
public class EjercicioA {
    
    public boolean cigarParty(int cigars, boolean isWeekend) {
    if(isWeekend)
        return 40 <= cigars;
          
    return 40 <= cigars && cigars <= 60;
}
   
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
