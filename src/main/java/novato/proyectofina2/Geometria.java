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
public abstract class Geometria implements IGeometria{
     protected int numerolados;

    public Geometria(int numerolados) {
        this.numerolados = numerolados;
    }

    public int getNumerolados() {
        return numerolados;
    }

    @Override
    public String toString() {
        return "numerolados=" + numerolados;
    }
  //Declaramos el metodo abstract
    
    
    public abstract double perimetro();
    
    public abstract int volumen();
      public abstract int superficie();
       
    
}
