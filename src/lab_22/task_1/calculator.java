package lab_22.task_1;

import java.util.Scanner;

public class calculator {

    private static boolean IsOperand(char ch){
        return (ch >= '0' && ch <= '9');
    }

    public static float EvaluatePostfix(String postfix)
    {
        Stack stack = new Stack(postfix.length());
        float result = 0;
        float temp = 0;
        int i = 0;
        while (i != postfix.length())
        {
            while (postfix.charAt(i) == ' ' || postfix.charAt(i) == '\t')
                i++;
            if (IsOperand(postfix.charAt(i)))
            {
                int num = 0;
                while (IsOperand(postfix.charAt(i)))
                {
                    num = num * 10 + postfix.charAt(i) - 48;
                    i++;
                }
                stack.push(num);
            }
		else
            {
                float op1 = stack.pop();
                float op2 = stack.pop();
                if (postfix.charAt(i) == '+') result = op2 + op1;
			else if (postfix.charAt(i) == '-') result = op2 - op1;
			else if (postfix.charAt(i) == '/') result = op2 / op1;
			else if (postfix.charAt(i) == '*') result = op2 * op1;
                stack.push(result);
                temp += result;
            }
            i++;
        }
        result = stack.pop();
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter postfix: "); //1 2 + 3 * 6 +
        System.out.println("Result: " + EvaluatePostfix(in.nextLine()));
    }
}
