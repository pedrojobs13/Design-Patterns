package com.ufes.state;

public class Phone {
  private AlertState state;

  public Phone() {
    state = new SilentState(this);
  }

  public void setState(AlertState state) {
    this.state = state;
  }

  public AlertState getState() {
    return state;
  }

  public void Silent(){
    state.silent();
  }

  public void Vibration(){
    state.vibration();
  }
}
