package org.example;

public class Laskin {

    private int tulos;  	// Muuttuja tulokselle

    public void nollaa() {  // Nollaa tulosmuuttuja
        tulos = 0;
    }

    public int annaTulos() {
        return tulos;
    }

    public void lisaa(int n) {
        tulos = tulos + n;
    }

    public void vahenna(int n) {
        tulos = tulos - n;
    }

    public void kerro(int n) {
        tulos = tulos * n;
    }

    public void jaa(int n) {
        if (n==0) throw new ArithmeticException("Nollalla ei voi jakaa");
        tulos = tulos / n;
    }

    public void nelio(int n) {
        tulos = n * n;
    }

    public void neliojuuri(int n) {
        if(n<0) throw new ArithmeticException("Negatiiviselle luvulle ei voi laskea neliöjuurta");
        tulos = (int)Math.sqrt(n);
    }

    public void virtaON() {
        tulos = 0;
        System.out.println("...Virta päälle...");
    }

    public void virtaOFF() {
        System.out.println("...Katkaistaan virta...");
    }

}
