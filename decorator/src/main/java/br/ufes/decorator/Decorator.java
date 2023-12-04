package br.ufes.decorator;

public abstract class Decorator extends Componente {
  protected Componente componente;

  protected Decorator(String descricao, double area) {
    super(descricao, area);
  }

  public Decorator(Componente componente, String descricao, double area) {
    super(descricao, area);
    this.componente = componente;
  }
}
