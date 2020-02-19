package org.jalafundation;

import java.security.SecureRandom;

public class LexerText {
    private String text;
    private int position;

    public LexerText(String text) {

        this.text = text;
    }

    private char getCurrent() {
        if (position >= text.length()) {
            return '\u0000';
        }
        return text.charAt(position);
    }

    private void next() {
        position++;
    }

    public Token NextToken() {
        if (position == text.length()) {
            return new Token("\n0000", KindToken.ENDTOKEN);
        }

        if (Character.isDigit(getCurrent())) {
            int start = position;
            while (Character.isDigit(getCurrent())) {
                next();
            }
            String number = text.substring(start, position);
            return new Token(number, KindToken.NUMBERTOKEN);
        }

        if (Character.isWhitespace(getCurrent())) {
            int start = position;
            while (Character.isDigit(getCurrent())) {
                next();
            }
            String whiteSpaces = text.substring(start, position);
            return new Token(whiteSpaces, KindToken.WHITESPACETOKEN);
        }

        switch (getCurrent()) {
            case '+':
                return new Token("+", KindToken.ADDITIONTOKEN);
            case '-':
                return new Token("-", KindToken.SUBTRACTIONTOKEN);
            case '*':
                return new Token("*", KindToken.MULTIPLICATIONTOKEN);
            case '/':
                return new Token("/", KindToken.DIVISIONTOKEN);
            default:
                return new Token("Invalid", KindToken.INVALIDTOKEN);
        }
    }
}
