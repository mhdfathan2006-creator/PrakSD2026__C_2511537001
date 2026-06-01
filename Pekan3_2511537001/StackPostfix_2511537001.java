package Pekan3_2511537001;
import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2511537001 {

	public static int postfixEvaluate_7001 (String expression) {
		Stack <Integer> s = new Stack <Integer>();
		Scanner input_7001 = new Scanner (expression);
		while (input_7001.hasNext()) {
			if (input_7001.hasNextInt()) {  //an operan (integer)
				s.push(input_7001.nextInt());
			} else {                        //an operator
				String operator_7001 = input_7001.next();
				int operand2 = s.pop();
				int operand1 = s.pop();
				if (operator_7001.equals("+")) {
					s.push (operand1+operand2);
				} else if (operator_7001.equals("-")) {
					s.push(operand1-operand2);
				} else if (operator_7001.equals("*")) {
					s.push(operand1*operand2);
				} else {
					s.push(operand1/operand2);
				}
			}
		} 
		input_7001.close();
		return s.pop();
	}
	public static void main (String [] args) {
		System.out.println("hasil postfix = " + postfixEvaluate_7001("5 2 5 * + 7 -"));
	}

}