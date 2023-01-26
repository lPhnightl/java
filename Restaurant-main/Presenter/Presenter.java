package Presenter;

import java.text.ParseException;
import java.util.List;
import Model.Model;
import Model.Order;
import Model.Table;
import View.View;

public class Presenter {
  private final IGetmodel model;
  private final IGetview view;

  public Presenter(Model model, View view) {
    this.model = model;
    this.view = view;
  }
  // инициализация в памяти столиков, заказов и клиентов
  public void init() throws ParseException {
    model.init();
  }
  // чтение клиентов и вывод
  public void getAllCustomers() {
    view.printCustomers(model.getCacheCustomers());
  }
  public void getNewCustomer() {
    model.getCacheCustomers().add(view.getCustomer());
  }


  // показ столиков
  // обозначение свободных столиков
  public void getFreeTables() throws ParseException {
    List<Table> freeTables = model.getCacheTables();
    List<Order> allOrders = model.getCacheOrders();
    // запись в память id занятых столиков
    for (Order order : allOrders) {
      if (freeTables.contains(freeTables.get(order.getId_table()))) {
        freeTables.get(order.getId_table()).setStatus(false);
      }
    }
    // 
    view.showTables(freeTables);
  }
  // чтение заказов из бд
  public void getOrders() throws ParseException {
    view.printOrders(model.getCacheOrders());
  }
  // резервирование столика
  public void bookTable() throws ParseException {
    var neworder = view.getOrder();
    model.insertOrder(neworder);
    model.getCacheTables().get((neworder.getId_table())).setStatus(false);
    view.printOrder(neworder);
  }
  // отмена заказа
  public void removeOrder() throws ParseException {
    Order order = model.getCacheOrders().get(view.cancelOrder());
    model.deleteOrder(order);
    model.getCacheTables().get((order.getId_table())).setStatus(true);
    view.msg("Заказ " + order.getId() + " отменён");
    view.printOrder(order);
  }
}
