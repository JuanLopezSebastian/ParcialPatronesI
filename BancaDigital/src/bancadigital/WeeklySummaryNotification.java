/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancadigital;

/**
 *
 * @author estudiantes
 */
public class WeeklySummaryNotification implements NotificationStrategy {
    @Override
    public void sendNotification(String message) {
        System.out.println("Resumen semanal: " + message);
    }
}

