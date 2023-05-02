import java.util.Scanner;

public class Calculator {

    public static double addition(double one, double two) {
        return one + two;
    }

    public static double subtraction(double one, double two) {
        return one - two;
    }

    public static double division(double one, double two) {
        if (two == 0) {
            throw new ArithmeticException("Cant divide by zero");
        } else {
            return one / two;
        }
    }

    public static double multiPilCation(double one, double two) {
         return one * two;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String operation = "";

        boolean isValid = false;

        while (!isValid) {
            try {
                System.out.println("please select a operation +, -, *, /");
                operation = scanner.nextLine();
                if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") &&!operation.equals("/")){
                    throw new IllegalArgumentException("please select valid operation");
                }
                isValid = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println("enter number 1:");

        double one = scanner.nextDouble();

        System.out.println("enter number 2:");

        double two = scanner.nextDouble();

        double result;

        if (operation.equals("+")){
            result = addition(one, two);
        } else if (operation.equals("-")) {
            result = subtraction(one, two);
        } else if (operation.equals("*")) {
            result = multiPilCation(one, two);
        } else {
            result = division(one, two);
        }

        System.out.println("the result is " + result);

    }
}
