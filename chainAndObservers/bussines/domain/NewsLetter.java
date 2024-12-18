package br.ufes.bussines.domain;

import br.ufes.bussines.observers.Observer;
import br.ufes.bussines.observers.Subject;

import java.util.ArrayList;
import java.util.List;

public class NewsLetter implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final List<String> messages = new ArrayList<>();


    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubject() {
        if (!messages.isEmpty()) {
            String lastMessage = messages.get(messages.size() - 1);
            observers.forEach(o -> o.update(lastMessage));
        }
    }
@Override
    public void addMessage(String message) {
        messages.add(message);
        notifySubject();
    }
}
