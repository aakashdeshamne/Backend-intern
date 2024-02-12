import java.util.Scanner;

class InvalidInputException extends Exception {

    public String toString() {
        return "Invalid operator input encountered..";
    }
}

class DivideByZeroException extends Exception {

    public String toString() {
        return "Tooofan can't divide by zero...";
    }
}

class MaxInputException extends Exception {

    public String toString() {
        return "Any of the operands can't be greater than 100000";
    }
}

class MaxMultiplierReachedException extends Exception {

    public String toString() {
        return "Can't multiply with a number greater than 7000";
    }
}

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double calculate(String expression) throws InvalidInputException, DivideByZeroException, MaxInputException, MaxMultiplierReachedException {
        double operandOne;
        double operandTwo;
        char operator = ' ';
        double result;

        int i = 0;
        String operandOneStr = "";
        String operandTwoStr = "";

        while (expression.charAt(i) != ' ') {
            operandOneStr += expression.charAt(i);
            i++;
        }
        i++;
        operandOne = Double.parseDouble(operandOneStr);

        while (expression.charAt(i) != ' ') {
            operator = expression.charAt(i);
            i++;
        }

        for (; i < expression.length(); i++) {
            operandTwoStr += expression.charAt(i);
        }
        operandTwo = Double.parseDouble(operandTwoStr);

        // Checking inputs and throwing exceptions when required
        if (operandTwo == 0 && operator == '/') {
            throw new DivideByZeroException();
        }

        if (operandOne > 100000 || operandTwo > 100000) {
            throw new MaxInputException();
        }

        if (operandTwo > 7000 && operator == '*') {
            throw new MaxMultiplierReachedException();
        }

        // Using switch on operator
        switch (operator) {
            case '+':
                result = this.add(operandOne, operandTwo);
                break;
            case '-':
                result = this.subtract(operandOne, operandTwo);
                break;
            case '*':
                result = this.multiply(operandOne, operandTwo);
                break;
            case '/':
                result = this.divide(operandOne, operandTwo);
                break;
            default:
                throw new InvalidInputException();
        }

        return result;
    }

}

public class Task {
    public static void main(String args[]) {
        Calculator machine = new Calculator();

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter expression [only works for two operands] >> ");
            String expression = sc.nextLine();
            double answer = machine.calculate(expression);
            System.out.println(answer);
            sc.close(); // Close the Scanner
        } catch (InvalidInputException | DivideByZeroException | MaxInputException | MaxMultiplierReachedException e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Program Finished!!!");
        }
    }
}
