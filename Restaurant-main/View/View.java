package View;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import Model.Customer;
import Model.Order;
import Model.Table;
import Presenter.IGetview;

public class View implements IGetview {

// печать заказа
  @Override
  public void printOrder(Order order) {
    System.out.println("Заказ "+ order.getId() +" [на " + dateToStr(order.getDate())  + ", клиент = " + order.getId_customer() + ", столик = " + order.getId_table() + "]");
  }
 
  //печать всех заказов
  @Override
  public void printOrders(List<Order> orderList) {
    System.out.println("Актуальные заказы");
    for (Order order : orderList) {
      printOrder(order);
    }
   
  }
// вывод списка столиков
  @Override
  public void showTables(List<Table> tableList) {
    for (Table table : tableList) {
      System.out.println(table.toString());
    }
  }
// вывод всех клиентов
  @Override
  public void printCustomers(List<Customer> customerList) {
    for (Customer customer : customerList) {
      System.out.println(customer.toString());
    }
  }
  
  
  @Override
  // чтение из формы ввода данных - для реализвции пока mock
  public Customer getCustomer() {
    Customer newCustomer = new Customer();
    newCustomer.setId(1);
    newCustomer.setName("Иван");
    newCustomer.setSurname("Иванов");
    newCustomer.setPhone("(921)123-45-67");
    newCustomer.setEmail("ivanovii@uandex.ru");
    return newCustomer;
  }
  @Override
  // чтение из формы ввода данных заказа - для реализвции пока mock
  public Order getOrder() throws ParseException {
    Order newOrder = new Order();
    newOrder.setId(1);
    newOrder.setDate(strToDate("2023/11/30 17:00"));
    newOrder.setId_table(3); 
    newOrder.setId_customer(1);
    return newOrder;
    }
    // вывод сообщений
    @Override
    public void msg(String msg) {
      System.out.println(msg); 
    }
  // 
  // 
  // перевод строки в дату
    public Date strToDate(String ordertimeString) throws ParseException {
      Date ordertimeDate = new SimpleDateFormat(Config.strPattern, Locale.ENGLISH).parse(ordertimeString);
      return ordertimeDate;
    }
    // 
    public String dateToStr(Date ordertimeString)  {
    // перевод даты в строку
    String stringDate = new SimpleDateFormat(Config.strPattern).format(ordertimeString);
    return stringDate;
    }

    @Override
    public int cancelOrder() {
     int idorder = 1;
      return idorder;
    }
   
   
}