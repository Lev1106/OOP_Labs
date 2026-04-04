import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
       double                 leftOperand, result, rightOperand;
       String                 leftString, operator, rightString;
       StringTokenizer        tokenizer;
       Scanner in = new Scanner(System.in);

       tokenizer = new StringTokenizer(in.nextLine(), "+-*/ ", true);
       while (tokenizer.hasMoreTokens()) {
          try {
             leftString = tokenizer.nextToken();
             while (leftString.equals(" "))
                leftString = tokenizer.nextToken();
             operator = tokenizer.nextToken();
             while (operator.equals(" "))
                operator = tokenizer.nextToken();
             rightString = tokenizer.nextToken();
             while (rightString.equals(" "))
                rightString = tokenizer.nextToken();

             try {
                leftOperand = Double.parseDouble(leftString);
             }
             catch (NumberFormatException e) {
                System.out.println("Left operand is not a number: " + leftString);
                continue;
             }

             try {
                rightOperand = Double.parseDouble(rightString);
             }
             catch (NumberFormatException e) {
                System.out.println("Right operand is not a number: " + rightString);
                continue;
             }

             if (operator.equals("+"))
                result = leftOperand + rightOperand;
             else if (operator.equals("-"))
                result = leftOperand - rightOperand;
             else if (operator.equals("*"))
                result = leftOperand * rightOperand;
             else if (operator.equals("/"))
                result = leftOperand / rightOperand;
             else {
                System.out.println("Invalid syntax");
                continue;
             }

             System.out.println("Result: " + result);
          } catch (NoSuchElementException nsee) {
             System.out.println("Invalid syntax");
          } catch (NumberFormatException nfe) {
             System.out.println("One or more operands is not a number");
          }
       }


    }
}
