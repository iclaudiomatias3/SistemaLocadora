/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author joelanio
 */
public class Conexao {
     
   
    public static Connection AbrirConexao(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3333/funcionario?useTimezone=true&serverTimezone=UTC";
            con= DriverManager.getConnection(url,"root","admin");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERRO ao conectar ao banco de dados");
            e.getMessage();
            
        }
    return con;
}
    public static void FecharConexao(Connection con) {
        
        try{
            con.close();
        }catch(Exception e ){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
 
}
