/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prova;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Juridica");
     Juridica juridica = new Juridica("123456963000174", "123654", "Caio", "71985064178", "caio18@gmail.com", endereco);
    Endereco endereco = new Endereco("apartamento", "17", "proximo ao centro", "4056396", "Salvador", UnidadeFederativa.BAHIA);
    
        System.out.println("");
        
  
        
        Cliente cliente = new Cliente(14, "Aline", "71985059441", "mel18@gmai.com", endereco);
        new Endereco("casa", "19", "casa verde", "405623121", "Salvador", UnidadeFederativa.BAHIA);
        
        
        System.out.println("");
        
         Motoboy motoboy = new Motoboy("178963", "10321456314", "154589823", "25", Setor.SAUDE, 0);
        new Endereco("Casa", "27", "casa amarela", "40256314", "Salvador", UnidadeFederativa.BAHIA);
        
    Medico medico = new Medico("145", "103012548", "1236977", "156", Setor.SAUDE, 400);
    new Endereco("Hospital", "145", "proximo a venda", "40526651", "Salvador ", UnidadeFederativa.BAHIA);
    
        System.out.println("");
        
        Advogado advogado = new Advogado("1562", "102398226", "125412563254", "152455", Setor.SAUDE, 600);
       new Endereco("apartamento", "27", "proximo a venda", "40563", "Salvador", UnidadeFederativa.BAHIA);
       
      
     
        
}


