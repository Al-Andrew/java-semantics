package dataflow.domain;

import dataflow.Domain;
import execution.parser.exceptions.AlkException;
import symbolic.OverdefinedValue;
import symbolic.CPValue;
import symbolic.UndefinedValue;
import util.exception.InternalException;
import util.types.Storable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class VarValue implements Domain
{
    private static Set<String> allVars = new HashSet<>();

    public static VarValue getAllOverdefined()
    {
        Map<String, CPValue> mapping = new HashMap<>();
        allVars.forEach((var) -> mapping.put(var, new OverdefinedValue()));
        return new VarValue(mapping);
    }

    public static VarValue getAllUnderdefined()
    {
        Map<String, CPValue> mapping = new HashMap<>();
        allVars.forEach((var) -> mapping.put(var, new UndefinedValue()));
        return new VarValue(mapping);
    }

    public static void build(Set<String> vars)
    {
        allVars.addAll(vars);
    }

    private Map<String, CPValue> mapping = new HashMap<>();

    public VarValue(Map<String, CPValue> mapping)
    {
        this.mapping.putAll(mapping);
    }

    public VarValue join(VarValue varValue) {
        VarValue result = new VarValue(mapping);
        for (String var : allVars)
        {
            result.put(var, varValue.mapping.get(var));
        }

        return result;
    }

    public VarValue meet(VarValue varValue)
    {
        Map<String, CPValue> ans = new HashMap<>();

        allVars.forEach((var) -> {
            CPValue now = mapping.get(var);
            CPValue next = varValue.mapping.get(var);

            if (now instanceof OverdefinedValue)
                ans.put(var, next);
            else if (now instanceof UndefinedValue)
                ans.put(var, now);
            else if (next instanceof OverdefinedValue)
                ans.put(var, now);
            else
                ans.put(var, new UndefinedValue());
        });

        return new VarValue(ans);
    }

    public boolean lower(VarValue varValue)
    {
        for (String var : allVars)
        {
            CPValue now = mapping.get(var);
            CPValue next = varValue.mapping.get(var);

            if ((now instanceof UndefinedValue) || (next instanceof OverdefinedValue))
                continue;

            if ((now instanceof OverdefinedValue) || (next instanceof UndefinedValue))
            {
                return false;
            }

            try
            {
                if (!now.equals(next))
                    return false;
            }
            catch (AlkException e)
            {
                return false;
            }
        }

        return true;
    }

    public void put(String var, CPValue value)
    {
        if (!allVars.contains(var))
            throw new InternalError("Can't put an unknown variable in VarValue.");

        if (value instanceof UndefinedValue)
            return;

        CPValue now = mapping.get(var);
        if (now instanceof UndefinedValue)
        {
            mapping.put(var, value);
        }
        else if (value instanceof OverdefinedValue)
        {
            mapping.put(var, new OverdefinedValue());
        }
        else
        {
            try
            {
                if (!now.equals(value))
                {
                    mapping.put(var, new OverdefinedValue());
                }
            }
            catch(AlkException e)
            {
                mapping.put(var, new OverdefinedValue());
            }

        }
    }

    public Storable getValue(String id)
    {
        if (!allVars.contains(id))
        {
            throw new InternalException("Unidentified variable when getting value");
        }
        return mapping.get(id);
    }

    @Override
    public String toString()
    {
        if (mapping.isEmpty())
            return "{ }";

        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Map.Entry<String, CPValue> entry : mapping.entrySet())
        {
            sb.append("(").append(entry.getKey()).append(" -> ").append(entry.getValue()).append(")").append(", ");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        sb.append("}");
        return sb.toString();
    }
}
