package execution.state.statement;

import execution.ExecutionResult;
import execution.state.ExecutionState;
import grammar.alkParser;
import parser.exceptions.ContinueException;
import util.CtxState;
import util.Payload;

@CtxState(ctxClass = alkParser.ContinueStmtContext.class)
public class ContinueState extends ExecutionState
{
    alkParser.ContinueStmtContext ctx;

    public ContinueState(alkParser.ContinueStmtContext ctx, Payload payload)
    {
        super(ctx, payload);
        this.ctx = ctx;
    }

    @Override
    public ExecutionState makeStep()
    {
        throw new ContinueException("Can't continue while not in a looping scope.");
    }

    @Override
    public void assign(ExecutionResult result)
    {
        // no-op
    }

    @Override
    public ExecutionState clone(Payload payload)
    {
        ContinueState copy = new ContinueState(ctx, payload);
        return super.decorate(copy);
    }
}