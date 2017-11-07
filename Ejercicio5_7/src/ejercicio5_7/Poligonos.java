package ejercicio5_7;

import java.util.Scanner;

/*
 * @author Arturo
 */
public class Poligonos {
    private float lado, base, altura, radio, area;
    Scanner sc=new Scanner(System.in);
    public Poligonos() {
    }
    public void calcular(int op){
        switch(op){
            case 1: System.out.println("Introducir el lado del cuadrado");
            lado=sc.nextFloat();
            area=(float) Math.pow(lado, 2);
                System.out.println("El área del cuadrado es: "+area);
            break;
            case 2: System.out.println("Indroducir la base del triangulo");
            base=sc.nextFloat();
                System.out.println("Introducir la altura del triangulo");
            altura=sc.nextFloat();
            area=(base*altura)/2;
                System.out.println("El área del triangulo es: "+area);
            break;
            case 3: System.out.println("Introducir el radio del circulo");
            radio=sc.nextFloat();
            area=(float) (Math.PI*Math.pow(radio, 2));
                System.out.println("El área del circulo es: "+area);
            break;
            default: System.out.println("Opcion incorrecta");
        }
    }
    
}
