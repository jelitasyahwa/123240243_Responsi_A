/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class Kamar extends ItemHotel  {
    private String tipeKamar;
    private int kapasitasTamu;
    
    
    public Kamar() {
        
    }
    
    public Kamar(int id, String nama, int harga,
            String tipeKamar, int kapasitasTamu ) {
        
        super(id, nama, harga);
        this.tipeKamar = tipeKamar;
        this.kapasitasTamu = kapasitasTamu;
    }
    
    public String getTipeKamar() {
        return tipeKamar;
    }
    
    public void setTipeKamar(String tipeKamar) {
        this.tipeKamar = tipeKamar;
    }
    
    
    public int getKapasitasTamu() {
        return kapasitasTamu;
    }
    
    public void setKapasitasTamu(int kapasitasTamu) {
        this.kapasitasTamu = kapasitasTamu;
    }
    
    @Override
    public void tampilInfo() {
        System.out.println("Kamar: " + nama);
    }
    
}