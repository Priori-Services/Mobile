package com.example.prjpriori;

import android.content.Context;
import android.os.StrictMode;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Acessa {
    public ResultSet RS;
    public java.sql.Statement stmt;
    public Connection con;

    public Connection entBanco(Context ctx){

        try {//modo estrito
            StrictMode.ThreadPolicy regra = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(regra);

            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
           // Toast.makeText(ctx.getApplicationContext(), "Drive correto", Toast.LENGTH_SHORT).show();
        }catch (Exception ex) {
            Toast.makeText(ctx.getApplicationContext(), "Drive não correto", Toast.LENGTH_SHORT).show();
        }

        try{
            String url = "jdbc:jtds:sqlserver://192.168.1.15;databaseName=Priori";
            con = DriverManager.getConnection(url, "sa", "12345");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            // Toast.makeText(ctx.getApplicationContext(), "Conectado", Toast.LENGTH_SHORT).show();
        }
        catch(SQLException ex){
            Toast.makeText(ctx.getApplicationContext(), "Erro de Conexão", Toast.LENGTH_SHORT).show();
        }
        return con;
    }
    //Fim do método que vai conectar o banco

}
