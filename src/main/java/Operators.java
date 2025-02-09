import java.util.Scanner;

public class Operators {

    public Operators() {

    }

    Scanner sc = new Scanner(System.in);

//1) Дано произвольное число. Необходимо узнать, сколько в конце числа нулей.

    public int Task1() {
        System.out.println("Enter your number: ");
        long number = sc.nextInt();
        int n = 10;
        int i = 0;
        while (number % n == 0) {
            n = n * 10;
            i++;
        }
        return i;
    }

//    2) Необходимо найти интервал числа n (интервал это произведение всех целых чисел от 1 до n)

    public int Task2() {
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        int res = 1;
        for (int i = 1; i < number; i++) {
            res = res * (i + 1);
        }
        return res;
    }

//    3) Пользователь вводит два числа. Необходимо найти среднее арифметическое между заданными числами (сумма чисел / количество чисел)

    public float Task3() {
        System.out.println("Enter your first number: ");
        int number1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int number2 = sc.nextInt();
        return (float) (number1 + number2) / 2;
    }
}


