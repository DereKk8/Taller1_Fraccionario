package Taller1;

public class Fraccionario{

    private int num;
    private int denom;

    public Fraccionario(int num, int denom){
        this.num = num;
        this.denom = denom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDenom() {
        return denom;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }

    public Fraccionario sumar(Fraccionario f){
        Fraccionario res;
        int n, d;

        n = (num * f.getDenom()) + (denom * f.getNum());
        d = denom * f.getDenom();

        res = new Fraccionario(n, d);
        return res;
    }

    public String toString(){
        return "numerador: " + num + " denominador: " + denom + "\n " + num + "\n---" + "\n " + denom;
    }
}
