package br.ufes.decorator;

public class Ambiente extends Decorator {
  Ambiente(String descricao, double area) {
    super(null, descricao, area);
  }

  public Ambiente(Componente componente, String descricao, double area) {
    super(componente, descricao, area);
  }

  @Override
  public String getDescricao() {
    return componente.getDescricao() + " " + descricao;
  }

  @Override
  public double getArea() {
    return componente.getArea() + area;
  }

  @Override
  public Componente desfazer(){
    return this;
  }
}
