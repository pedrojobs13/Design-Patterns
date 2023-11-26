package com.ufes.state;

public abstract class AlertState {
  protected Phone phone;

  public AlertState(Phone phone) {
    this.phone = phone;
  }

  public void vibration() {
    throw new RuntimeException("Não é possível vibrar");
  }

  public void silent() {
    throw new RuntimeException("Não é possível silenciar");
  }
}
