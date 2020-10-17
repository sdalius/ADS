package Token;

import Visitor.Visitor;

public class Operand extends Token {
    private int value;

    public Operand(int value) {
        this.value = value;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
