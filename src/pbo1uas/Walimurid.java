/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1uas;

//class
public class Walimurid {
     //atribut dan encapculation
    private String walimurid;
    private String nisn;

    //construktor
    public Walimurid(String walimurid, String nisn) {
        this.walimurid = walimurid;
        this.nisn = nisn;
    }

    //setter
    public void setWalimurid(String walimurid) {
        this.walimurid = walimurid;
    }

    public void setNisn(String nisn) {
        this.nisn = nisn;
    }
    

 
    //getter
    public String getWalimurid() {
        return walimurid;
    }

    public String getNisn() {
        return nisn;
    }
    
    
    
    
    public String displayInfo() {
        return "\nWalimurid = "+getWalimurid()+ "NISN = "+getNisn();
    }
    
    //polymortisme(overloding)
    public String displayInfo(String alamat){
        return displayInfo()+"\nAlamat = "+alamat;
    }
   
}
