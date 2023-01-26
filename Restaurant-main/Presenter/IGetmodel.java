package Presenter;

import java.text.ParseException;
import java.util.List;

import Model.Customer;
import Model.Order;
import Model.Table;

public interface IGetmodel {
  // запись клиента
  public void setCustomer(Customer customer);
  public List<Customer> getCacheCustomers();
  // запись в память всех столиков
  public List<Table> getCacheTables();
  //
  public List<Order> getCacheOrders() throws ParseException;
  // внесение нового заказа
  public void insertOrder(Order order);
  // отмена заказа
  public void deleteOrder(Order order);
  //
  public void init() throws ParseException;
}
