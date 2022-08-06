package tecnicasreto6autos;

/**
 *
 * @author Usuario
 */

import java.util.Calendar;

public class Vendedor {
    public int identificacion;
    public String nombre;
    public String apellido;
    public int edad;
    private int valorVendido;
    public String descripcion;
    public int anioIngreso; 
    public String experiencia;
    Calendar anioActual = Calendar.getInstance();
    int anio = anioActual.get(Calendar.YEAR);

    public Vendedor(int identificacion, String nombre, String apellido, int edad, String descripcion) throws MenorDeEdadException{
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        if (edad >=18) {
          this.edad = edad;  
        } else{
            throw new MenorDeEdadException();
        }
        this.valorVendido = 0;
        this.descripcion = descripcion;
        
    }

    public void setAnioIngreso(int anioIngreso) throws AnioIngresoMayorException {
        if (anioIngreso <= anio) {
            this.anioIngreso = (int) anioIngreso;
        } else{
            throw new AnioIngresoMayorException();
        } 
    }
    
    
    public void setVendido(int valorVendido){
        this.valorVendido = valorVendido;
        }
    
    public String vendido(){
        if (valorVendido == 0 ) {
            experiencia = "Novato";
        } else if (valorVendido > 0 && valorVendido <= 500000000) {
            experiencia = "Principiante";
        } else if (valorVendido > 500000000 && valorVendido <= 2000000000) {
            experiencia = "Intermedio";
        } else if (valorVendido > 2000000000) {
            experiencia = "Avanzado";
        }
        return experiencia;
    }

    public void setAnio(int anioIngreso){
        this.anioIngreso = anioIngreso;
        }
    
}