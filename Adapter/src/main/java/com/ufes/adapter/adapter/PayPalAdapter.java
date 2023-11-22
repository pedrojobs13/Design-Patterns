package com.ufes.adapter.adapter;

import com.ufes.adapter.api.PayPalAPI;

public class PayPalAdapter implements FormaDePagamento {
  private PayPalAPI payPalAPI;

  public PayPalAdapter(PayPalAPI payPalAPI) {
    if (payPalAPI == null) {
      throw new IllegalArgumentException("Api é nula");
    }
    this.payPalAPI = payPalAPI;
  }

  @Override
  public void realizarPagamento(double valor) {
    payPalAPI.sendPayment(valor);
  }
}
