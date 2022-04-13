/**
 * Bm es base mayor
 * bm es base menor
 * alt es altura
 *
 */
package novato.proyectofina2;

/**
 *
 * @author jasonvz
 */
public class Trapecio extends Geometria {

    private double Bm;
    private double bm;
    private double alt;
    private double lado;
    private double lado1;

    public Trapecio(double Bm, double bm, double alt, double lado, double lado1) {
        super(4);
        this.Bm = Bm;
        this.bm = bm;
        this.alt = alt;
        this.lado = lado;
        this.lado1 = lado1;
    }

    public double getBm() {
        return Bm;
    }

    public void setBm(double Bm) {
        this.Bm = Bm;
    }

    public double getbm() {
        return bm;
    }

    public void setbm(double bm) {
        this.bm = bm;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    @Override
    public String toString() {
        return "Trapecio: \n" + super.toString() + "Bm=" + Bm + ", bm=" + bm + ", alt=" + alt + ", lado=" + lado + ", lado1=" + lado1;
    }

    @Override
    public double area() {

        return ((Bm + bm) * alt) / 2;

    }

    @Override
    public double perimetro() {
        return Bm + bm + lado + lado1;

    }
         @Override
    public int volumen() {
        return (0);

    }

    @Override
    public int superficie() {
        return (0);

    }
}
