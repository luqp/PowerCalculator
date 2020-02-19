package org.jalafundation;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Insert expresion to evaluate:");
//        String text = input.nextLine();
//        System.out.println("Result:");

        ParserToken parser = new ParserToken("1 + 1");

        BinaryExpression expression = parser.Parse();
        Evaluator evaluator = new Evaluator();

        int result = evaluator.evaluateExpression(expression);
        System.out.println(result);
    }
}
