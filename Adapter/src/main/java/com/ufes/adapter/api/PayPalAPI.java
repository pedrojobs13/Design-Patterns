package com.ufes.adapter.api;

public class PayPalAPI {
  public void sendPayment(double valor) {
    System.out.println(
        "Pagamento no valor de R$ " + Double.toString(valor) + " aprovado no Paypal");
  }
}
