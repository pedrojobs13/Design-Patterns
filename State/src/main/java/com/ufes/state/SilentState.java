package com.ufes.state;

public class SilentState extends AlertState {

  public SilentState(Phone phone) {
    super(phone);
  }

  @Override
  public void vibration() {
    System.out.println("O telefone está em modo silencioso.");
    phone.setState(new VibrationState(phone));
  }
}
