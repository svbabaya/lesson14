/*
Задача: Пользователь вводит с клавиатуры список слов (и чисел).
Слова вывести в возрастающем порядке, числа - в убывающем.

Пример ввода:
Вишня
1
Боб
3
Яблоко
22
0
Арбуз

Пример вывода:
Арбуз
22
Боб
3
Вишня
1
0
Яблоко
*/

package exercise_5;

import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите последовательность слов и чисел, для завершения введите пустую строку:");

        String inputString = "";

        while (true) {
            inputString = scan.nextLine();
            if (inputString.equals("")) break;
            if (isNumber(inputString)) num.add(Integer.parseInt(inputString));
            else
                str.add(inputString);
        }

        List<String> sortedStr = str.stream().sorted().toList();
        List<Integer> sortedNum = num.stream().sorted(Collections.reverseOrder()).toList();

          int length = (sortedStr.size() >= sortedNum.size()) ? sortedStr.size() : sortedNum.size();
        for (int i = 0; i < length; i++) {
          if (i < sortedStr.size()) System.out.println(sortedStr.get(i));
          if (i < sortedNum.size()) System.out.println(sortedNum.get(i));
        }

    }

    public  static boolean isNumber(String str) {
        try {
            Double num = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

}
