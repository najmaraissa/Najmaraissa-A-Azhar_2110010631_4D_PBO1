/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1uas;

import java.util.Scanner;
public class WalimuridBeraksi {
    public static void main(String[] args) {
        //objek
        //DataDiri walimurid = new Walimurid("00308777656443410","Raissa");
        
        //System.out.println(walimurid.displayInfo());
        //System.out.println(walimurid.displayInfo("Banjarmasin"));
        
        //error headling
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
       WalimuridDetail[] walimurid = new WalimuridDetail[2];
        
        //perulangan
        for(int i =0; i<walimurid.length;i++){  
        System.out.print(" Masukkan WALIMURID "+(i+1)+" = ");
        String Walimurid = scanner.nextLine();
        System.out.print(" Masukkan NISN  "+(i+1)+" = ");
        String nisn = scanner.nextLine();
        
        //objek
        walimurid[i] = new WalimuridDetail(Walimurid,nisn);
        }
        
        //perulangan
        for(WalimuridDetail data : walimurid) {
            System.out.println("====================");
            System.out.println("Data Diri = ");
            System.out.println(data.displayInfo());
        }
    }   catch(NumberFormatException e ) {
            System.out.println("Kesalahan Format Nomor "+e.getMessage());
    }   catch(StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format NISN"+e.getMessage());
    }
        catch (Exception e){
        System.out.println("Kesalahan Umum"+e.getMessage());
    }
  }    
}
