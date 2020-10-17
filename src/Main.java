import Client.Client;
import Token.*;
import Visitor.Visitor;

public class Main {

    public static void main(String[] args) {
        Client cl = new Client();
        cl.useClient();

        Visitor vs = new Visitor();
        Operand op1 = new Operand(6);
        Operand op2= new Operand(4);
        Operand op3 = new Operand(2);
        Operand op4 = new Operand(3);
        Operand op5 = new Operand(6);
        vs.pushOperand(op1);
        vs.pushOperand(op2);

        vs.pushOperator(new Operator());

    }
}
