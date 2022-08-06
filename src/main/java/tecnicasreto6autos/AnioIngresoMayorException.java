package tecnicasreto6autos;

/**
 *
 * @author Usuario
 */
public class AnioIngresoMayorException extends Exception {
    public AnioIngresoMayorException(){
        super("El año de registro del vendedor es mayor al año actual, ingresar el año actual");
    }
    
}
