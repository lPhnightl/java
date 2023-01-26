package Model;

public class Table {
  private int id;
  private int capacity;
  private String remark;
  private String uriPhoto;
  private Boolean status;

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public Table() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public String getUriPhoto() {
    return uriPhoto;
  }

  public void setUriPhoto(String uriPhoto) {
    this.uriPhoto = uriPhoto;
  }

  @Override
  public String toString() {
    return "Столик " + id +" [количество гостей - " + capacity + ", описание - " + remark + ", uriPhoto - " + uriPhoto + (status ? " свободен": " занят") + "]";
  }
}
