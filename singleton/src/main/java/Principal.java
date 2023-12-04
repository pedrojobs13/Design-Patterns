import java.util.List;

public class Principal {
  public static void main(String[] args) {
    Singleton singleton = Singleton.getSingleton();
    Singleton singleton1 = Singleton.getSingleton();

    singleton.setContador(11);
    singleton1.setContador(20);

    for (int cont : singleton1.getContador()) {
      System.out.println(cont);
    }
  }
}
