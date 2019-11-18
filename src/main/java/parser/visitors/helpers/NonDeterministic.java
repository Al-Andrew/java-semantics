package parser.visitors.helpers;

import grammar.alkParser;
import parser.env.Environment;
import parser.exceptions.AlkException;
import parser.types.AlkIterableValue;
import parser.types.AlkValue;
import parser.types.alkBool.AlkBool;
import parser.types.alkInt.AlkInt;
import parser.visitors.expression.ExpressionVisitor;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

import static parser.exceptions.AlkException.*;

public class NonDeterministic {

    // generated random value
    public static AlkInt getRandom(AlkValue valmax) throws AlkException {
        if (!valmax.type.equals("Int"))
            throw new AlkException(ERR_RANDOM_INT);
        AlkInt intValue = (AlkInt) valmax;
        Random rand = new Random();
        BigInteger result = new BigInteger(intValue.value.bitLength(), rand);
        while( result.compareTo(intValue.value) >= 0 ) {
            result = new BigInteger(intValue.value.bitLength(), rand);
        }
        return new AlkInt(result);
    }

    public static AlkValue choose(AlkIterableValue struct) {
        ArrayList array = struct.toArray();
        Random rand = new Random();
        int poz = rand.nextInt(array.size());
        //Parsing.callRandom(new BigInteger(String.valueOf(array.size())));
        return (AlkValue) array.get(poz);
    }

    public static AlkValue chooseST(String id, AlkIterableValue struct, alkParser.ExpressionContext expression, Environment env) throws AlkException {
        ExpressionVisitor expressionVisitor = new ExpressionVisitor(env);
        ArrayList array = struct.toArray();

        while (array.size()>0) {
            Random rand = new Random();
            int poz = rand.nextInt(array.size());
            AlkValue value = (AlkValue) array.get(poz);
            env.update(id, value);
            AlkValue result = (AlkValue) expressionVisitor.visit(expression);
            if (!result.type.equals("Bool"))
                throw new AlkException(ERR_CHOSE_ST_BOOL);
            AlkBool ok = (AlkBool) result;
            if (ok.getValue())
                return value;
            array.remove(poz);
        }
        throw new AlkException(ERR_CHOSE_RESULT);
    }
}