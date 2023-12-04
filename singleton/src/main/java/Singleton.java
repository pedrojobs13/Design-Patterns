import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Singleton {
  private static Singleton singleton = null;
  private List<Integer> contadorList = new ArrayList<>();

  private Singleton() {}

  public static Singleton getSingleton() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }

  public List<Integer> getContador() {
    return Collections.unmodifiableList(contadorList);
  }

  public void setContador(int contador) {
    contadorList.add(contador);
  }
}
