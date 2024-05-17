import java.util.Scanner;

public class Calculator {

    static Scanner scanner;

    public static void main(String[] args) {
        int num1 = getInt();
        char operation = getOperation();
        int num2 = getInt();
        int result = calc(num1, num2, operation);
        System.out.println(result);

    }

    public static int getInt() {
        int num = 0;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        }
        if (num < 1 || num > 10) {
            throw new IllegalArgumentException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

        return num;
    }

    public static char getOperation() {
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            throw new IllegalArgumentException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *");
        }

        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '*' -> result = num1 * num2;
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '/' -> result = num1 / num2;
            default -> {
                throw new IllegalArgumentException("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *");
            }
        }

        return result;
    }

    static {
        scanner = new Scanner(System.in);
    }
}
