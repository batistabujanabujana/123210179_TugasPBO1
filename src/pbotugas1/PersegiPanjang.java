/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbotugas1;

/**
 *
 * @author M S I
 */
public class PersegiPanjang implements MenghitungBidang{ 
    int panjang,lebar; 

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luasBidang() {
   return (double)panjang* (double)lebar; //Overloading
    }
    
    @Override
    public double keliling() {   
     return 2*(panjang+lebar);   
    }
    
}
