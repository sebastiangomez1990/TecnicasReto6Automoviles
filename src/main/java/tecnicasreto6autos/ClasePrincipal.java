package tecnicasreto6autos;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 *
 * @Equipo: John Sebastian Gomez Gonzalez    c.c 1000084363
 *          Sebastian Aristizabal Castañeda  c.c 1000639678
 */

public class ClasePrincipal {
    public static void main(String[] args) throws InferiorZeroException {
        
        try {
            
            Scanner miScanner = new Scanner(System.in);
            
            Automovil miAuto = new Automovil("ijs 54e", "Yamaha", "verdeazul", "Una moto muy mela", "anda reduro", "un man del 12 de octubre");
            System.out.println(miAuto.tipoModelo());
            
            Vendedor miVendedor = null;
            try {
                miVendedor = new Vendedor(12315, "Juan", "Gomez", 17, "Cualquier cosa");
            } catch (MenorDeEdadException ex) {
                System.out.println("El vendedor es menor de edad, OJO, no puede ser menor de edad!");
            }
            
            System.out.println("Ingrese el kilometraje del automovil: ");
            miAuto.setKilometraje(miScanner.nextInt());
        } catch (InferiorZeroException ex) {
            System.out.println("Es imposible ingresar un kilometraje menor que cero!");
        }
    }   
}
