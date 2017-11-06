package ejercicio5_3;

import java.util.Scanner;

/*
 * @author Arturo
 */
public class Ejercicio5_3 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce un numero entero:");
        Numeros num =new Numeros(teclado.nextInt());
        if(num.getNumero()>0){
            System.out.println("+");
        }
        else if(num.getNumero()==0){
            System.out.println("0");
        }
        else{
            System.out.println("-");
        }
    }
    
}
