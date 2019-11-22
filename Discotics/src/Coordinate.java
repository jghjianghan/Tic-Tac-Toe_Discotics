/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CCEJJV
 */
public class Coordinate {
    private final int baris;
    private final int kolom;
    
    public Coordinate(int baris,int kolom){
        this.baris = baris;
        this.kolom = kolom;
    }
    
    public int getBaris(){
        return this.baris;
    }
    
    public int getKolom(){
        return this.kolom;
    }
    
}
