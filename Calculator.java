public class Calculator {
    public static void main(String[] args) {
        int a=10;
        int b=27;
        int sum=a+b;
        int substract=a-b;
        int mult=a*b;
        int division=a/b;
        System.out.println("Method 1: ");
        System.out.println("Addition of a and b " + sum);
        System.out.println("Substraction " + substract);
        System.out.println("Multiplication of a and b " + mult);
        System.out.println("Division " + division);
        System.out.println("------Method 2------");
        System.out.println("Addition of a and b " + (a+b));
        System.out.println("Addition of a and b " + a+b);
        System.out.println("------Method 3------");
        System.out.println("Addition " + (a+b) + " substract " + (a-b) + " multiplication " + (a*b) + " division " + (a/b));


    }
}
