package com.ufes.state;

public class VibrationState extends AlertState {

  public VibrationState(Phone phone) {
    super(phone);
  }

  @Override
  public void silent() {
    System.out.println("O telefone está em modo vibração.");
    phone.setState(new SilentState(phone));
  }
}
