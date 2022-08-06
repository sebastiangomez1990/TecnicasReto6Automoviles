package tecnicasreto6autos;

/**
 *
 * @author Usuario
 */
public class Llanta {
    public String marca;
    public String referencia;
    public int peso;

    public Llanta(String marca, String referencia, int peso) throws InferiorZeroException{
        this.marca = marca;
        this.referencia = referencia;
        
        if(peso >=0){
            this.peso = peso;
        } else{
            throw new InferiorZeroException();
        }
        
    }
}

