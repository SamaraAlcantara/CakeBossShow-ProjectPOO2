/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cakebossshow;

public class GordonRamsay {
    private String nome;
    private String especialidade;
    private int pontuacao;
    private String ferramenta;
    

    public GordonRamsay(String nome, String especialidade, int pontuacao) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.pontuacao = pontuacao;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    public String getFerramenta(){
        return ferramenta;
    }

    public void receberFerramenta(){
        
    }
    public void trocarFerramenta(){
        
    }
    
    
}
