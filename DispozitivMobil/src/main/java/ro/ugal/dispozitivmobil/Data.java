
package ro.ugal.dispozitivmobil;

public class Data {
    private int an;
    private int luna;
    private int zi;

    public Data(int an, int luna, int zi) {
        this.an = an;
        this.luna = luna;
        this.zi = zi;
    }
    
    @Override
    public String toString() {
        return zi+"/"+luna+"/"+an;
    }
    
}
