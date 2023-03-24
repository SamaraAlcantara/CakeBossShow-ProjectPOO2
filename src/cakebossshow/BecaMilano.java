package cakebossshow;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.List;
import java.util.Observer;

public class BecaMilano extends Cozinheiro {
    public BecaMilano() {
        super("BecaMilano");
    }
    public void cozinhar(List ingredientes, List ferramentas, String ingredienteSurpresa) {
        System.out.println(getNome() + " está preparando a receita com os seguintes ingredientes: " + ingredientes);
        System.out.println("Usando as seguintes ferramentas: " + ferramentas);
        System.out.println("Um ingrediente surpresa foi adicionado no meio do processo: " + ingredienteSurpresa);
        // Implementação do processo de cozimento pela Beca
    }
    
    public String getPontuacao() {
        return null;
    }
    public void prepararReceita(List ingredientes, List ferramentas, String ingredienteSurpresa) {
    }
}
