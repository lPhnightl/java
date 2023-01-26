package dz;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Infixconv
{
    public static void main(String[] args) {
        String input = "(2^3 * (10 / (5 - 3)))^(Sin(Pi)) ";//(2^3 * (10 / (5 - 3)))^(Sin(Pi)) 
        //  
        String[] postString = Infixconv.toPost(input);
        System.out.println("Математическое выражение: " + input);   
          System.out.print("Постфиксная запись: ");  
            for (String st : postString) {   
                System.out.print(st + " ");
             }
             System.out.println();
             try {
                 String res = IP.compute(String.join(" ",postString));
                 System.out.println("Результат: "+ res);  
                } catch (Exception err) {
                    System.out.println(err.getMessage());
                    System.out.print("Не алЁ");  
                }
            }
        /*
         * список операторов
         */
        private static List<String> standart_operators = List.of("(", ")", "+", "-", "*", "/", "^","Sin","Pi");
      // вставка пробелов в строку для дальнейшей обработки элементов строкит     
        private static  String Separate(String input)
        {            
            int pos = 0;
            String s = new String();
            String res = new String();
            input = input.replace(" ", "");
            while (pos < input.length())
            {   
                s = "" + input.charAt(pos);
                if (Character.isDigit(input.charAt(pos)))
                    for (int i = pos + 1; i < input.length() &&
                        (Character.isDigit(input.charAt(i)) || input.charAt(i) == ',' || input.charAt(i) == '.'); i++) s += input.charAt(i);          
                else if (Character.isLetter(input.charAt(pos)))
                    for (int i = pos + 1; i < input.length() &&
                        (Character.isLetter(input.charAt(i)) || Character.isDigit(input.charAt(i))); i++) s += input.charAt(i);
                res = res+" "+ s;
                if (s.length() > 1) {
                    pos += s.length();
                    } else {
                     pos += 1;
                    }    
            }
            return res.trim();
        }
        private static byte GetPriority(String s)
        {
            switch (s)
            {
                case "(":
                case ")":
                    return 0;
                case "+":
                case "-":
                    return 1;
                case "*":
                case "/":
                    return 2;
                case "^":
                    return 3;
                default:
                    return 4;
            }
        }

        public static String[] toPost(String input)
        {  
            List<String> outputSeparated = new ArrayList<String>();
            Stack<String> stack = new Stack<String>();
            String[] arrC= Separate(input).split(" ");
            for( String c : arrC)
            {
                if (standart_operators.contains(c))
                {
                    if (stack.size() > 0 && !c.equals("("))
                    {
                        if (c.equals(")"))
                        {
                            String s = stack.pop();
                            while (!s.equals("("))
                            {
                                outputSeparated.add(s);
                                s = stack.pop();
                            }
                        }
                        else if (GetPriority(c) > GetPriority(stack.peek()))
                            stack.push(c);
                        else
                        {
                            while (stack.size() > 0 && GetPriority(c) <= GetPriority(stack.peek()))
                                outputSeparated.add(stack.pop());
                            stack.push(c);
                        }
                    }
                    else{
                        stack.push(c);
                    }
                }
                else{
                    stack.push(c);
                    }
            }
            if (stack.size() > 0)
                for (String c : stack)
                    outputSeparated.add(c);
            String [] res = new String[outputSeparated.size()];
            return outputSeparated.toArray(res);
        }
    }

