/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author aluno
 */
public class Tecnicos {
    private String nome;
    private String valorHora;
    private String custoMensal;
    private double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValorHora() {
        return valorHora;
    }

    public void setValorHora(String valorHora) {
        this.valorHora = valorHora;
    }

    public String getCustoMensal() {
        return custoMensal;
    }

    public void setCustoMensal(String custoMensal) {
        this.custoMensal = custoMensal;
    }
    
    public Tecnicos (String nome, String valorHora, double salario){
        setNome(nome);
        setValorHora(valorHora);
        setSalario(salario);
        
    }
}
