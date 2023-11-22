package com.ufes.adapter.api;

import java.util.Random;

public class MercadoPagoAPI {

  private static final String[] ERROS = {
    "Servidor indisponível",
    "Saldo insuficiente",
    "Conta bloqueada",
    "Dados inválidos",
    "Limite de transações excedido"
  };

  public void efetuarPagamento(double valor) {
    Random random = new Random();
    boolean aprovado = random.nextBoolean();
    if (aprovado) {
      System.out.println("Mercado pago: Pagamento de R$ " + Double.toString(valor) + " aprovado");
    } else {
      int indiceErro = random.nextInt(ERROS.length);
      System.out.println(
          "Mercado pago: Pagamento de R$ "
              + Double.toString(valor)
              + " reprovado. Motivo: "
              + ERROS[indiceErro]);
    }
  }
}
