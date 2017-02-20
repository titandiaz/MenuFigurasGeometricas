
package menuareas;

public class rectangulo {
    
    private int base;
    private int altura;
    
    static double areaRectangulo(int base, int altura){
        double area = base*altura;
        return area;
    }
    
    static double perimetroRectangulo(int base, int altura){
        double perimetro = (base*2)+(altura*2);
        return perimetro;
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
