
package menuareas;


public class Circulo {
    
    private int radio;
    
    static double areaCirculo(int radio){
        double areaCirculo =  Math.PI*(radio*radio);
        return areaCirculo;
        }
    
    static double perimetroCirculo(int radio){
        double perimetroCirculo = 2*Math.PI*radio;
        return perimetroCirculo;
        }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
