/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadvirtual;

/**
 *
 * @author estudiantes
 */
public class Main {
    public static void main(String[] args) {
    PortalCursos oferta = new PortalCursos();
    WebMaster webMaster = new WebMaster();
    Emisora emisora = new Emisora();
    Management_Redes_Sociales management_Redes_Sociales = new Management_Redes_Sociales();
    
    oferta.agregarObserver(webMaster);
    oferta.agregarObserver(emisora);
    oferta.agregarObserver(management_Redes_Sociales);
    
    Curso curso1 = new Curso("Inteligencia Artificial","");
    Curso curso2 = new Curso("Pedagogia Colonial","");    
    Curso curso3 = new Curso("a", ""); 
        
    }
    
}
