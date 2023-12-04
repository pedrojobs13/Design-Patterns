package br.ufes.decorator;

public abstract class Componente {
  protected String descricao;
  protected double area;

  public Componente(String descricao, double area) {
    this.descricao = descricao;
    this.area = area;
  }

  public abstract String getDescricao();

  public abstract double getArea();

  public abstract Componente desfazer();

  @Override
  public String toString() {
    return "Componente{" + "descricao='" + descricao + '\'' + ", area=" + area + '}';
  }
}
