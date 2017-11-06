package ejercicio5_2;

import java.util.Scanner;

/*
 * @author Arturo
 */
public class Ejercicio5_2 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce dos números enteros");
        Numeros n1=new Numeros(teclado.nextShort(),teclado.nextShort());
        if(n1.getNum1()>=n1.getNum2()){
            System.out.println("Suma = "+n1.Suma());
            System.out.println("Resta = "+n1.Resta());
        }
        else{
            System.out.println("Suma = "+n1.Suma());
        }
    }
    
}
