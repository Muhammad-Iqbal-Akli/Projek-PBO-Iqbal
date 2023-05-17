/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nurakli;

/**
 *
 * @author Lenovo
 */
public class tbl_minuman {
    private String id_minuman;
    private String id_menu;
    private String nama_makanan;
    private int haraga;
    private int jumlah_tersedia;
  
    public tbl_minuman (String id_minuman, String id_menu, String nama_makanan, int haraga, int jumlah_tersedia){
       this.id_minuman=id_minuman;
       this.id_menu=id_menu;
       this.nama_makanan=nama_makanan;
       this.haraga=haraga;
       this.jumlah_tersedia=jumlah_tersedia;
    }   
    
    public String getid_minuman (){
       return id_minuman;
         
    }  
    
   public void setid_minuman(String id_minuman){
      this.id_minuman=id_minuman;
   
   }
   
   public String getid_menu (){
       return id_menu;
         
    }  
    
   public void setid_menu(String id_menu){
      this.id_menu=id_menu;
   
   }
   
    public String getnama_makanan (){
       return nama_makanan;
         
    }  
    
   public void setnama_makanan(String nama_makanan){
      this.nama_makanan=nama_makanan;
   
   }
   
    public int getharga (){
       return haraga;
         
    }  
    
   public void setharga(String harga){
      this.haraga=haraga;
   
   }
       public int getjumlah_tersedia (){
       return jumlah_tersedia;
         
    }  
    
   public void setjumlah_tersedia(int jumlah_tersedia){
      this.jumlah_tersedia=jumlah_tersedia;
   
   }  
}
