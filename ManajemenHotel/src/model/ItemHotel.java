/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public abstract class ItemHotel {
    protected int id;
    protected String nama;
    protected int harga;
    
        public ItemHotel(int id, String nama, int harga) {
            this.id = id;
            this.nama = nama;
            this.harga = harga;
            
        }
        
        public int getId() {
            return id;
        }
        
         public void setId(int id) {
            this.id = id;
        }
         
          public String getNama() {
            return nama;
        }
        
         public void setNama(String nama) {
            this.nama = nama;
        }
         
         
        public int getHarga() {
            return harga;
        }
        
         public void setHarga(int harga) {
            this.harga = harga;
        }
         
         public abstract void tampilInfo();
    }
    
