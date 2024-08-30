package br.com.fiap.naturaspring.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection recuperaConexao(){
        try {
            return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
                    "rm550256",
                    "090605");
        } catch (SQLException e){
        throw new RuntimeException(e);        }
    }
}