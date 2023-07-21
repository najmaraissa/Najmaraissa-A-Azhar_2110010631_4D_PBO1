/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1uas;

//inheritance
public class WalimuridDetail extends Walimurid {
   //overriding
    public WalimuridDetail(String walimurid, String nisn) {
        super(walimurid, nisn);
    }
    
    public String getProdi(){
        String kodeJurusan = getNisn().substring(0, 4);
        //seleksi swicth
        switch(kodeJurusan) {
            case "1940":
                return "IPA";
            case "5010":
                return "Sosial";
            case "3440":
                return "Bahasa";
            default:
                return "Kelas Lain";
        }
    }
    
    public int getTahun(){
          return Integer.parseInt(getNisn().substring(4, 8));   
    }
    
    public String getKelas(){
        String kelas = getNisn().substring(8, 10);
        //seleksi swicth
        switch(kelas) {
            case ""
                + "10":
                return "X";
            case "11":
                return "XI";
            case "12":
                return "XII";
            default:
                return "Mahasiswa";
         }
    }
   //polymortisme(override)
    @Override
    public String displayInfo(){
            return super.displayInfo()+
            "\nJurusan = "+getProdi()+
            "\nTahun = "+getTahun()+
            "\nKelas = "+getKelas();
        }
    } 

