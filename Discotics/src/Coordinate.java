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
    
    public static int coordinateToNumber(Coordinate n) {
        switch (n.getBaris()) {
            case 0:
                switch (n.getKolom()) {
                    case 0:
                        return 1;
                    case 1:
                        return 2;
                    case 2:
                        return 3;
                }
            case 1:
                switch (n.getKolom()) {
                    case 0:
                        return 4;
                    case 1:
                        return 5;
                    case 2:
                        return 6;
                }
            case 2:
                switch (n.getKolom()) {
                    case 0:
                        return 7;
                    case 1:
                        return 8;
                    case 2:
                        return 9;
                }
        }
        return 0;
    }
    
    public static Coordinate numberToCoordinate(int n) {
        switch (n) {
            case 1:
                return new Coordinate(0, 0);
            case 2:
                return new Coordinate(0, 1);
            case 3:
                return new Coordinate(0, 2);
            case 4:
                return new Coordinate(1, 0);
            case 5:
                return new Coordinate(1, 1);
            case 6:
                return new Coordinate(1, 2);
            case 7:
                return new Coordinate(2, 0);
            case 8:
                return new Coordinate(2, 1);
            case 9:
                return new Coordinate(2, 2);
        }
        return null;
    }
}
