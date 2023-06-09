package com.mycompany.prova;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Motoboy extends Funcionario{
    private String cnh;

    public Motoboy(String cnh, String cpf, String rg, String matricula, Setor setor, double salario) {
        super(cpf, rg, matricula, setor, salario);
        this.cnh = cnh;
    }

   

    public String getCnh() {
        return cnh;
    }

    @Override
    public String toString() {
        return "Motoboy{" + "cnh=" + cnh + '}';
    }
    
}
