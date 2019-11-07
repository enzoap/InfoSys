/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.ClienteDAO;

/**
 *
 * @author Aluno
 */
public class Cliente {
    private int codigo = 0;
    private String nome = null;
    private String cpf = null;
    private String fone = null;
    private String celular = null;
    private String email = null;

    /**
     * Método para retorno do nome do cliente
     * @return nome
     */
    
    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Método construtor recebendo os parâmetros nome, cpf, fone, celular e email
     * @param nome string
     * @param cpf string
     * @param fone string
     * @param celular string
     * @param email  string
     */
    
    public Cliente (String nome, String cpf, String fone, String celular, String email){
        setNome(nome);
        setCpf(cpf);
        setFone(fone);
        setCelular(celular);
        setEmail(email);
        gravar();
    }
    
    @Override 
    public String toString (){
        String ret = null;
        ret = "Cliente.:[" + getNome() + "]\n" +
              "CPF.....:[" + getCpf() + "]\n" +
              "Telefone:["  + getFone() + "]\n" +
              "Celular.:[" + getCelular() + "]\n" +
              "Email...:" + getEmail() + "]\n";
        return ret;
    }
    
    private void gravar(){
        ClienteDAO dao = new ClienteDAO();
        int codigo = dao.create(this);
        if (codigo > 0) setCodigo(codigo);
    }
}
