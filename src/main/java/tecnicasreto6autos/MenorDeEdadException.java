package tecnicasreto6autos;

/**
 *
 * @author Usuario
 */
public class MenorDeEdadException extends Exception {
    public MenorDeEdadException(){
        super("El vendedor es menor de edad, no puede ser menor de edad");
    }
    
}