/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbotugas1;

/**
 *
 * @author M S I
 */
public class Lingkaran implements MenghitungBidang { 
    int jari_jari; 

    public Lingkaran(int jari_jari) {
        this.jari_jari = jari_jari;
    }

    

    @Override      
    public double luasBidang() { 
    //bawah ini overloading pergantian dari int ke double
    return Math.PI*(double)jari_jari*(double)jari_jari; //overloading    
    }

    @Override
    public double keliling() {
        return Math.PI*jari_jari*2; 
    }

      
    
}
