package ejercicio5_4;
/*
 * @author Arturo
 */
public class Persoa {
    private String nome;
    private float peso;
    public Persoa(String nome, float peso){
        this.nome=nome;
        this.peso=peso;
    }
    public float getPeso(){
        return peso;
    }
    @Override
    public String toString(){
        return ("Nome: "+nome+ "\nPeso: "+peso);
    }
}
