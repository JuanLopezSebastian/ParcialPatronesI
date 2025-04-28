/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancadigital;

/**
 *
 * @author estudiantes
 */
public class User {
    private String name;
    private NotificationStrategy notificationStrategy;

    public User(String name, NotificationStrategy notificationStrategy) {
        this.name = name;
        this.notificationStrategy = notificationStrategy;
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }

    public void notify(String message) {
        System.out.print(name + ": ");
        notificationStrategy.sendNotification(message);
    }
}

