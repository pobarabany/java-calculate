import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        double num2 = scanner.nextInt();

        switch (operation){
            case '+':
                printResult(num1 + num2);
                break;
            case'-':
                printResult(num1 - num2);
                break;
            case '*':
                printResult(num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    printResult(num1 / num2);
                }
                else {
                        System.out.println("Ошибка: деление на ноль");
                    }
                break;
            default:
                System.out.println("Неизвестная ошибка");
        }
    }

    public static void printResult(double result) {
        System.out.println("Ответ: " + result);
    }
}