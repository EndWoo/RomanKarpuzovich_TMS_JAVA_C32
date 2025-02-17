import java.util.Scanner;

public class Operators {

    public Operators() {

    }


//1) Дано произвольное число. Необходимо узнать, сколько в конце числа нулей.

    public int zeroCounting() {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
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

    public int intervalCalculation() {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= number; i++) {
            res = res * i;
        }
        return res;
    }

//    3) Пользователь вводит два числа. Необходимо найти среднее арифметическое между заданными числами (сумма чисел / количество чисел)

    public float arithmeticMeanCalculation() {
        System.out.println("Enter your first number: ");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int number2 = sc.nextInt();
        int sum = 0;
        int counter = 0;
        for (int i = number1; i <= number2; i++) {
            sum = sum + i;
            counter++;
        }
        return (float) sum / counter;
    }
}


