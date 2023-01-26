// Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
// Фамилия Имя Отчество датарождения номертелефона пол
// Форматы данных:
// фамилия, имя, отчество - строки

// дата_рождения - строка формата dd.mm.yyyy

// номер_телефона - целое беззнаковое число без форматирования

// пол - символ латиницей f или m.

// Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

// Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

// Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида

// <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

// Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

// Не забудьте закрыть соединение с файлом.

// При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.

public class App {

  public static void main(String[] args) throws Exception, ExtEmpty {
    String s = new ConsoleIO().enterString();

    int num_tokens = 6;
    String[] tokens = s.split(" ");
    // проверка на количество данных
    CheckPar check = new CheckPar();
    check.setArr(tokens);
    check.setNum_par(num_tokens);
    var err = check.Qn();
    switch (err) {
      case -1:
        System.out.println("Количество параметров больше необходимых");
        break;
      case -2:
        System.out.println("Количество параметров меньше необходимых");
        break;
    }
    //
    String[] resstr = new String[6];
    // парсинг даты
    ParseDate pd = new ParseDate();
    pd.setArr(tokens);
    int indexdate = pd.getDate();
    if (indexdate >= 0) {
      resstr[3] = tokens[indexdate];
    } else {
      throw new RuntimeException("Date of birth not found!");
    }

    // парсинг телефона
    ParseTel pt = new ParseTel();
    pt.setArr(tokens);
    int indextel = pt.getTel();
    if (indextel >= 0) {
      resstr[4] = tokens[indextel];
    } else {
      throw new RuntimeException("Telephone not found!");
    }
    // парсинг пола
    ParseSex ps = new ParseSex();
    ps.setArr(tokens);
    int indexsex = ps.getSex();
    if (indexsex >= 0) {
      resstr[5] = tokens[indexsex];
    } else {
      throw new RuntimeException("Sex not parsed!");
    }

    // запись в файл
    for (int i = 0; i < 3; i++) {
      resstr[i] = tokens[i];
    }
    SaveFile sf = new SaveFile();
    sf.setData(resstr);
    sf.setPath(resstr[0] + ".txt");
    sf.save();
  }

}
