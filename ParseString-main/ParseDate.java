import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ParseDate {
  String[] arr;

  public void setArr(String[] arr) {
    this.arr = arr;
  }

  public int getDate() {
    Date birth;

    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
    for (int i = 0; i < arr.length; i++) {
      try {
        birth = formatter.parse(arr[i]);
        // return formatter.format(birthdate);
        return i;
      }

      catch (ParseException e) {
        if (i == arr.length - 1) {

          System.out.println("Date of birth not parsed!");

        }
      }
    }

    return -1;
  }
}
