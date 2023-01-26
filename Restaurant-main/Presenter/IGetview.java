package Presenter;

import java.text.ParseException;
import java.util.List;

import Model.Customer;
import Model.Order;
import Model.Table;

public interface IGetview {
  public void printCustomers(List<Customer> customerList);
  //чтение клиента из формы ввода данных
  public Customer getCustomer();
  // показ столиков
  public void showTables(List<Table> tableList);
  // 
  public void printOrder(Order order);
  // 
  public void printOrders(List<Order> orderList);
  // новый заказ
  public Order getOrder() throws ParseException;
  // отмена заказа
  public int cancelOrder();
  // 
  public void msg(String string);
}
