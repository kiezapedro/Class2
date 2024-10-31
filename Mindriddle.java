public class Mindriddle {
    public static void main(String[] args) {
        int a=10;
        int b=31;
        System.out.println("-------Guess the answer-------");
        System.out.println("Uninary operator " + (a++));
        System.out.println("Uninary operator " + (++a));
        System.out.println("Uninary operator " + (++b));
        System.out.println("Binary operator " + 1+2);
        System.out.println("1+2 " + (1+2));
        int increment=++a*b++;
        System.out.println("Increment " + increment);
    }
}
