package novato.proyectofina2;

/**
 *
 * @author jasonvz
 */
public class Hexaedro extends Geometria {

    private double longitud;

    public Hexaedro(double longitud) {
        super(0);
        this.longitud = longitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Hexaedro{" + "longitud=" + longitud + '}';
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
        return (int) Math.abs(longitud * longitud * longitud); //volumen

    }

    @Override
    public int superficie() {
        return (int) Math.abs(6 * longitud * longitud);//superficie
    }

}
