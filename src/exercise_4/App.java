/*
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .


public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

public static void main(String[] args) throws Exception {
//напишите тут ваш код
}

// метод проверяет, гласная ли буква
public static boolean isVowel(char character) {
character = Character.toLowerCase(character); // приводим символ в нижний регистр - от заглавных к строчным буквам
for (char vowel : vowels) { // ищем среди массива гласных
if (character == vowel) {
return true;
}
}
return false;
}
*/

package exercise_4;

import java.util.Scanner;

public class App {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) {
        String str = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        str = scan.nextLine();

        for (int i = 0; i < str.length(); i++)
            if (isVowel(str.charAt(i))) System.out.print(str.charAt(i) + " ");

        System.out.println();

        for (int i = 0; i < str.length(); i++)
            if (!isVowel(str.charAt(i)) && str.charAt(i) != ' ') System.out.print(str.charAt(i) + " ");
    }

    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);
        for (char vowel : vowels) {
            if (character == vowel) return true;
        }
        return false;
    }
}
