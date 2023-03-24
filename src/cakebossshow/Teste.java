package cakebossshow;

import java.util.*;

public class Teste {
    /**
     * @param args
     */
    public static void main(String[] args)  {
          // cria a lista de ingredientes e ferramentas para a receita
          List ingredientes = new ArrayList();
          ingredientes.add("arroz");
          ingredientes.add("feijão");
          ingredientes.add("carne");
          ingredientes.add("cebola");
          ingredientes.add("alho");

          List ferramentas = new ArrayList();
          ferramentas.add("faca");
          ferramentas.add("tábua");
          ferramentas.add("panela");
          ferramentas.add("colher de pau");
          ferramentas.add("escumadeira");
          
          // cria a cozinha, que irá fornecer o ingrediente surpresa
          Cozinha cozinha = new Cozinha(null, null);
          String ingredienteSurpresa = cozinha.getIngredienteSurpresa();
          
          // cria os cozinheiros
          BecaMilano beca = new BecaMilano();
          CarolFiorentino carol = new CarolFiorentino();
          GordonRamsay iago = new GordonRamsay();
          
          // cada cozinheiro prepara a receita com os ingredientes, ferramentas e ingrediente surpresa fornecidos
          beca.prepararReceita(ingredientes, ferramentas, ingredienteSurpresa);
          carol.prepararReceita(ingredientes, ferramentas, ingredienteSurpresa);
          iago.prepararReceita(ingredientes, ferramentas, ingredienteSurpresa);
          
          // exibe a pontuação de cada cozinheiro
          System.out.println("Pontuação de Beca: " + beca.getPontuacao());
          System.out.println("Pontuação de Carol: " + carol.getPontuacao());
          System.out.println("Pontuação de Iago: " + iago.getPontuacao());
          
          // utiliza o padrão observer para adicionar os cozinheiros à lista de observadores da cozinha
          cozinha.addObserver(beca);
          cozinha.addObserver(carol);
          cozinha.addObserver(iago);
          
          // cozinha adiciona um novo ingrediente surpresa, notificando os observadores (cozinheiros)
          cozinha.setIngredienteSurpresa("abóbora");
          
          // exibe a pontuação atualizada de cada cozinheiro após a mudança do ingrediente surpresa
          System.out.println("Pontuação de Beca após ingrediente surpresa: " + beca.getPontuacao());
          System.out.println("Pontuação de Carol após ingrediente surpresa: " + carol.getPontuacao());
          System.out.println("Pontuação de Iago após ingrediente surpresa: " + iago.getPontuacao());
      }
}
