package ejercicio5_1;

import java.util.Scanner;

/*
 * @author Arturo
 */
public class Ejercicio5_1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un numero entero:");
        Numeros N =new Numeros(teclado.nextInt());
        if(N.getNum()>0){
            System.out.println("O número é positivo");
        }
    }
    
}
