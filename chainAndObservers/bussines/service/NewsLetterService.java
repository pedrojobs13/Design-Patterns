package br.ufes.bussines.service;

import br.ufes.bussines.observers.Observer;
import br.ufes.bussines.observers.Subject;

public class NewsLetterService {
    private final Subject subject;

    public NewsLetterService(Subject subject) {
        this.subject = subject;
    }

    public void inscrever(Observer observer) {
        subject.subscribe(observer);
    }

    public void addMessage(String message) {
        subject.addMessage(message);
    }


}
