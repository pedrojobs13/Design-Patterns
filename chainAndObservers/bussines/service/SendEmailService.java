package br.ufes.bussines.service;

import br.ufes.bussines.observers.Observer;

public class SendEmailService {
    public static final void sendEmail(Observer observer, String message) {
        System.out.println("Dear " + observer.getName() + ",\n\n" + message + "\n\nBest regards,\nYour Service Team");
    }
}
