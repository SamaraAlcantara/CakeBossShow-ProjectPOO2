
package cakebossshow;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
public class CarolFiorentino extends Cozinheiro {
    public CarolFiorentino() {
        super("Carol");
    }

    /**
     * @param ingredientes
     * @param ferramentas
     * @param ingredienteSurpresa
     */
    public void cozinhar(List ingredientes, List ferramentas, String ingredienteSurpresa) {
        System.out.println(getNome() + " está preparando a receita com os seguintes ingredientes: " + ingredientes);
        System.out.println("Usando as seguintes ferramentas: " + ferramentas);
        System.out.println("Um ingrediente surpresa foi adicionado no meio do processo: " + ingredienteSurpresa);
        // Implementação do processo de cozimento pela Carol
    }
    //strategy
    public String getPontuacao() {
        return null;
    }
    //decorator
    public void prepararReceita(List ingredientes, List ferramentas, String ingredienteSurpresa) {
    }

}


