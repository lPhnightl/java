// 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
// 2. Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
// try {
//   int d = 0;
//   double catchedRes1 = intArray[8] / d;
//   System.out.println("catchedRes1 = " + catchedRes1);
// } catch (ArithmeticException e) {
//   System.out.println("Catching exception: " + e);
// }

// 3. Дан следующий код, исправьте его там, где требуется (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
// public static void main(String[] args) throws Exception {
//   try {
//       int a = 90;
//       int b = 3;
//       System.out.println(a / b);
//       printSum(23, 234);
//       int[] abc = { 1, 2 };
//       abc[3] = 9;
//   } catch (Throwable ex) {
//       System.out.println("Что-то пошло не так...");
//   } catch (NullPointerException ex) {
//       System.out.println("Указатель не может указывать на null!");
//   } catch (IndexOutOfBoundsException ex) {
//       System.out.println("Массив выходит за пределы своего размера!");
//   }
// }
// public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//   System.out.println(a + b);
// }

// 

// 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Dz1 {
  // 1. метод проверки на ввод дробного числа
  public static float getFloat(String prompt) {
    System.out.print(prompt);
    while (true) {
      try {
        return Float.parseFloat(new Scanner(System.in).next());
      } catch (NumberFormatException e) {
        System.out.print("That is not an float:\n" + prompt);
      }
    }
  }

  // 2. задание
  public static void task2() {
    int[] intArray = { 34, 34, 5, 6, 8, 96, 5, 56,34,56,3 };
    try {
      int d = 0;
      double catchedRes1 = intArray[8] / d;
      System.out.println("catchedRes1 = " + catchedRes1);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Catching exception: " + e);
    } catch (ArithmeticException e) {
      System.out.println("Catching exception: " + e);
    }
  }

  // 4. метод проверки на ввод пустой строки
  public static String checkEmpty() {
    String s = null;
    System.out.print("Введите строку (строка не должна быть пустой) : ");
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      s = reader.readLine();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    if (s.equals("")) {
      throw new RuntimeException("String can not be empty!");
    }
    return s;
  }

  public static void main(String[] args) {
    System.out.println(getFloat("Введите целое число : "));
    task2();
    checkEmpty();
  }
}
