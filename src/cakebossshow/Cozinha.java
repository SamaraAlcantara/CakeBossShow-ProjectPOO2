package cakebossshow;

import java.util.ArrayList;
import java.util.Collections;

public class Cozinha {
    private ArrayList ingredientes;
    private ArrayList ferramentas;
    private String ingredienteSurpresa;

    public Cozinha(ArrayList ingredientes, ArrayList ferramentas) {
        this.ingredientes = ingredientes;
        this.ferramentas = ferramentas;
        this.ingredienteSurpresa = null;
    }

    public Cozinha(String string) {
    }

    public void setIngredienteSurpresa(String ingredienteSurpresa) {
        this.ingredienteSurpresa = ingredienteSurpresa;
    }
    //observer
    public void prepararIngredientes() {
        // Embaralha a lista de ingredientes
        Collections.shuffle(ingredientes);
        System.out.println("Os ingredientes foram preparados pela cozinha: " + ingredientes);
    }

    public ArrayList getIngredientes() {
        return ingredientes;
    }

    public ArrayList getFerramentas() {
        return ferramentas;
    }

    public String getIngredienteSurpresa() {
        return ingredienteSurpresa;
    }

    public void addObserver(GordonRamsay iago) {
    }

    public void addObserver(CarolFiorentino carol) {
    }

    public void addObserver(BecaMilano beca) {
    }
}

