/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facens.qtscaixabranca;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Pc Elaine
 */
public class User {
    public Connection conectarBD(){
        Connection conn = null; //3
        try {
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123"; // 4
            conn = DriverManager.getConnection(url);
        } catch (Exception e) { //5
            //Sem tratativa de exceção
        }
        return conn;// 6
    }
    
    public String nome=""; //
    public boolean result = false; //
    public boolean VerificarUsuario(String login, String senha){
        String sql = ""; // 1
        Connection conn = conectarBD(); // 2
        //Instrução SQL
        sql += "select nome from usuarios";
        sql +="where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';"; // 7
        try{
            Statement st = conn.createStatement(); //
            ResultSet rs = st.executeQuery(sql); // 8
            if(rs.next()){
                result = true; 
                nome = rs.getString("nome"); //9
            } // 10
        } catch(Exception e) {
            //Sem tratativa de exceção
        } // 11
        return result; //12
    }
}
