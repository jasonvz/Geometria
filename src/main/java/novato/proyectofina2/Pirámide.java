package novato.proyectofina2;

/**
 *
 * @author jasonvz
 */
public class Pirámide extends Geometria {

    private double base1;
    private double base;
    private double alt;

    public Pirámide(double base1, double base, double alt) {
        super(0);
        this.base1 = base1;
        this.base = base;
        this.alt = alt;
    }

    public double getBase1() {
        return base1;
    }

    public void setBase1(double base1) {
        this.base1 = base1;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    @Override
    public String toString() {
        return "Pir\u00e1mide{" + "base1=" + base1 + ", base=" + base + ", alt=" + alt + '}';
    }

    @Override
    public double area() {

        return (0);
    }

    @Override
    public double perimetro() {
        return (0);

    }

    @Override
    public int volumen() {
        return (int) Math.abs(base * alt) / 3;//volumen
    }

    @Override
    public int superficie() {
        return (int) Math.abs(base1 * alt) / 2; //superficie 

    }
}
