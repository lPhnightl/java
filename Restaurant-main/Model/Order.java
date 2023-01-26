package Model;
import java.util.Date;

public class Order {

  private int id;
  private Date date;
  private int id_customer;
  private int id_table;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public int getId_customer() {
    return id_customer;
  }

  public void setId_customer(int id_customer) {
    this.id_customer = id_customer;
  }

  public int getId_table() {
    return id_table;
  }

  public void setId_table(int id_table) {
    this.id_table = id_table;
  }

  @Override
  public String toString() {
    return "Заказ "+ id+" [date =" + date + ", клиент =" + id_customer + ", столик =" + id_table + "]";
  }
  @Override
  public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Order that = (Order) o;
      return date.equals(that.date);
  }
}
