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
 * Classe para operações relacionadas ao usuário.
 *
 * @author Pc Felipe
 * @version 1.0
 */
public class User {

    /**
     * Método para estabelecer a conexão com o banco de dados.
     *
     * @return A conexão estabelecida ou null se ocorrer uma exceção.
     */
    public Connection conectarBD(){
        Connection conn = null; //3
        try {
            // Carrega o driver MySQL
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123"; // 4
            conn = DriverManager.getConnection(url);
        } catch (Exception e) { //5
            //Sem tratativa de exceção
        }
        return conn;// 6
    }

    // Variáveis de classe
    public String nome=""; // Variável para armazenar o nome do usuário
    public boolean result = false; // Variável para armazenar o resultado da verificação

    /**
     * Método para verificar o usuário no banco de dados.
     *
     * @param login O login do usuário a ser verificado.
     * @param senha A senha do usuário a ser verificada.
     * @return Verdadeiro se o usuário for encontrado, falso caso contrário.
     */
    public boolean VerificarUsuario(String login, String senha){
        String sql = ""; // 1
        Connection conn = conectarBD(); // 2
        //Instrução SQL
        sql += "select nome from usuarios";
        sql +=" where login = " + "'" + login + "'";
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

