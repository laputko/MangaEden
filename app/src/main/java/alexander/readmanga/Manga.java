package alexander.readmanga;


import java.util.Arrays;

public class Manga {
    private String a;               //название
    private String[] c;            //жанры
    private int h;                  //год
    private String i;               //индетификатор
    private String im;              //изображение
    private int ld;                 //последняя дата обновления
    private int s;
    private String t;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String[] getC() {
        return c;
    }

    public void setC(String[] c) {
        this.c = c;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public int getLd() {
        return ld;
    }

    public void setLd(int ld) {
        this.ld = ld;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    Manga(String a, String[] c, int h, String i, String im, int ld, int s, String t){
        this.a = a;
        this.c = c;
        this.h = h;
        this.i = i;
        this.im = im;
        this.ld = ld;
        this.s = s;
        this.t = t;
    }

    @Override
    public String toString() {
        return "a: "+a+"\nc: "+Arrays.deepToString(c)+"\nh: "+h+"\ni: "+i+"\nim: "+im+"\nld: "+ld+"\ns: "+s+"\nt: "+t;
    }
}
