package com.hash.design_pattern;

public class FactoryMethod {

    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        if ("EMAIL".equalsIgnoreCase(type)) {
            return new EmailNotification();
        } else if ("SMS".equalsIgnoreCase(type)) {
            return new SMSNotification();
        }
        return null;
    }

    public static void main(String[] args) {
        Notification notification = FactoryMethod.createNotification("Email");
        notification.notifyUser();
    }
}

interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending an Email notification");
    }
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}
