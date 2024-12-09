import java.util.Scanner;
public class MethodsDemo {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double number,square;
        printHello();
        printNumber(10);
        int result =  give10();
        System.out.println(result);
        result = addThese(3,5);
        System.out.println(result);
        System.out.println("Enter a number to get the square: ");
        number = keyboard.nextDouble();
        square = getSquare(number);
        System.out.printf("The square of %f is %f ", number,square);
    }//end main

    //void, parameterless method
    public static void printHello(){
        System.out.println("Hello there!");
    }

    //void, parameterized
    public static void printNumber(int a){
        System.out.println("The number is " + a);
    }

    //value-returning, parameterless
    public static int give10(){
        return 10;
    }

    //value-returning, parameterized
    public static int addThese(int num1, int num2){
        return num1+num2;
    }
    public static double getSquare(double number){
        return number*number;
    }

}