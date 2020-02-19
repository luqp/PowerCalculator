package org.jalafundation;

import java.util.ArrayList;
import java.util.List;

public class ParserToken {

    private ArrayList<Token> tokens;
    private int position;

    public ParserToken(String text) {

        List<Token> tokens = new ArrayList<Token>();
        LexerText lexer = new LexerText(text);
        Token token;
        do {
            token = lexer.NextToken();
            if (token.kind != KindToken.WHITESPACETOKEN
                    && token.kind != KindToken.INVALIDTOKEN) {
                tokens.add(token);
            }
        } while (token.kind != KindToken.ENDTOKEN);
    }

    private Token peek(int offset) {
        int index = position + offset;
        if (index >= tokens.size()) {
            return tokens.get(tokens.size() - 1);
        }
        return tokens.get(index);
    }

    private  Token getCurrent() {
        return  peek(0);
    }

    private Token nextToken() {
        Token current = getCurrent();
        position++;
        return current;
    }

    public BinaryExpression Parse() {
        Token left = nextToken();
        Token operator = nextToken();
        Token right = nextToken();
        return new BinaryExpression(left, operator, right);
    }

}
