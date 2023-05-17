/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nurakli;

/**
 *
 * @author Lenovo
 */
public class tbl_pesanan_minuman {
   private String id_makanan;
   private String id_pemesan; 
   private int jumlah_pesanan;
  
   
  public tbl_pesanan_minuman (String id_makanan, String id_pemesan, int jumlah_pemesan){
       this.id_makanan=id_makanan;
       this.id_pemesan=id_pemesan;
       this.jumlah_pesanan=jumlah_pesanan;
    }
    
    public String getid_makanan(){
        return id_makanan;
    }
    
    public void setid_makanan(String id_makanan){
        this.id_makanan=id_makanan;
    }
    
    public String getid_pemesan(){
        return id_pemesan;
    }
    
    public void setid_pemesan(String id_pemesan){
        this.id_pemesan=id_pemesan;
    }
    
        public int getjumlah_pesanan(){
        return jumlah_pesanan;
    }
    
    public void setjumlah_pesanan (int jumlah_pesanan){
        this.jumlah_pesanan=jumlah_pesanan;
    }
}
