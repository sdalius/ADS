package Visitor;

import Token.Operand;
import Token.Operator;

import java.util.LinkedList;

public class Visitor<E> implements IVisitor {

    private LinkedList<E> stack = new LinkedList<>();

    public void visit (Operator operator)
    {
        operator.accept(this);
    }

    @Override
    public void visit(Operand operand) {
        operand.accept(this);

    }

    public void pushOperand(Operand operand)
    {
        stack.push((E) operand);
    }

    public void pushOperator(Operator operator)
    {
        stack.push((E) operator);
    }
}
