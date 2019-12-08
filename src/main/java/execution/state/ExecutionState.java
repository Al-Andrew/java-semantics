package execution.state;

import execution.ExecutionResult;
import grammar.alkBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.env.Environment;
import parser.types.AlkValue;
import util.Configuration;
import util.EnvironmentManager;
import util.Payload;
import util.types.Value;

/**
 * TODO: make execution state independent from the visitor: use a the execution stack for global configurations
 * @param <T>
 *        What does the execution state return
 * @param <S>
 *        The type of value which will be dependent upon
 */
public abstract class ExecutionState<T extends Value, S extends Value>
{
    protected ParseTree tree;

    // TODO: remove the visitor as global instance (not everybody needs a visitor
    // TODO: it shouldn't be initialized in the constructor (there is no unique visitor for one state
    protected alkBaseVisitor visitor;

    protected ExecutionResult<T> result = null;
    protected Configuration config;
    protected Payload payload;

    // TODO: remove the env variable, make it accessible in another way
    @Deprecated
    protected Environment env;

    public ExecutionState(ParseTree tree, alkBaseVisitor visitor)
    {
        this.tree = tree;
        this.visitor = visitor;
    }

    public ExecutionState(ParseTree tree, Payload payload)
    {
        this.tree = tree;
        this.payload = payload;
    }

    public ExecutionState(Environment env)
    {
        this.env = env;
    }

    public ExecutionResult<T> getResult()
    {
        return result;
    }

    public abstract ExecutionState<S, ? extends Value> makeStep();

    public abstract void assign(ExecutionResult<S> result);

    protected Environment getEnv()
    {
        //TODO: for backward compatibility we keep the env variable, remove the if check when porting to the newest version
        if (payload != null)
        {
            return payload.getEnvManager().getEnv(this);
        }
        return env;
    }

    protected void setEnv(Environment e)
    {
        env = e;
    }

    public void setConfiguration(Configuration config) {
        this.config = config;
    }
}
