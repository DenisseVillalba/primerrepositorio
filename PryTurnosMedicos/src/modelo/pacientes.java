
package modelo;

public class pacientes {
    public String nombre;
    public int edad;
    public String numeroIdentificacion;

    public pacientes(String nombre, int edad, String numeroIdentificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    
    
    
}
