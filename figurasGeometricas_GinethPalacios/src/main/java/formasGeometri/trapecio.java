package formasGeometri;
import java.util.Scanner;
public class trapecio extends Figuras
{
    
    private double baseS,baseI,altura,area,lado, perimetro;

    public trapecio(){}

    public trapecio(double baseS, double baseI, double altura, double area, double lado, double perimetro) {
        this.baseS = baseS;
        this.baseI = baseI;
        this.altura = altura;
        this.area = area;
        this.lado = lado;
        this.perimetro = perimetro;
    }

    public double getBaseS() {
        return baseS;
    }



    public void setBaseS(double baseS) {
        this.baseS = baseS;
    }



    public double getBaseI() {
        return baseI;
    }



    public void setBaseI(double baseI) {
        this.baseI = baseI;
    }



    public double getAltura() {
        return altura;
    }



    public void setAltura(double altura) {
        this.altura = altura;
    }



    public double getArea() {
        return area;
    }



    public void setArea(double area) {
        this.area = area;
    }



    public double getLado() {
        return lado;
    }



    public void setLado(double lado) {
        this.lado = lado;
    }



    public double getPerimetro() {
        return perimetro;
    }



    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    Scanner lectura = new Scanner (System.in);

    @Override
    public void calcularArea()
    {
        area = (baseS + baseI) * altura /2;
        System.out.println("El area es "+ area); 
    }

    public void calcularPerimetro()
    {
        perimetro = lado * 4;
        System.out.println("El perimetro es"+ perimetro );
    }


}
