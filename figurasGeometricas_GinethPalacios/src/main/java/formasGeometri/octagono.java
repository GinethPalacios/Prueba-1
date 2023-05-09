package formasGeometri;
import java.util.Scanner;
public class octagono extends Figuras 
{
    private double perimetroOctagono,apotemaOctagono,areaOctagono,ladoOctagono;
    
    public octagono(){}

    public octagono(double perimetroOctagono, double apotemaOctagono, double areaOctagono, double ladoOctagono) {
        this.perimetroOctagono = perimetro;
        this.apotemaOctagono = apotema;
        this.areaOctagono = area;
        this.ladoOctagono= lado;
    }


    public double getPerimetro() {
        return perimetro;
    }


    public void setPerimetro(double perimetroOctagono) {
        this.perimetro = perimetro;
    }


    public double getApotema() {
        return apotema;
    }


    public void setApotema(double apotemaOctagono) {
        this.apotema = apotema;
    }


    public double getArea() {
        return area;
    }


    public void setArea(double areaOctagono) {
        this.area = area;
    }


    public double getLado() {
        return lado;
    }


    public void setLado(double ladoOctagono) {
        this.lado = lado;
    }
    
    Scanner lectura = new Scanner (System.in);

    @Override
    public void calcularArea() 
    {
        area = perimetro * apotema/2;
        System.out.println("El area es "+ area);
    }

    @Override
    public void calcularPerimetro()
    {
        perimetro = lado * 8;
        System.out.println("El perimetro es"+ perimetro );
    }

    
}
