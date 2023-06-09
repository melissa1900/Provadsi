/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public class Medico extends Funcionario{
    private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario) {
        super(cpf, rg, matricula, setor, salario);
        this.crm = crm;
    }

    

    public String getCrm() {
        return crm;
    }

    @Override
    public String toString() {
        return "Medico{" + "crm=" + crm + '}';
    }
    
}
