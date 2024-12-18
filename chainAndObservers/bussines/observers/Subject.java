package br.ufes.bussines.observers;

public interface Subject {
    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifySubject();

    void addMessage(String message);
}
