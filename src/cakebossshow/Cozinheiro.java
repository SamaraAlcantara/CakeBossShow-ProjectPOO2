package cakebossshow;

import java.util.*;

public abstract class Cozinheiro {

    private String nome;

    public Cozinheiro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    /**
     * @param ingredientes
     * @param ferramentas
     * @param ingredienteSurpresa
     */
    public abstract void cozinhar(List ingredientes, List ferramentas, String ingredienteSurpresa);

    public void addObserver(BecaMilano beca) {
    }

    public void addObserver(CarolFiorentino carol) {
    }

    public void addObserver(GordonRamsay iago) {
    }

    public void setIngredienteSurpresa(String string) {
    }

    public String getIngredienteSurpresa() {
        return null;
    }
}

