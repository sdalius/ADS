package Token;

import Visitor.Visitor;

public class Operator extends Token {
    private int type;

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
