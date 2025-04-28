/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package universidadvirtual;

/**
 *
 * @author estudiantes
 */
public interface ISubject {
    
    public void agregarObserver (IObserver o);
    public void eliminarObserver (IObserver o);
    public void notificarObservers(Curso curso);
    
}
