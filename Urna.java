import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Urna here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Urna
{
    private ArrayList<Bola> bolas;

    /**
     * Constructor for objects of class Urna
     */
    public Urna()
    {
        bolas= new ArrayList<Bola>();
    }

    public void meterBola(Bola b){
        bolas.add(b);
    }

    public Bola sacarBola(){
        if(bolas.size()==0){
            throw new RuntimeException("Lista vacía");
        }
        int num= (int) (Math.random() * bolas.size() +1);
        Bola bolaBorrada= bolas.get(num);
        bolas.remove(num);

        return bolaBorrada;
    }

    private int obtenerPosicionAleatoria(int hasta) {
        return (int) (Math.random() * hasta);
    }

    public int cuantasBlancas(){
        int cuantas=0;
        for(Bola bola : bolas){
            if(bola.esBlanca()==true){
                cuantas++;
            }
        }
        return cuantas;
    }

    public int cuantasNegras(){
        int cuantas=0;
        for(int i=0; i < bolas.size(); i++){
            if(bolas.get(i).esNegra()==true){
                cuantas++;
            }
        }
        return cuantas;
    }

    public void mostrarUrna(){
        Iterator<Bola> it= bolas.iterator();
        while(it.hasNext()){
            System.out.println("La bola:" + it.next().getColor());
        }
    }

    public void borrarBlancas(){
        Iterator<Bola> it = bolas.iterator();
        while (it.hasNext()) {
            Bola bola = it.next();
            if (bola.getColor() == Color.BLANCO) {
                it.remove();
            }
        }
    }
}
