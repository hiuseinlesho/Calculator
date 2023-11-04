import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Available Operations: +, -, *, /");

        System.out.print("Enter first number: ");
        double firstNumber = Double.parseDouble(scanner.nextLine());;

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.nextLine().charAt(0);

        System.out.print("Enter second number: ");
        double secondNumber = Double.parseDouble(scanner.nextLine());;

        double result;

        switch (operator) {
            case '+':

                result = firstNumber + secondNumber;
                break;
            case '-':

                result = firstNumber - secondNumber;
                break;
            case '*':

                result = firstNumber * secondNumber;
                break;
            case '/':

                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:

                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);

    }

}
