/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public abstract class Fisica extends Pessoa{
    protected LocalDate dataNascimento;
;

    public Fisica(LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.dataNascimento = dataNascimento;
 
    }

    

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Fisica{" + "dataNascimento=" + dataNascimento + ", genero="  + '}';
    }


    
    
    
}
