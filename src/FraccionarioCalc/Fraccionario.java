package FraccionarioCalc;

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

    public Fraccionario restar(Fraccionario f)
    {
        Fraccionario res;
        int n, d;

        n = (num * f.getDenom()) - (denom * f.getNum());
        d = denom * f.getDenom();

        res = new Fraccionario(n, d);
        return res;
    }

    public Fraccionario multiplicar(Fraccionario f)
    {
        Fraccionario res;
        int n, d;

        n = num * f.getNum();
        d = denom * f.getDenom();

        res = new Fraccionario(n, d);
        return res;

    }

    public Fraccionario dividir(Fraccionario f)
    {
        Fraccionario res;
        int n, d;

        n = num * f.getDenom();
        d = denom * f.getNum();

        res = new Fraccionario(n, d);
        return res;
    }

    public Fraccionario simplificar()
    {
        Fraccionario res;
        int n, d, max, min, divisor = -1;

        if(num >= denom)
        {
            max = num;
            min = denom;
        }
        else
        {
            max = denom;
            min = num;
        }


        for(int i = max; i > 1; i--)
        {
            if(min % i == 0 && max % i == 0){
                divisor = i;
                break;
            }
        }

        System.out.println("DIVISOR " + divisor);

        n = num / divisor;
        d = denom / divisor;
        res = new Fraccionario(n, d);

        return res;
    }

    public String toString(){
        return "numerador: " + num + " denominador: " + denom + "\n " + num + "\n---" + "\n " + denom;
    }
}
