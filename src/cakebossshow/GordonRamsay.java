package cakebossshow;
import java.util.List;
public class GordonRamsay extends Cozinheiro {
    
    public GordonRamsay() {
        super("GordonRamsay");
    }

    public void cozinhar(List ingredientes, List ferramentas, String ingredienteSurpresa) {
        System.out.println(getNome() + " está preparando a receita com os seguintes ingredientes: " + ingredientes);
        System.out.println("Usando as seguintes ferramentas: " + ferramentas);
        System.out.println("Um ingrediente surpresa foi adicionado no meio do processo: " + ingredienteSurpresa);
        // Implementação do processo de cozimento pelo Iago
    }

    public String getPontuacao() {
        return null;
    }

    public void prepararReceita(List ingredientes, List ferramentas, String ingredienteSurpresa) {
    }
}
