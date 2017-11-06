package ejercicio5_6;

import java.util.Scanner;

/*
 * @author Arturo
 */
public class Ejercicio5_6 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introducir un nome e o numero de ventas");
        Artigos art=new Artigos(teclado.nextLine(),teclado.nextDouble());
        double vent=art.getVentas();
        if(vent<=100){
            System.out.println("Atriculo de consumo Baixo");
            System.out.println(art.toString());
        }
        else if(vent>100&&vent<=500){
            System.out.println("Atriculo de consumo Medio");
            System.out.println(art.toString());
        }
        else if(vent>500&&vent<=1000){
            System.out.println("Atriculo de consumo Alto");
            System.out.println(art.toString());
        }
        else{
            System.out.println("Atriculo de Primeira necesidad");
            System.out.println(art.toString());
        }
    }

}
