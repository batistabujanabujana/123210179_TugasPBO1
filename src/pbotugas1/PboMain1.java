/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbotugas1;

import java.util.Scanner;

/** 
 * 
 * @author M S I
 */ 
 // 123210179 Vincentius Batista Rahma Bujana
public class PboMain1 {

   
    public static void main(String[] args) {
       Scanner masukan = new Scanner(System.in);
        
        int pilihMenu;
        int ulang; 
        int jariJari; 
        int panjang, lebar; 
        
        do {
            System.out.println("===============");
            System.out.println("MENU UTAMA");
            System.out.println("================");
            System.out.println("1.Hitung Balok");
            System.out.println("2.Hitung Tabung");
            System.out.println("0.Exit");
            System.out.print("Pilih : ");
             pilihMenu = masukan.nextInt();
            
            
            switch (pilihMenu) {
                case 1: { 
                    System.out.println("===============");
                    System.out.println("1. Menu Hitung Balok");
                    System.out.println("===================");
                    System.out.print("Input Panjang : ");
                    panjang = masukan.nextInt();
                    System.out.print("Input Lebar   : ");
                    lebar = masukan.nextInt();
                    Balok blk = new Balok(6,3,2);
                    System.out.print("Input Tinggi  : ");
                    int tinggit = masukan.nextInt(); 
                    
                    blk.setTinggi(tinggit);  //set(memasukan) dengan hubungan privat
                    
                  
                    Balok balok = new Balok(tinggit, panjang, lebar);
                    
                    System.out.println("========");
                    System.out.println("Hasil : ");
                    System.out.println("==================");
                    System.out.println("Luas Persegi Panjang    = " + balok.luasBidang());
                    System.out.println("Keliling Persegi Panjang= " + balok.keliling());
                    System.out.println("Volume Balok            = " + balok.volume());
                    System.out.println("Luas Permukaan Balok    = " + balok.luasPermukaan()) ; 
                    break;
               }
                    
                case 2: { 
                    System.out.println("==============");
                    System.out.println("2.Menu Hitung Tabung");
                    System.out.println("===================");
                    System.out.print("Input Jari-Jari : ");
                    jariJari= masukan.nextInt();
                    Tabung tab = new Tabung(2,7); 
                    System.out.print("Input Tinggi    : " );
                    int  tinggik = masukan.nextInt();
                    
                    tab.setTinggi(tinggik); //set untuk memasukan
                    
                    System.out.println(" ");
                       
                    Tabung tabung = new Tabung(tinggik,jariJari);
                    
                    System.out.println("========================");
                    System.out.println("Hasil : ");
                    System.out.println("========================");
                    System.out.println("Luas Lingkaran        = " + tabung.luasBidang());
                    System.out.println("Keliling Lingkaran    = " + tabung.keliling());
                    System.out.println("Volume Tabung         = " + tabung.volume());
                    System.out.println("Luas Permukaan Tabung = " + tabung.luasPermukaan()); 
                    break;
               }
                case 0: 
                    System.exit(0); 
                    break;
                    
                default: 
                    System.out.println("Tidak tersedia pada Menu");
                    break;
            }
            System.out.println("===================");
            System.out.print("KEMBALI KE MENU? (Ya=1 / Tidak=0) : ");
            ulang = masukan.nextInt();
            
        } while (ulang !=0 );
       
    }
    
    }
    

