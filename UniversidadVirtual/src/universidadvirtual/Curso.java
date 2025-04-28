/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadvirtual;

/**
 *
 * @author estudiantes
 */
public class Curso {
    private String nombre;
    private String descripcion;
    
    public Curso (String nombre,String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
    
}
