package org.jalafundation;

import java.util.ArrayList;
import java.util.List;

public class BinaryExpression {

    private Token left;
    private Token operator;
    private Token right;

    public BinaryExpression(Token left, Token operator, Token right) {

        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    public Token getLeft() {
        return left;
    }

    public Token getOperator() {
        return operator;
    }

    public Token getRight() {
        return right;
    }
}
