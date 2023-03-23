
package cakebossshow;

import java.util.ArrayList;


public class Ingredientes implements AddNewIngrediente {
    
    private final ArrayList<String> ingrediente = new ArrayList<>();
    private Ingredientes i;
    
    public void adicionarIngrediente(String i){
        ingrediente.add(i);
    }
    
     public void sortearIngrediente(){
          
        for(String ac : ingrediente)
            ac.update(i);
        }
}
