public class ParseSex {
  String[] arr;

  public void setArr(String[] arr) {
    this.arr = arr;
  }

  public int getSex() throws Exsex{
    // String sex = "";
    try {
    for (int i = 0; i < arr.length; i++) {

        if (arr[i].equals("m") || arr[i].equals("f")) {
          // sex = arr[i];
          return i;

        }
      }
  
    } catch (Exsex e) {
      System.out.println("Sex not parsed!");
      

    }
    
     return -1;
  }
}
