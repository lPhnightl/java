public class ParseTel {
  String[] arr;

  public void setArr(String[] arr) {
    this.arr = arr;
  }

  public int getTel() {

    for (int i = 0; i < arr.length; i++) {
      try {
        int telnum = Integer.parseInt(arr[i]);
        return i;
      } catch (NumberFormatException e) {
        if (i == arr.length-1) {
          
          System.out.println("Telephone number not parsed!");
        }
        
      }
    }
    return -1;
  }
}