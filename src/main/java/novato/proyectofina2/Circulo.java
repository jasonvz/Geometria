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
public  class Circulo extends Geometria {

    private double radio;
    private double areaRadio;
   

    public Circulo(double radio, double areaRadio) {
        super(0);
        this.radio = radio;
        this.areaRadio = areaRadio;
    }

  

   

   

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAreaRadio() {
        return areaRadio;
    }

    public void setAreaRadio(double areaRadio) {
        this.areaRadio = areaRadio;
    }

    @Override
    public String toString() {
        return  "radio=" + radio + ", areaRadio=" + areaRadio;
    }

    
    @Override
 public double area() {
     return    Math.PI * radio * radio;
        
     
 }
    @Override
  public double perimetro() {
     return   (Math.PI * Math.pow(radio, 2)); //perimetro
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
