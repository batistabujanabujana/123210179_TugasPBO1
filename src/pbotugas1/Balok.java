/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbotugas1;

/**
 *
 * @author M S I
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    private int tinggi;  

    public Balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    } 

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    

    @Override
    public double luasPermukaan() {
        return 2*super.luasBidang()+ (2*(super.panjang*tinggi)) + (2*(super.lebar*tinggi)); 
    }

    @Override
    public double volume() {
       return super.luasBidang()*tinggi;
    }
    

   }
