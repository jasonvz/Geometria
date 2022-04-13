/*
 Mlado es la medida de lados y Nlados es el numero de lado
 */
package novato.proyectofina2;

/**
 *
 * @author jasonvz
 */
public class Poligono extends Geometria {

    private double lado;
    private double lado1;
    private double apote;
    private double perime;

    public Poligono(double lado, double lado1, double apote, double perime) {
        super(0);
        this.lado = lado;
        this.lado1 = lado1;
        this.apote = apote;
        this.perime = perime;
    }

   

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getApote() {
        return apote;
    }

    public void setApote(double apote) {
        this.apote = apote;
    }

    public double getPerime() {
        return perime;
    }

    public void setPerime(double perime) {
        this.perime = perime;
    }

   

    @Override
    public String toString() {
        return "Poligono{" + "lado=" + lado + ", lado1=" + lado1 + ", apote=" + apote + ", perime=" + perime + '}';
    }

   
    @Override
    public double  area () {
        
        return (perime*apote)/2;
        
    }
     @Override
    public double perimetro(){
        return (lado1*lado);
        
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
