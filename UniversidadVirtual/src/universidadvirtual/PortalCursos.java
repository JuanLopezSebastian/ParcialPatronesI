/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadvirtual;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiantes
 */
public class PortalCursos implements ISubject{
    private List <IObserver> observers = new ArrayList<>();

    @Override
    public void agregarObserver(IObserver o) {
        observers.add(o);
        
    }

    @Override
    public void eliminarObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notificarObservers (Curso curso) {
        for (IObserver observer : observers){
            observer.Actualizar(curso);
        }
    }
    public void AgregarNuevoCurso (Curso curso) {
        System.out.println("Nuevo curso agregado:"+ curso.getNombre());
        notificarObservers(curso);
    }
}
