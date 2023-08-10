class Calculator {
    private double operand1, operand2;
    private char operator;

    public Calculator(double operand1, double operand2, char operator) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operator = operator;
    }

    public double add() { return operand1 + operand2; }
    public double subtract() { return operand1 - operand2; }
    public double multiply() { return operand1 * operand2; }
    public double divide() { if (operand2 == 0) throw new ArithmeticException("Cannot divide by zero"); return operand1 / operand2; }
}

public class Main {
    public static void main(String[] args) {
        double operand1 = 10, operand2 = 5;
        char operator = '+';

        Calculator calculator = new Calculator(operand1, operand2, operator);
        double result = 0;

        switch (operator) {
            case '+': result = calculator.add(); break;
            case '-': result = calculator.subtract(); break;
            case '*': result = calculator.multiply(); break;
            case '/': result = calculator.divide(); break;
            default: System.out.println("Invalid operator"); return;
        }

        System.out.println("Result: " + result);
    }
}
