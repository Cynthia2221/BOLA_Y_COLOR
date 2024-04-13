
/**
 * Write a description of class Bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bola
{
    private Color color;

    /**
     * Constructor for objects of class Bola
     */
    public Bola()
    {
         int num=(int) (Math.random() * 3 + 1);
         if(num == 1){
             color= Color.BLANCO;
         } else{
             color= Color.NEGRO;
         }
    }
    
    public Color getColor(){
        return color;
    }
    
    public String getColorString(){
        return color.toString();
    }
    
    public String toString(){
        String texto="";
        texto = "Es una bola de color" + getColorString();
        return texto;
    }
    
    public boolean esBlanca(){
        if(getColor().equals(Color.BLANCO)){
            return true;
        }
        return false;
    }
    
    public boolean esNegra(){
        if(getColor().equals(Color.NEGRO)){
            return true;
        }
        return false;
    }
}
