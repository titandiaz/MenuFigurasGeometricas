
package menuareas;

public class Equilatero {
    
    private int lado;
    
    static double areaEquilatero(int lado){      
        double areaEquilatero = (Math.pow(lado,2)*Math.sqrt(3))/4;
        return areaEquilatero;
    }
    
    static double perimetroEquilatero(int lado){
        double perimetroEquilatero = 3*lado;
        return perimetroEquilatero;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
