/*
1. Введи с клавиатуры 10 строчек и посчитай в них количество различных
букв без учета регистра. Результат выведи на экран в алфавитном порядке.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9

public static void main(String[] args) throws Exception {
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

// Алфавит
List<Character> alphabet = Arrays.asList(
'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

// Ввод строк
ArrayList<String> list = new ArrayList<String>();
for (int i = 0; i < 10; i++) {
String line = reader.readLine();
list.add(line.toLowerCase());
}

// напишите тут ваш код
}
*/

package exercise_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        int count = 0;
        for (Character c : alphabet) {
            for (String s : list) {
                for (int i = 0; i < s.length(); i++) if (c.equals(s.charAt(i))) count++;
            }
            treeMap.put(c, count);
            count = 0;
        }

//        for (Map.Entry<Character, Integer> e : treeMap.entrySet())
//            System.out.println(e.getKey() + " " + e.getValue());

        treeMap.forEach((n, m) -> System.out.println(n + " " + m));

    }

}
