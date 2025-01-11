import java.io.BufferedReader;
import java.io.InputStreamReader;

import main.Addition;
import main.Division;
import main.Multiplication;
import main.Subtraction;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String again = "";
        do {          
            String opt = "";
            do {
                System.out.print("**** CHOOSE OPTIONS BELOW. SELECT LETTER A, M, S, D, or E to exit **** \n(A)ddition\n(M)ultiplication\n(S)ubtraction\n(D)ivision\n(E)xit\nOption: ");
                opt = br.readLine().toLowerCase().substring(0, 1);

                switch (opt) {
                    case "a":
                        System.out.print("Enter first number: ");
                        Double firstNumber = Double.parseDouble(br.readLine());
                        System.out.print("Enter second number: ");
                        Double secondNumber = Double.parseDouble(br.readLine());
                        Addition addition =  new Addition(firstNumber, secondNumber);
                        System.out.println(addition.toString());break;
                    case "s":
                        System.out.print("Enter first number: ");
                        Double subFirstNumber = Double.parseDouble(br.readLine());
                        System.out.print("Enter second number: ");
                        Double subSecondNumber = Double.parseDouble(br.readLine());
                        Subtraction subtraction =  new Subtraction(subFirstNumber, subSecondNumber);
                        System.out.println(subtraction.toString()); break;
                    case "m":
                        System.out.print("Enter first number: ");
                        Double multiFirstNumber = Double.parseDouble(br.readLine());
                        System.out.print("Enter second number: ");
                        Double multiSecondNumber = Double.parseDouble(br.readLine());
                        Multiplication multiplication =  new Multiplication(multiFirstNumber, multiSecondNumber);
                        System.out.println(multiplication.toString()); break;
                    case "d":
                        System.out.print("Enter first number: ");
                        Double divFirstNumber = Double.parseDouble(br.readLine());
                        System.out.print("Enter second number: ");
                        Double divSecondNumber = Double.parseDouble(br.readLine());
                        Division division =  new Division(divFirstNumber, divSecondNumber);
                        System.out.println(division.toString()); break;
                    case "e":
                        opt = "e";
                        System.out.println("Exiting application");
                        break;
                    default: System.err.print("\nIncorrect selection. Enter (A)ddition, (M)ultiplication, (S)ubtraction, or (D)ivision");
                }
                if (opt != "e") {
                    System.out.print("\n**** CHOOSE OPTIONS BELOW. SELECT LETTER A, M, S, D, or E to exit **** \n(A)ddition\n(M)ultiplication\n(S)ubtraction\n(D)ivision\n(E)xit\nOption: ");
                    opt = br.readLine().toLowerCase().substring(0, 1);
                }
            } while ((opt == "a") || (opt == "m") || (opt == "s") || (opt == "d"));{
            }
            System.out.print("Would you like to calculate again? (Y)es or (N)o\nOption: ");
            again = br.readLine().toLowerCase().substring(0, 1);
        } while (again.equals("y"));{
            System.out.println("HAVE GREAT DAY AHEARD!!");
        }
    }
}