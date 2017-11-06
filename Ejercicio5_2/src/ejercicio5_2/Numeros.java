package ejercicio5_2;
/*
 * @author Arturo
 */
public class Numeros {
    private short num1, num2;
    
    public Numeros(short num1, short num2){
    this.num1=num1;
    this.num2=num2;
    }
    public short Suma(){
        short suma=(short) (num1+num2);
        return suma;
    }
    public short Resta(){
        short resta=(short) (num1-num2);
        return resta;
    }
    public short getNum1(){
        return num1;
    }
    public short getNum2(){
        return num2;
    }
}