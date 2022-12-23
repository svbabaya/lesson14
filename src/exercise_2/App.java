/*
Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.

Ключевые требования:
Пустая строка - конец ввода данных.
Числа могут повторяться.
Строки всегда уникальны.
Введенные данные не должны потеряться!
Затем программа должна выводить содержание HashMap на экран.
Каждую пару - с новой строки.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мыла
2 Рама
1 Мама
*/

package exercise_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();
        String keyInput;
        String valInput;

        while (true) {
            valInput = scan.nextLine();
            if (valInput.equals("")) break;
            keyInput = scan.nextLine();
            if (keyInput.equals("")) break;

            hashMap.put(keyInput, Integer.parseInt(valInput));
        }

//        for (Map.Entry<String, Integer> m : hashMap.entrySet())
//            System.out.println(m.getValue() + " " + m.getKey());

        hashMap.forEach((n, m) -> System.out.println(m + " " + n));


    }
}
