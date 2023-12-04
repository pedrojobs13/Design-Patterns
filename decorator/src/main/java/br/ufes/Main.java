package br.ufes;

import br.ufes.decorator.Ambiente;
import br.ufes.decorator.Componente;
import br.ufes.decorator.Imovel;

public class Main {

  public static void main(String[] args) {
    Componente apartamento = new Imovel("qualquer", 20);
    apartamento = new Ambiente(apartamento,  "teste", 30);

    System.out.println(apartamento.getDescricao());
  }
}
