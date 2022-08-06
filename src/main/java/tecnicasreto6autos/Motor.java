package tecnicasreto6autos;

/**
 *
 * @author Usuario
 */
public class Motor {
    private int cilindraje;
    private String marca;
    private String referencia;
    private double peso;
    private String descripcion;

    public Motor(int cilindraje, String marca, String referencia, String descripcion,double peso) throws InferiorZeroException{
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.referencia = referencia;
        this.descripcion = descripcion;
        
        if (peso >=0) {
            this.peso = peso;
        } else{
            throw new InferiorZeroException();
        }
            
    }
}
