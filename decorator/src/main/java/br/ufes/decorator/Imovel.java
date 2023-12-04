package br.ufes.decorator;

public class Imovel extends Componente {

  public Imovel(String descricao, double area) {
    super(descricao, area);
  }

  @Override
  public String getDescricao() {
    return descricao;
  }
  @Override
  public double getArea() {
    return area;
  }

  @Override
  public Componente desfazer() {
    return this;
  }
}
