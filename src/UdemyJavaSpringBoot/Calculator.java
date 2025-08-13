package UdemyJavaSpringBoot;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String again = "y";
        int num1,num2;
        String operator;
        while (again.equalsIgnoreCase("y")){
            System.out.print("Enter first number:\t");
            num1= input.nextInt();
            System.out.print("Enter second number:\t");
            num2=input.nextInt();
            System.out.print("Choose operation (+, -, *, /):\t");
            operator=input.next();
            if(Objects.equals(operator, "+")){
                System.out.printf("Result: %f",(float)(num1+num2));
            } else if (Objects.equals(operator,"-")) {
                System.out.printf("Result: %f",(float)num1-num2);
            }else if (Objects.equals(operator,"/")) {
                if(num2==0){
                    System.out.println("Cannot divide by zero.");
                }else{
                    System.out.printf("Result: %f",(float)num1-num2);
                }
            }else if (Objects.equals(operator,"*")) {
                System.out.printf("Result: %f",(float)num1*num2);
            }else {
                System.out.println("Invalid Operator");
            }
            System.out.println("\nDo you want to calculate again? (y/n)");
            again=input.next();
            if (again.equalsIgnoreCase("n")){
                System.out.println("Thank you for using the calculator.");
                break;
            }
        }
    }
}
