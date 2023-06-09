/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public enum Setor {
    ENGENHARIA ("Engenharia"),
    SAUDE ("Saude"),
    JURIDICO ("Juridico"),
    OPERACOES ("Operacoes");
    
    protected String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
