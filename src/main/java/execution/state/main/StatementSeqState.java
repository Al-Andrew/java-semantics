package execution.state.main;

import execution.state.IndependentGeneratorState;
import grammar.alkParser;
import parser.visitors.StmtVisitor;
import util.CtxState;
import util.Payload;

@CtxState(ctxClass = alkParser.StatementSeqContext.class)
public class StatementSeqState extends IndependentGeneratorState
{
    public StatementSeqState(alkParser.StatementSeqContext tree, Payload payload)
    {
        super(tree, payload, tree.statement(), StmtVisitor.class);
    }
}