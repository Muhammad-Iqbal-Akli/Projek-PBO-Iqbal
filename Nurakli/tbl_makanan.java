/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nurakli;

/**
 *
 * @author Lenovo
 */
public class tbl_makanan {
    private String id_makanan;
    private String id_menu;
    private String nama_makanan;
    private int haraga;
    private int jumlah_tersedia;
  
    public tbl_makanan (String id_makanan, String id_menu, String nama_makanan, int haraga, int jumlah_tersedia){
       this.id_makanan=id_makanan;
       this.id_menu=id_menu;
       this.nama_makanan=nama_makanan;
       this.haraga=haraga;
       this.jumlah_tersedia=jumlah_tersedia;
    }   
    
    public String getid_makanan (){
       return id_makanan;
         
    }  
    
   public void setid_makanan(String id_makanan){
      this.id_makanan=id_makanan;
   
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
   
    public int getharaga (){
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

    