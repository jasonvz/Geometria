package novato.proyectofina2;

/**
 *
 * @author jasonvz
 */
public class Prisma extends Geometria {

    private double base;
    private double alt;
    private double lar;
    private double anch;

    public Prisma(double base, double alt, double lar, double anch) {
        super(0);
        this.base = base;
        this.alt = alt;
        this.lar = lar;
        this.anch = anch;
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

    public double getLar() {
        return lar;
    }

    public void setLar(double lar) {
        this.lar = lar;
    }

    public double getAnch() {
        return anch;
    }

    public void setAnch(double anch) {
        this.anch = anch;
    }

    @Override
    public String toString() {
        return "Prisma{" + "base=" + base + ", alt=" + alt + ", lar=" + lar + ", anch=" + anch + '}';
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

        return (int) Math.abs(base * alt); //volumen
    }

    @Override
    public int superficie() {
        return (int) Math.abs((2 * lar * anch) * (2 * lar * alt) * (2 * anch * alt)); //superficie

    }

}
