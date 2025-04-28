/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancadigital;

/**
 *
 * @author estudiantes
 */
public class Main {
    public static void main(String[] args) {
        // Crear usuarios con diferentes estrategias iniciales
        User user1 = new User("Ana", new InmediateNotification());
        User user2 = new User("Pedro", new DailySummaryNotification());
        User user3 = new User("Luisa", new PromotionNotificationEmail());

        // Notificar
        user1.notify("Se realizó una nueva transacción.");
        user2.notify("Saldo actualizado.");
        user3.notify("Nueva promoción disponible.");

        // Cambiar estrategia en tiempo de ejecución
        System.out.println("\nCambiando preferencias de notificación...");
        user2.setNotificationStrategy(new WeeklySummaryNotification());
        user3.setNotificationStrategy(new PromotionNotificationSMS());

        // Notificar de nuevo
        user2.notify("Resumen de actividades disponible.");
        user3.notify("Oferta de cashback del 10%.");
    }
}

