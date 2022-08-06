package tecnicasreto6autos;

/**
 *
 * @author Usuario
 */
public class InferiorZeroException extends Exception {
    public InferiorZeroException(){
        super("Está ingresando un valor negativo, debe ingresar un valor mayor o igual a cero!");
    }
    
}

