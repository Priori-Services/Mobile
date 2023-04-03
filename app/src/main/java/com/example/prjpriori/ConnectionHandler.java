package com.example.prjpriori;

import android.content.Context;
import android.os.StrictMode;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import androidx.annotation.Nullable;

class ConnectionHandler {
    @Nullable
    public static Connection CreateConnection(Context ctx){
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitNetwork().build());
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
        } catch (InstantiationException ex) {
            Toast.makeText(ctx.getApplicationContext(), "Drive não correto", Toast.LENGTH_SHORT).show();
        } catch (ClassNotFoundException ex) {
            Toast.makeText(ctx.getApplicationContext(), "Driver não encontrado", Toast.LENGTH_SHORT).show();
        } catch (Exception ignored) {

        }

        try {
            return DriverManager.getConnection("jdbc:jtds:sqlserver://localhost:1433;databaseName=Priori", "sa", "12345");
        }
        catch(SQLException ignored){
        }
        return null;
    }
}
