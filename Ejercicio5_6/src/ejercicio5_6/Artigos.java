package ejercicio5_6;
/*
 * @author Arturo
 */
public class Artigos {
    private String nome;
    private double ventas;
    public Artigos(String nome,double v){
        this.nome=nome;
        ventas=v;
    }
    public double getVentas(){
        return ventas;
    }
    public String toString(){
        return("Nombre: "+nome+"\nVentas: "+ventas);
    }
}
