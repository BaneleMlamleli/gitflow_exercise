import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import main.Addition;

public class App {
    public static void main(String[] args) throws Exception {
        // Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("**** CHOOSE OPTIONS BELOW. SELECT LETTER A, M, S, or D **** \n(A)ddition\n(M)ultiplication\n(S)ubtraction\n(D)ivision\nOption: ");
        char opt = br.readLine().toLowerCase().charAt(0);
        
        char again = 'y';
        do {

            while (true) {
                System.out.print("Incorrect selection. Enter (A)ddition, (M)ultiplication, (S)ubtraction, or (D)ivision\nOption: ");
                opt = br.readLine().toLowerCase().charAt(0);
                if ((opt == 'a') || (opt == 'm') || (opt == 's') || (opt == 'd')) {
                    break;
                }
            }
            
            System.out.print("Enter first number: ");
            Double firstNumber = Double.parseDouble(br.readLine());
            System.out.print("Enter second number: ");
            Double secondNumber = Double.parseDouble(br.readLine());
            switch (opt) {
                case 'a':
                    Addition addition =  new Addition(firstNumber, secondNumber);
                    System.out.println(addition.toString());break;
                case 's':
                    // Subtraction subtraction =  new Subtraction(firstNumber, secondNumber);
                    System.out.println("S, selected"); break;
                case 'm':
                    // Multiplication multiplication =  new Multiplication(firstNumber, secondNumber);
                    System.out.println("N, selected"); break;
                case 'd':
                    // Division division =  new Division(firstNumber, secondNumber);
                    System.out.println("D, selected"); break;
                default: System.err.println("Incorrect selection. Enter (A)ddition, (M)ultiplication, (S)ubtraction, or (D)ivision");
            }
            System.out.print("Would you like to calculate again? (Y)es or (N)o\nOption: ");
            again = br.readLine().toLowerCase().charAt(0);
        } while (again == 'y');
        // scanner.close();
    }
}
