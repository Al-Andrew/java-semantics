package execution.types.alkInt;

import execution.parser.exceptions.AlkException;
import execution.parser.exceptions.InterpretorException;
import execution.types.AlkValue;
import execution.types.alkBool.AlkBool;
import execution.types.alkFloat.AlkFloat;
import execution.types.alkString.AlkString;

import java.math.BigDecimal;
import java.math.BigInteger;

import static execution.parser.exceptions.AlkException.*;
import static execution.parser.exceptions.InterpretorException.ERR_VALUE_TYPE_UNRECOGNIZED;

public class EqualityIntHelper {
    private BigInteger value;

    EqualityIntHelper(BigInteger value)
    {
        this.value = value;
    }

    AlkBool equal(AlkValue operand) throws AlkException, InterpretorException
    {
        if (operand.isDataStructure)
            throw new AlkException(ERR_EQUAL_DATA_STRUCTURE);
        switch(operand.type)
        {
            case "Int": return equal(((AlkInt)operand));
            case "Double": return equal((AlkFloat)operand);
            case "String": return equal((AlkString)operand);
            case "Bool": return equal((AlkBool)operand);
        }
        throw new InterpretorException(ERR_VALUE_TYPE_UNRECOGNIZED);
    }

    private AlkBool equal(AlkInt operand)
    {
        return new AlkBool(value.compareTo(operand.value) == 0);
    }

    private AlkBool equal(AlkFloat operand)
    {
        return new AlkBool(new BigDecimal(value).compareTo(operand.value)==0);
    }

    private AlkBool equal(AlkBool operand) throws AlkException {
        throw new AlkException(ERR_EQUAL_BOOL);
    }

    private AlkBool equal(AlkString operand) throws AlkException {
        throw new AlkException(ERR_EQUAL_STRING);
    }


    AlkValue notequal(AlkValue operand) throws AlkException, InterpretorException
    {
        if (operand.isDataStructure)
            throw new AlkException(ERR_NOTEQUAL_DATA_STRUCTURE);
        switch(operand.type)
        {
            case "Int": return notequal(((AlkInt)operand));
            case "Double": return notequal((AlkFloat)operand);
            case "String": return notequal((AlkString)operand);
            case "Bool": return notequal((AlkBool)operand);
        }
        throw new InterpretorException(ERR_VALUE_TYPE_UNRECOGNIZED);
    }

    private AlkBool notequal(AlkInt operand)
    {

        return new AlkBool(value.compareTo(operand.value) != 0);
    }

    private AlkBool notequal(AlkFloat operand)
    {
        return new AlkBool(new BigDecimal(value).compareTo(operand.value) != 0);
    }

    private AlkBool notequal(AlkBool operand) throws AlkException {
        throw new AlkException(ERR_NOTEQUAL_BOOL);
    }

    private AlkBool notequal(AlkString operand) throws AlkException {
        throw new AlkException(ERR_NOTEQUAL_STRING);
    }
}
