import java.util.ArrayList;
import java.util.Iterator;

public class Prog {

  public static void main(String[] args) {

    // Создание имён котиков
    var cn = PetNames.getCatNames();
    // Использование встроенного интерфейса итератора
    Iterator<String> cnIterator = cn.iterator();
    System.out.println("Возможные имена котиков:");
    while (cnIterator.hasNext()) {
      System.out.println(cnIterator.next());
    }
    // Создание репозитория котиков
    ArrayList<Cat> repoC = new ArrayList<>();
    RepoCats fillCats = new RepoCats(7, repoC);
    fillCats.initCats();
    System.out.println("\nКоманда котиков");
    System.out.println(repoC);
    // Сортировка котиков по весу
    System.out.println("\nСортировка котиков по весу");
    repoC.sort((t1, t2) -> Integer.compare(t1.getWeight(), t2.getWeight()));
    for (Cat t : repoC) {
      System.out.println(t);
    }

    // Создание имён собачек
    var dn = PetNames.getDogNames();
    // Использование встроенного интерфейса итератора
    Iterator<String> dnIterator = dn.iterator();
    System.out.println("Возможные имена собачек:");
    while (dnIterator.hasNext()) {
      System.out.println(dnIterator.next());
    }
    // Создание репозитория собачек
    ArrayList<Dog> repoD = new ArrayList<>();
    RepoDogs fillDogs = new RepoDogs(7, repoD);
    fillDogs.initDogs();
    System.out.println("\nКоманда собачек:");
    System.out.println(repoC);
    // Сортировка собачек по возрасту
    System.out.println("\nСортировка собачек по возрасту");
    repoC.sort((t1, t2) -> Integer.compare(t1.getAge(), t2.getAge()));
    for (Dog t : repoD) {
      System.out.println(t);
    }
// Cat nc = new Cat();
// nc.Foo();
  }
}