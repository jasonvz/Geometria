package novato.proyectofina2;

/**
 *
 * @author jasonvz
 */
public class Cilindro extends Geometria {

    private double radio;
    private double alt;

    public Cilindro(double radio, double alt) {
        super(0);
        this.radio = radio;
        this.alt = alt;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }
    
    

    @Override
    public String toString() {
        return "Cilindro{" + "radio=" + radio + ", alt=" + alt + '}';
    }

    @Override
    public double area() {
       
        return (0);

    }
    
    @Override
    public double perimetro(){
        return (0);
        
    } 
    
    @Override
    public int volumen(){
        return  (int) Math.abs((Math.PI)*(radio*radio)*(alt)); //volumen
        
    } 
    
     @Override
    public int superficie(){
        return  (int) Math.abs(((2)*(Math.PI)*(radio))*(alt+radio)); //superficie

    }

    
}
