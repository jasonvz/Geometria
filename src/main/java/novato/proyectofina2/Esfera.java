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
public class Esfera extends Geometria {

    private double radio;

    

    public Esfera(double radio) {
        super(0);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Esfera" + "radio=" + radio;
    }
    
    @Override
    public double area() {
      
        
      return  (0);
    }
    
     @Override
    public double perimetro(){
        return (0);
        
    } 
 
     @Override
    public int volumen(){
        return (int) Math.abs(4/3*Math.pow(radio, 3)); //volumen
        
    } 
    
     @Override
    public int superficie(){
        return  (int) Math.abs(4 * Math.PI * Math.pow(radio, 2)); //superficie
    }
        
     
}
