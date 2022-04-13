/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novato.proyectofina2;

/**
 *
 * @author jasonvz
 */
public class Romboide extends Geometria {

    private double base;
    private double alt;
    private double lado;

    public Romboide(double base, double alt, double lado) {
        super(4);
        this.base = base;
        this.alt = alt;
        this.lado = lado;
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

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Romboide: \n " + super.toString() + "base=" + base + ", alt=" + alt + ", lado=" + lado;
    }

    @Override
    public double area() {

        return Math.sqrt(base * alt);

    }

    @Override
    public double perimetro() {
        return 2 * (base + lado);

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
