import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("/*................Calculator Menu................*/");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for finding Square");

        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        System.out.println("Enter two numbers");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

    }
}