/*
 d diagonal menor
 */
package novato.proyectofina2;

/**
 *
 * @author jasonvz
 */
public  class Rombo extends Geometria{
     private double lado1;
     private double Diago;
     private double diag;

    public Rombo(double lado1, double Diago, double diag) {
        super(0);
        this.lado1 = lado1;
        this.Diago = Diago;
        this.diag = diag;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getDiago() {
        return Diago;
    }

    public void setDiago(double Diago) {
        this.Diago = Diago;
    }

    public double getDiag() {
        return diag;
    }

    public void setDiag(double diag) {
        this.diag = diag;
    }

    @Override
    public String toString() {
        return "Rombo{" + "lado1=" + lado1 + ", Diago=" + Diago + ", diag=" + diag + '}';
    }

   


   

    
     @Override
    public double area() {
       
        return (Diago*diag)/2;
    }
    
      @Override
    public double perimetro(){
        return 4*lado1;
        
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
