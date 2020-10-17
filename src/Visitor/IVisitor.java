package Visitor;
import Token.Operand;
import Token.Operator;

public interface IVisitor {
    void visit(Operand operand);

    void visit(Operator operator);

    void pushOperand(Operand operand);

    void pushOperator(Operator operator);
}
