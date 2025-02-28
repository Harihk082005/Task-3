public class Calc {

    public int mul(int a, int b) {
        return a * b;
    }

 
    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calc calculator = new Calc();
        System.out.println("Multiplication: " + calculator.mul(6, 3)); 
        System.out.println("Division: " + calculator.div(6, 3)); 
    }
}

