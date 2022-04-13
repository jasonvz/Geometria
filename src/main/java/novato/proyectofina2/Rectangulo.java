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
public class Rectangulo extends Geometria{ 
private double base;
private double alt;

    public Rectangulo(double base, double alt) {
        super(4);
        this.base = base;
        this.alt = alt;
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
        return "Rectangulo{" + "base=" + base + ", alt=" + alt + '}';
    }


   
@Override
  public double area() {
      return (base*alt);
      
  }
  
  @Override
  public double perimetro() {
      return (2*(alt*base));
      
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
