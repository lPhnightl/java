import Model.Model;
import View.View;
import Presenter.Presenter;
import java.text.ParseException;

public class App {

  public static void main(String[] args) throws ParseException {
    // String ordertimeString = "2023/11/24 17:00";
    Model m = new Model();
    View v = new View();
    Presenter p = new Presenter(m, v);
    // инициализация данных из бд
    p.init();
    // печать клиентов
    System.out.println("Клиенты");
    p.getAllCustomers();
    // 
    p.getNewCustomer();
    // печать клиентов
    System.out.println("Клиенты");
    p.getAllCustomers();
    // печать заказов
    System.out.println("Заказы");
    p.getOrders();
    // печать столиков
    System.out.println("Столики");
    p.getFreeTables();
    // новый заказ
    System.out.println("Новый заказ");
    p.bookTable();
    // обновление столиков
    System.out.println("Столики");
    p.getFreeTables();
    // отменить заказ
    p.removeOrder();
    // обновление столиков
    p.getFreeTables();

  }
}
