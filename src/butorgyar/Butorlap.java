package butorgyar;

public class Butorlap {
    private double hosszusag; //meter
    private double szelesseg; //meter
    private boolean tartolapE;
    public final int tartolapAr = 5000;
    public final int hatlapAr = 500;

    public Butorlap(double hosszusag, double szelesseg, boolean tartolapE) {
        this.hosszusag = hosszusag/100;
        this.szelesseg = szelesseg/100;
        this.tartolapE = tartolapE;
    }
    
    public double arSzamol(){
        return hosszusag * szelesseg * (this.tartolapE ? tartolapAr : hatlapAr);
    }
}
