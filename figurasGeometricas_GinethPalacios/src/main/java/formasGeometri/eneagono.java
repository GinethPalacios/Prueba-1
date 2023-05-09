package formasGeometri;
import java.util.Scanner;

public class eneagono extends Figuras
{
    private double perimetroEneagono,apotemaEneagono,areaEneagono,ladoEneagono;
    public eneagono(){}

    public eneagono(double perimetroEneagono, double apotemaEneagono, double areaEneagono, double ladoEneagono) {
        this.perimetroEneagono = perimetro;
        this.apotemaEneagono = apotema;
        this.areaEneagono = area;
        this.ladoEneagono = lado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetroEneagono) {
        this.perimetro = perimetro;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotemaEneagono) {
        this.apotema = apotema;
    }

    public double getArea() { 
        return area;
    }

    public void setArea(double areaEneagono) {
        this.area = area;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double ladoEneagono) {
        this.lado = lado;
    }

    Scanner lectura = new Scanner (System.in);
    
    @Override
    public void calcularArea() 
    {
        area = lado * apotema/2;
        System.out.println("El area es "+ area);
        
    }
    public void calcularPerimetro()
    {
        perimetro = lado * 9;
        System.out.println("El perimetro es"+ perimetro );
    }
}
