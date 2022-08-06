package tecnicasreto6autos;

/**
 *
 * @Equipo: John Sebastian Gomez Gonzalez    c.c 1000084363
 *          Sebastian Aristizabal Castañeda  c.c 1000639678
 */
public class Automovil {
    private String placa;
    private String marca;
    private String modelo;
    private int kilometraje;
    private String color;
    private double precio;
    private String descripcion;
    private String motor;
    private int anioFabricacion;
    private String vendedor;
    private String tipoUso;

    public Automovil(String placa, String marca, String color, String descripcion, String motor, String vendedor) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.descripcion = descripcion;
        this.motor = motor;
        this.vendedor = vendedor;
    }
    
    public void setKilometraje(int kilometraje) throws InferiorZeroException{
        
        if (kilometraje >=0){
            this.kilometraje = kilometraje;
        } else{
            throw new InferiorZeroException();
        }
        
    }
    
    public String usoAutomovil(){ 
        if (kilometraje == 0 ) {
            tipoUso = "0 km";
        } else if (kilometraje >= 1 && kilometraje <= 1000) {
            tipoUso = "Nuevo";
        } else if (kilometraje > 1000 && kilometraje <= 20000) {
            tipoUso = "Casi nuevo";
        } else if (kilometraje > 20000 && kilometraje <= 100000) {
            tipoUso = "Usado";
        } else if (kilometraje > 100000) {
            tipoUso = "Muy usado";
        }
          else {
            tipoUso = "Valor de kilometraje incorrecto";
            return tipoUso;     
        }  
        return tipoUso;
    }
    
        /*Según lo definimos en el equipo de trabajo:
          Un vehículo es último modelo si su año de fabricación es: >=2023
          Un vehículo es nuevo si su año de fabricación es: >=2020 && <=2022
          Un vehículo es intermedio si su año de fabricación es: >=2016 && <=2019
          Un vehículo es antiguo si su año de fabricación es: <=2015   
        */

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    } 
    
        public String tipoModelo(){ 
        if (anioFabricacion >= 2023 ) {
            modelo = "Último modelo";
        } else if (anioFabricacion >= 2020 && anioFabricacion <= 2022) {
            modelo = "Nuevo";
        } else if (anioFabricacion >= 2016 && anioFabricacion <= 2019) {
            modelo = "Intermedio";
        } else if (anioFabricacion <= 2015) {
            modelo = "Antiguo";
        }
          else {
            modelo = "Anio de fabricacion incorrecto";
            return modelo;     
        }  
        return modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getKilometraje() {
        return kilometraje;
    }
    
}
