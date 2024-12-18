package br.ufes.bussines.observers;

public interface Observer {
    public String getName();

    public void update(String message);
}
