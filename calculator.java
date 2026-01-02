import java.util.Scanner;
import java.util.InputMismatchException;

public class calculator{
    // method for addition
    static int add(int a,int b){
        return a+b;
    }

    // mehtod for subtraction
    static int subtract(int a,int b){
        return a-b;
    }

    //method for multiiplication
    static int multiply(int a,int b){
        return a*b;
    }

    // method for division
    static int divide(int a, int b){
        return a/b; // this may throw ArithmeticException
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            try{
                System.out.println("---Calculator Menu---");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();

                if(choice == 5){
                    System.out.println("Thank you for using the calculator!");
                    System.out.println("Exiting......");
                    break;
                }
                System.out.println("Enter the first number: ");
                int a = sc.nextInt();
                System.out.println("Enter the second number: ");
                int b = sc.nextInt();
                switch(choice){
                    case 1: 
                        System.out.println("Result = "+add(a,b));
                        break;

                    case 2:
                        System.out.println("Result = "+subtract(a,b));
                        break;

                    case 3:
                        System.out.println("Result = "+multiply(a,b));
                        break;

                    case 4:
                        try{
                            System.out.println("Result = "+divide(a,b));
                        }catch(ArithmeticException e){
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                }
            }catch(InputMismatchException e){
                System.out.println("Invalid input! Enter numbers only.");
                sc.nextLine();
            }
        }   while(true);
        sc.close();
        }
    }