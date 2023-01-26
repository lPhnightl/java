
//
// 4. метод проверки на ввод пустой строки
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class ConsoleIO {
  private String s;

  public String enterString() throws Exception {

    System.out.print(
        "Введите строку (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m ) : ");
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, Charset.forName("Cp866")))) {
      s = reader.readLine();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    new ExtEmpty().str(s);
    return s;
  }

}