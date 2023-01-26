package Model;

import java.text.ParseException;
import java.util.List;
import java.util.ArrayList;
import Presenter.IGetmodel;
import View.View;

public class Model implements IGetmodel {

  private final List<Order> cacheOrders = new ArrayList<>();
  private final List<Table> cacheTables = new ArrayList<>();
  private final List<Customer> cacheCustomers = new ArrayList<>();

  public Model() throws ParseException {

  }

  // предоставление всех столиков
  public List<Table> getCacheTables() {
    return cacheTables;
  }

  // предоставление всех заказов
  public List<Order> getCacheOrders() throws ParseException {
    return cacheOrders;
  }

  // предоставление всех заказов
  public List<Customer> getCacheCustomers() {
    return cacheCustomers;
  }

  // запись из бд в память списка клиентов
  // реализация чтения из базы - доработать пока один клиент
  public List<Customer> fillCacheCustomers() {
    Customer c1 = new Customer();
    c1.setId(0);
    c1.setName("John");
    c1.setSurname("Smith");
    c1.setPhone("921 911 87 56");
    c1.setEmail("johnsmith@gmail.com");
    cacheCustomers.add(c1);
    return cacheCustomers;
  }

  @Override
  public void setCustomer(Customer newcustomer) {
    // запись в бд
    cacheCustomers.add(newcustomer);
  }

  // запись из бд в память списка всех столиков
  public List<Table> fillCacheTables() {
    Table t1 = new Table();
    t1.setId(0);
    t1.setCapacity(2);
    t1.setRemark("У окна");
    t1.setUriPhoto("https://bestrest/table0.jpg");
    t1.setStatus(true);
    cacheTables.add(t1);

    Table t2 = new Table();
    t2.setId(1);
    t2.setCapacity(4);
    t2.setRemark("В центре");
    t2.setUriPhoto("https://bestrest/table1.jpg");
    t2.setStatus(true);
    cacheTables.add(t2);

    Table t3 = new Table();
    t3.setId(2);
    t3.setCapacity(4);
    t3.setRemark("У окна");
    t3.setUriPhoto("https://bestrest/table2.jpg");
    t3.setStatus(true);
    cacheTables.add(t3);

    Table t4 = new Table();
    t4.setId(3);
    t4.setCapacity(2);
    t4.setRemark("В центре");
    t4.setUriPhoto("https://bestrest/table3.jpg");
    t4.setStatus(true);
    cacheTables.add(t4);
    return cacheTables;

  }

  // запись из бд в память списка заказов
  public void fillCacheOrders() throws ParseException {
    // из бд дата читается в формате бд, эта конструкция для примера
    Order o1 = new Order();
    o1.setId(0);
    o1.setDate(new View().strToDate(("2022/11/26 17:00")));
    o1.setId_customer(0);
    o1.setId_table(2);
    cacheOrders.add(o1);
  }

  // запись заказа в память списка заказов
  public void insertOrder(Order order) {
    cacheOrders.add(order);
  }

  // отмена заказа
  public void deleteOrder(Order order) {
    cacheOrders.remove(order);
  }

  // обновление заказов в кэше
  public void updateOrder(Order oldOrder, Order newOrder) {
    cacheOrders.clear();
    deleteOrder(oldOrder);
    insertOrder(newOrder);
  }

  @Override
  public void init() throws ParseException {
    fillCacheCustomers();
    fillCacheOrders();
    fillCacheTables();

  }

}
