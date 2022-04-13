package novato.proyectofina2;

/**
 *
 * @author jasonvz
 */
public class Cono extends Geometria {

    private double base;
    private double late;
    private double alt;

    public Cono(double base, double late, double alt) {
        super(0);
        this.base = base;
        this.late = late;
        this.alt = alt;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLate() {
        return late;
    }

    public void setLate(double late) {
        this.late = late;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    @Override
    public String toString() {
        return "Cono{" + "base=" + base + ", late=" + late + ", alt=" + alt + '}';
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
        return (int) Math.abs(base * alt) / 3; //volumen

    }

    @Override
    public int superficie() {
        return (int) Math.abs(base + late); //superficie

    }

}
