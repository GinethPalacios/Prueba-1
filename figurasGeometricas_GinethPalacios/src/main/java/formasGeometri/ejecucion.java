package formasGeometri;

import java.util.Scanner;

public class ejecucion
{
    public static void main(String[] args)
    {
        int opcion;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Elige la figura \n1.eneagono \n2.trapecio \n3.octagono");
        opcion = lectura.nextInt();
        
        eneagono ene = new eneagono();
        trapecio tra = new trapecio();
        octagono octa = new octagono();
        switch (opcion) 
        {
            case 1:
            System.out.println("Ingrese el lado");
            ene.setLado(lectura.nextDouble());
            ene.calcularPerimetro();
            System.out.println("Este es el valor del perimetro" +ene.getLado());

            System.out.println("Ingrese el apotema");
            ene.setApotema(lectura.nextDouble());
            ene.calcularArea();
            
            break;
            
            case 2:
            System.out.println("Ingrese el lado");
            tra.setLado(lectura.nextDouble());
            tra.calcularPerimetro();
            System.out.println("Este es el valor del area" +tra.getLado());

            System.out.println("Ingrese la base superior");
            tra.setBaseS(lectura.nextDouble());
            System.out.println("Ingrese la base inferior");
            tra.setBaseI(lectura.nextDouble());
            System.out.println("Ingrese la altura");
            tra.setAltura(lectura.nextDouble());
            tra.calcularArea();
            System.out.println("Este es el valo del area" + tra.getArea());

            break;

            case 3:
            System.out.println("Ingrese el lado");
            octa.setLado(lectura.nextDouble());
            octa.calcularPerimetro();
            System.out.println("Este es el valor del perimetro" +octa.getLado());

            System.out.println("Ingrese el apotema");
            octa.setApotema(lectura.nextDouble());
            octa.calcularArea();
            System.out.println("Este es el valor del area" +octa.getArea());
            break; 

        }
        lectura.close();
    }
}
