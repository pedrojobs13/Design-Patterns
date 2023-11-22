package com.ufes.adapter.adapter;

import com.ufes.adapter.api.MercadoPagoAPI;
import java.util.Objects;

public class MercadoPagoAdapter implements FormaDePagamento {
  MercadoPagoAPI mercadoPagoAPI;

  public MercadoPagoAdapter(MercadoPagoAPI mercadoPagoAPI) {
    Objects.requireNonNull(mercadoPagoAPI);

    this.mercadoPagoAPI = mercadoPagoAPI;
  }

  @Override
  public void realizarPagamento(double valor) {
    mercadoPagoAPI.efetuarPagamento(valor);
  }
}
