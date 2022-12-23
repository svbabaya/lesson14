/*
Введи с клавиатуры 30 чисел. Выведи 10-е и 11-е минимальные числа.
Пояснение:
Самое минимальное число - 1-е минимальное.
Следующее минимальное после него - 2-е минимальное.

Пример:
1 6 5 7 1 15 63 88
Первое минимальное - 1
Второе минимальное - 1
Третье минимальное - 5
Четвертое минимальное - 6
*/

package exercise_3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] digInput = new int[30];
        System.out.println("Введите 30 целых чисел:");
        for (int i = 0; i < 30; i++) digInput[i] = scan.nextInt();

        for (int i = 0; i < digInput.length; i++) {
           for (int j = i + 1; j < digInput.length; j++) {
               if (digInput[i] > digInput[j]) {
                   int tmp = digInput[i];
                   digInput[i] = digInput[j];
                   digInput[j] = tmp;
               }
            }
        }

        //for (int j : digInput) System.out.println(j);

        System.out.println("11-е минимальное число: " + digInput[10]);
        System.out.println("12-е минимальное число: " + digInput[11]);

    }
}
