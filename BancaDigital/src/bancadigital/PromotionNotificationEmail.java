/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancadigital;

/**
 *
 * @author estudiantes
 */
public class PromotionNotificationEmail implements NotificationStrategy {
    @Override
    public void sendNotification(String message) {
        System.out.println("Promoción enviada por correo electrónico: " + message);
    }
}

