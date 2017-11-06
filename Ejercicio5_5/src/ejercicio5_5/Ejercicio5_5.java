package ejercicio5_5;

import java.util.Scanner;

/*
 * @author Arturo
 */
public class Ejercicio5_5 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduzca un numero A:");
        Numero A=new Numero(teclado.nextInt());
        System.out.println("Introduzca un numero B:");
        Numero B=new Numero(teclado.nextInt());
        System.out.println("Introduzca un numero C:");
        Numero C=new Numero(teclado.nextInt());
        if(A.getNumero()>B.getNumero()&&B.getNumero()>C.getNumero()){
            System.out.println("Numero A es mayor");
        }
        else if(B.getNumero()>C.getNumero()){
            System.out.println("Numero B es mayor");
        }
        else System.out.println("Numero C es mayor");
    }

}
