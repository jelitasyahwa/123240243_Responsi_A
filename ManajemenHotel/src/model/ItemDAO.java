/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import util.DatabaseConnection;

import java.sql.Connection;

import java.sql.ResultSet;

/**
 *
 * @author Lab Informatika
 */
public class ItemDAO {
    Connection conn;
    
    public ItemHotel() {
        conn = DatabaseConnection.getConnection();
        
    }
    
    public boolean insertItem(
    String nama, int harga, String tipeKamar,
            int kapsitasTamu, int kapasitasOrang, String fasilitas){
        
        try {
            String query = 
                    "INSERT INTO items"
                    +"(nama, harga, tipeKamar, kapasitasTamu,"
                    + "kapasitasOrang, fasilitas)"
                    + "VALUES (?,?,?,?,?,?)";
        }
        
        PreparedStatement pst =
                conn.prepareStatement(query);
        
        pst.setString(1. nama);
          pst.setInt(2. harga);
            pst.setInt(3.tipeKamar);
               pst.setInt(3.kapasitasTamu);
                  pst.setInt(5. kapasitasOrang);
                  pst.setString(6. fasilitas);
                  
                  pst.executeUpdate();
                  return true;  
        
    } catch (Exception e) {
    System.out.println(e.getMessage());
    
    return false;
}
}
