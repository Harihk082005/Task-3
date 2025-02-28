public class Calc {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }

    public static void main(String[] args) {
        Calc calculator = new Calc();
        System.out.println(calculator.add(5, 3)); 
        System.out.println(calculator.subtract(5, 3)); 
    }
}

