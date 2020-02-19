package org.jalafundation;

public class Token {
    public String value;
    public KindToken kind;

    public Token(String value, KindToken kind) {
        this.value = value;
        this.kind = kind;
    }
}
