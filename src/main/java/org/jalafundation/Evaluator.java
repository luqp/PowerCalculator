package org.jalafundation;

public class Evaluator {

    public Integer evaluateExpression(BinaryExpression expression) {
        int left = Integer.parseInt(expression.getLeft().value);
        Token operand = expression.getOperator();
        int right = Integer.parseInt(expression.getRight().value);


        switch (operand.kind)
        {
            case ADDITIONTOKEN:
                return left + right;
            case SUBTRACTIONTOKEN:
                return left + right;
            case MULTIPLICATIONTOKEN:
                return left + right;
            case DIVISIONTOKEN:
                return left + right;
            default:
                throw new ArithmeticException("Unexpected operator");
        }

    }
}
