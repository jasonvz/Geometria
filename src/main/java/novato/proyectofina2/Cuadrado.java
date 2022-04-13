/*
 * Cuadrado
 */
package novato.proyectofina2;

/**
 * @author jasonvz
 */
public class Cuadrado extends Geometria {

    private double lado;

    public Cuadrado(double lado) {
        super(4);
        this.lado = lado;

    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }

    @Override
    public double area() {
        return lado * lado;

    }

    @Override
    public double perimetro() {
        return (lado + lado + lado + lado);
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
