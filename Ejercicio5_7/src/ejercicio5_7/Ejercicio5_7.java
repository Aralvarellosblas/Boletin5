package ejercicio5_7;

import java.util.Scanner;

/*
 * @author Arturo
 */
public class Ejercicio5_7 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Poligonos pol=new Poligonos();
        System.out.println("Escoger uno de los siguientes polígonos\n----------------\n1 - Cuadrado\n2 - Triangulo\n3 - Circulo");
        int opcion=scan.nextInt();
        pol.calcular(opcion);
    }

}
