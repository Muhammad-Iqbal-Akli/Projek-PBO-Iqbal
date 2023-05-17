/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nurakli;

/**
 *
 * @author Lenovo
 */
public class tbl_menu {
       private int id_menu;
    private String jenis_menu;
    
    public tbl_menu (int id_menu, String jenis_menu){
       this.id_menu=id_menu;
       this.jenis_menu=jenis_menu;
    }
    
    public int getid_menu(){
        return id_menu;
    }
    
    public void setid_menu(int id_menu){
        this.id_menu=id_menu;
        
    }
    public String getjenis_menu(){
        return jenis_menu;
    }
    
    public void Setjenis_menu(String jenis_menu){
        this.id_menu=id_menu; 
    }
}
