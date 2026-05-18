/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Lab Informatika
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306?db_hotel";
    private static final String USER="root";
    private static final String PASSWORD="";
    
    public static  Connection getConnection() {
        try{
            return DriverManager.getConnection(
            URL,
                    USER,
                    PASSWORD
            );
            
        } catch (Exception e) {
            System.out.println("koneksi gagal");
            return null;
        }
        
    }
}
