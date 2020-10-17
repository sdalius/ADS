package Client;

import Token.Token;
import Visitor.Visitor;

public class Client {

    private Visitor visitor;
    private Token token;

    public void useClient()
    {
        visitor = new Visitor();
        token.accept(visitor);
    }
}
