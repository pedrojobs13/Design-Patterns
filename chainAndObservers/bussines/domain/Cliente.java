package br.ufes.bussines.domain;

import br.ufes.bussines.observers.Observer;
import br.ufes.bussines.observers.Subject;
import br.ufes.bussines.service.SendEmailService;

public class Cliente implements Observer {
    private String name;
    private Subject subject;

    public Cliente(String name){
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void update(String message) {
        SendEmailService.sendEmail(this, message);
    }
}
