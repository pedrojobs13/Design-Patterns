package com.ufes.adapter;

import com.ufes.adapter.adapter.FormaDePagamento;
import com.ufes.adapter.adapter.GerenciadorDePagamentos;
import com.ufes.adapter.adapter.MercadoPagoAdapter;
import com.ufes.adapter.adapter.PayPalAdapter;
import com.ufes.adapter.api.MercadoPagoAPI;
import com.ufes.adapter.api.PayPalAPI;

public class Main {
  public static void main(String[] args) {
    PayPalAPI payPalAPI = new PayPalAPI();
    MercadoPagoAPI mercadoPagoAPI = new MercadoPagoAPI();

    FormaDePagamento payPalAdapter = new PayPalAdapter(payPalAPI);
    FormaDePagamento mercadoPagoAdapter = new MercadoPagoAdapter(mercadoPagoAPI);

    GerenciadorDePagamentos gerenciadorDePagamentos = new GerenciadorDePagamentos();
    gerenciadorDePagamentos.processarPagamento(mercadoPagoAdapter, 30);
  }
}
