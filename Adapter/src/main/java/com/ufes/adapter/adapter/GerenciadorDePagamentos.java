package com.ufes.adapter.adapter;

import java.util.Objects;

public class GerenciadorDePagamentos {
  public void processarPagamento(FormaDePagamento formaDePagamento, double valor) {
    Objects.requireNonNull(formaDePagamento);

    formaDePagamento.realizarPagamento(valor);
  }
}
