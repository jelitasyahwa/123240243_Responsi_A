/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class RuangMeeting extends ItemHotel {
    private int kapasitasOrang;
    private String fasilitas;
    
    /**
     *
     */
    public RuangMeeting() {
        
    }
    
    public RuangMeeting(int id, String nama, int harga,
            int kapasitasOrang, String fasilitas) {
        
        super(id, nama, harga);
        this.kapasitasOrang = kapasitasOrang;
        this.fasilitas = fasilitas;
    }
    
    public int getKapasitasOrang() {
        return kapasitasOrang;
    }
    
    public void setKapasitasOrang(int kapasitasOrang) {
        this.kapasitasOrang = kapasitasOrang;
    }
    
    
    public String getFasilitas() {
        return fasilitas;
    }
    
    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }
    
     @Override
    public void tampilInfo() {
        System.out.println("RuangMeeting: " + nama);
    }
  
    
}
