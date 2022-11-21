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

        switch (choice){
            case 1:
                double result = number1+number2;
                System.out.println("The answer is ");
                System.out.println(result);
                break;
            case 2:
                result = number1-number2;
                System.out.println("The answer is ");
                System.out.println(result);
                break;
            case 3:
                result = number1*number2;
                System.out.println("The answer is ");
                System.out.println(result);
                break;
            case 4:
                result = number1/number2;
                System.out.println("The answer is ");
                System.out.println(result);
                break;
            case 5:
                double sqrt1 = number1*number1;
                double sqrt2 = number2*number2;
                System.out.println("The Square root of "+ number1 + " is "+ sqrt1);
                System.out.println("The Square root of "+ number2 + " is "+ sqrt2);
                break;
        }

    }
}