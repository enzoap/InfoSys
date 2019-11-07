/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Enzo
 */
public class ClienteDAO implements Persistencia<Cliente>{

    @Override
    public int create(Cliente c) {
        int id = 0;
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "INSERT INTO Cliente (Nome,CPF,Fone,Celular,Email) VALUES (?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1,c.getNome());           
            pst.setString(1,c.getCpf());            
            pst.setString(1,c.getFone());
            pst.setString(1,c.getCelular());
            pst.setString(1,c.getEmail());
        }catch (SQLException e){
            id = 0;
        }finally {
            ConnectionFactory.closeConnection(con,pst,rs);
          
        }
        return id;
    }

    @Override
    public List<Cliente> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente findByCodigo(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
