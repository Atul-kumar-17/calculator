

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int c = 1;
        int d = 2;
        int sum = c + d;
        int sub = c - d;
        int mul = c * d;
        int mod = c % d;
        System.out.println("The addition" + sum);
        System.out.println("The subtraction" + sub);
        System.out.println("The multiplication" + mul);
        System.out.println("The modulus" + mod);


        float subject1 = 43;
        float subject2 = 64;
        float subject3 = 55;
        int subject4 = 95;
        int subject5 = 86;
        float cgpa = (subject1 + subject2 + subject3 + subject4 + subject5) / 5;
        System.out.println("percent" + cgpa);


        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        double a = Sc.nextDouble();
        System.out.println("Enter the second no.");
        double b = Sc.nextDouble();
        System.out.println("Enter the choice \n 1) Addition \n 2) Subtraction \n 3) Multiplication \n 4) Division \n 5) Modulus");
        int choice = Sc.nextInt();
        if(choice == 1) {
            double add = a + b;
            System.out.println("The Addtition is" + add);
        } else if(choice == 2) {
            double Sub = a - b;
            System.out.println("The Subtraction is +sub");
        } else if(choice == 3) {
            double Mul = a * b;
            System.out.println("The Multiplication is +mul");
        } else if(choice == 4) {
            double Div = a / b;
            System.out.println("The Division is +div");
        } else if (choice == 5) {
            double Mod = a % b;
            System.out.print("The Modulus is +mod");
        }else{
            System.out.println("Wrong choice");
        }Sc.close ();

    }
}



