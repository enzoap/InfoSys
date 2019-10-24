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
public class Produtos {
    private String valorCusto;
    private String valorVenda;
    private String descricao;
    private String quantidade;
    

    public String getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(String valorCusto) {
        this.valorCusto = valorCusto;
    }

    public String getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(String valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    public Produtos (String valorCusto, String valorVenda, String descricao, String quantidade){
        setValorCusto(valorCusto);
        setValorVenda(valorVenda);
        setDescricao(descricao);
        setQuantidade(quantidade);
    }
    
    
}

