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
public class Triangulo extends Geometria{
    private double lado1;
    private double lado2;
    private double lado3;
     private double peri;

    public Triangulo(double lado1, double lado2, double lado3, double peri) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.peri = peri;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getPeri() {
        return peri;
    }

    public void setPeri(double peri) {
        this.peri = peri;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", peri=" + peri + '}';
    }
    

   
    
       @Override
    public double perimetro() {
        
        return (lado1+lado2+lado3)/2;
       
    }
    @Override
     public double area() {
        
         return (peri*(peri-lado1)*(peri-lado2)*(peri-lado3));
         
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
