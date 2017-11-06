package ejercicio5_4;

import java.util.Scanner;

/*
 * @author Arturo
 */
public class Ejercicio5_4 {

    public static void main(String[] args) {
        String nom, nom2;
        float peso;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un nome:");
        nom=teclado.next();
        System.out.println("Introduce un peso:");
        peso=teclado.nextFloat();
        Persoa p1=new Persoa(nom, peso);
        System.out.println("Introduce un nome:");
        nom2=teclado.next();
        System.out.println("Introduce un peso:");
        peso=teclado.nextFloat();
        Persoa p2=new Persoa(nom2,peso);
        if(p1.getPeso()>p2.getPeso()){
            System.out.println("Pesa mais:\n"+p1.toString());
            System.out.println("A diferencia de peso é "+(p1.getPeso()-p2.getPeso())+" kg");
        }
        else{
            System.out.println("Pesa mais:\n"+p2.toString());
            System.out.println("A diferencia de peso é "+(p2.getPeso()-p1.getPeso())+" kg");
        }
    }
    
}
