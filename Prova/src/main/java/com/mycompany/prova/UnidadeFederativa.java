
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    BAHIA ("Bahia", "BA"),
    SAO_PAULO ("Sao_Paulo", "SP"),
    RIO_DE_JANEIRO ("Rio_De_Janeiro", "RJ");
    
    
    protected final String nome;
    protected final String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public static UnidadeFederativa getSAO_PAULO() {
        return SAO_PAULO;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    
    
   
    
    
}
