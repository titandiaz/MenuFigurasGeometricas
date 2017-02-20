
package menuareas;

public class TrianguloRectangulo {
    
    private int base;
    private int altura;
    
    static double areaTrianguloRectangulo(int base, int altura){
        double areaRectangulo = (base*altura)/2;
        return areaRectangulo;
        }
    static double perimetroTrianguloRectangulo(int base, int altura){

        double hipotenusaRectangulo = Math.sqrt((Math.pow(base, 2)+ Math.pow(altura, 2) ));
        double perimetroTrianguloRectangulo = altura + base + hipotenusaRectangulo;	
        return perimetroTrianguloRectangulo;
        }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
